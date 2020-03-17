package Language;

import Language.ANTLRGenerated.MyLanguageParser;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.json.simple.*;
import Language.ANTLRGenerated.MyLanguageBaseVisitor;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

class JSONGenerator extends MyLanguageBaseVisitor<JSONArray> {
    private JSONObject parseResult;
    private HashMap<String, Integer> functionsLength = new HashMap<>();
    private Stack<String> calledFunctionsContext = new Stack<>();

    @Override
    public JSONArray visitStart(MyLanguageParser.StartContext ctx) {
        calledFunctionsContext.push("");
        parseResult = new JSONObject();
        List<MyLanguageParser.FunContext> functions = ctx.fun();
        JSONArray functionsProcessed = new JSONArray();
        for (MyLanguageParser.FunContext function: functions) {
            JSONArray functionProcessed = visitFun(function);
            functionsProcessed = concatArray(functionsProcessed, functionProcessed);
        }
        JSONArray resultArr = visit(ctx.statement());
        parseResult.put("functions", functionsProcessed);
        parseResult.put("final", resultArr);
        return resultArr;
    }

    @Override
    public JSONArray visitFun(MyLanguageParser.FunContext ctx) {
        JSONObject function = new JSONObject();
        String functionName = ctx.ID().getSymbol().getText();
        if (functionsLength.containsKey(functionName))
            throw new ParseCancellationException(String.format("Function '%s' is already declared", functionName));
        function.put("name", functionName);
        calledFunctionsContext.push(functionName);

        MyLanguageParser.Args_declContext args = ctx.args_decl();
        JSONArray argsProcessed = visitArgs_decl(args);
        int argsCount = argsProcessed.size();
        function.put("args", argsProcessed);

        JSONArray statementsProcessed = new JSONArray();
        List<MyLanguageParser.StatementContext> statements =  ctx.statement();
        for (MyLanguageParser.StatementContext statement : statements) {
            JSONArray statementProcessed = visitStatement(statement);
            statementsProcessed = concatArray(statementsProcessed, statementProcessed);
        }
        function.put("statements", statementsProcessed);

        JSONArray result = new JSONArray();
        result.add(function);

        functionsLength.put(functionName, argsCount);
        calledFunctionsContext.pop();
        return result;
    }

    @Override
    public JSONArray visitArgs_decl(MyLanguageParser.Args_declContext ctx) {
        List<TerminalNode> argsDeclared = ctx.ID();
        JSONArray argsProcessed = new JSONArray();
        for (TerminalNode arg : argsDeclared)
            argsProcessed.add(arg.getSymbol().getText());
        return argsProcessed;
    }

    @Override
    public JSONArray visitStatement(MyLanguageParser.StatementContext ctx) {
        JSONArray result = new JSONArray();

        String variableToBeAssigned = ctx.ID().getSymbol().getText();

        JSONArray toAssign = new JSONArray();
        JSONArray statementExpression = visit(ctx.expression());
        toAssign.add(statementExpression);

        JSONObject statementFinal = new JSONObject();
        statementFinal.put("to_be_assigned", variableToBeAssigned);
        statementFinal.put("to_assign", toAssign);
        result.add(statementFinal);
        return result;
    }

    @Override
    public JSONArray visitNumber(MyLanguageParser.NumberContext ctx) {
        JSONArray result = new JSONArray();
        String resultNumber;// = ctx.DOUBLE().getSymbol().getText();
        try {
            resultNumber = ctx.DOUBLE().getSymbol().getText();
        } catch (NullPointerException ignored) {
            resultNumber = ctx.INT().getSymbol().getText();
        }
        result.add(resultNumber);
        return result;
    }

    @Override
    public JSONArray visitBrackets(MyLanguageParser.BracketsContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public JSONArray visitFunCall(MyLanguageParser.FunCallContext ctx) throws ParseCancellationException {
        JSONArray result = new JSONArray();
        String functionToCall;
        try {
            functionToCall = ctx.fun_call().STANDARD_FUNC().getSymbol().getText();
        } catch (NullPointerException ignored) {
            functionToCall = ctx.fun_call().ID().getSymbol().getText();
        }
        MyLanguageParser.Args_callContext argsCalled = ctx.fun_call().args_call();
        JSONArray argsCalledProcessed = visitArgs_call(argsCalled);
        int calledArgsNumber = argsCalledProcessed.size();
        int argsCountCalledFunction;
        try {
            argsCountCalledFunction = functionsLength.get(functionToCall);
        } catch (NullPointerException e) {
            String insideWhichFunction = calledFunctionsContext.peek();
            if (calledFunctionsContext.contains(functionToCall))
                throw new ParseCancellationException(String.format("Recursive call of function '%s' inside function '%s' is not allowed", functionToCall, insideWhichFunction));
            else
                throw new ParseCancellationException(String.format("'%s' is not a function", functionToCall));
        }
        if (argsCountCalledFunction != calledArgsNumber)
            throw new ParseCancellationException(String.format("'%s' has %d arguments, but is called with %d arguments",
                    functionToCall,
                    argsCountCalledFunction,
                    calledArgsNumber));

        JSONObject functionCalled = new JSONObject();
        functionCalled.put("name", functionToCall);
        functionCalled.put("args", argsCalledProcessed);
        result.add(functionCalled);
        return result;
    }

    @Override
    public JSONArray visitArgs_call(MyLanguageParser.Args_callContext ctx) {
        List<ParseTree> children = ctx.children;
        List<ParseTree> nodes = children.stream().filter(el -> !el.getText().equals(",")).collect(Collectors.toList());
        JSONArray result = new JSONArray();
        for (ParseTree node : nodes) {
            JSONArray nodeProcessed = visit(node);
            result = concatArray(result, nodeProcessed);
        }
        return result;
    }

    @Override
    public JSONArray visitTerminal(TerminalNode node) {
        JSONArray result = new JSONArray();
        String name = node.getSymbol().getText();
        String insideWhichFunction = calledFunctionsContext.peek();
        if (name == insideWhichFunction)
            throw new ParseCancellationException(String.format("Recursive call of function '%s' inside function '%s' is not allowed", name, insideWhichFunction));
        result.add(name);
        return result;
        //return super.visitTerminal(node);
    }

    @Override
    public JSONArray visitFun_call(MyLanguageParser.Fun_callContext ctx) {
        JSONArray result = new JSONArray();
        String functionToCall;
        try {
            functionToCall = ctx.ID().getSymbol().getText(); //.fun_call().ID().getSymbol().getText();
        } catch (NullPointerException ignored) {
            functionToCall = ctx.STANDARD_FUNC().getSymbol().getText(); //.fun_call().FUNCTION().getSymbol().getText();
        }
        MyLanguageParser.Args_callContext argsCalled = ctx.args_call(); //.fun_call().args_call();
        JSONArray argsCalledProcessed = visitArgs_call(argsCalled);

        JSONObject functionCalled = new JSONObject();
        functionCalled.put("name", functionToCall);
        functionCalled.put("args", argsCalledProcessed);
        result.add(functionCalled);
        return result;
    }

    @Override
    public JSONArray visitFactorial(MyLanguageParser.FactorialContext ctx) {
        JSONArray result = new JSONArray();
        JSONObject functionCalled = new JSONObject();
        JSONArray args = visit(ctx.expression());
        functionCalled.put("name", "factorial");
        functionCalled.put("args", args);
        result.add(functionCalled);
        return result;
    }

    @Override
    public JSONArray visitAbs(MyLanguageParser.AbsContext ctx) {
        JSONArray result = new JSONArray();
        JSONObject functionCalled = new JSONObject();
        JSONArray args = visit(ctx.expression());
        functionCalled.put("name", "abs");
        functionCalled.put("args", args);
        result.add(functionCalled);
        return result;
    }

    @Override
    public JSONArray visitAddSub(MyLanguageParser.AddSubContext ctx) {
        JSONArray result = new JSONArray();
        JSONObject functionCalled = new JSONObject();
        JSONArray arg1 = visit(ctx.expression(0));
        JSONArray arg2 = visit(ctx.expression(1));
        functionCalled.put("name", ctx.op.getText());
        functionCalled.put("args", concatArray(arg1, arg2));
        result.add(functionCalled);
        return result;
    }

    @Override
    public JSONArray visitMulDiv(MyLanguageParser.MulDivContext ctx) {
        JSONArray result = new JSONArray();
        JSONObject functionCalled = new JSONObject();
        JSONArray arg1 = visit(ctx.expression(0));
        JSONArray arg2 = visit(ctx.expression(1));
        functionCalled.put("name", ctx.op.getText());
        functionCalled.put("args", concatArray(arg1, arg2));
        result.add(functionCalled);
        return result;
    }

    @Override
    public JSONArray visitId(MyLanguageParser.IdContext ctx) {
        JSONArray result = new JSONArray();
        String varName = ctx.ID().getSymbol().getText();
        result.add(varName);
        return result;
    }

    @Override
    public JSONArray visitNum(MyLanguageParser.NumContext ctx) {
        JSONArray result = new JSONArray();
        String resultNumber;// = ctx.DOUBLE().getSymbol().getText();
        try {
            resultNumber = ctx.number().DOUBLE().getSymbol().getText();
        } catch (NullPointerException ignored) {
            resultNumber = ctx.number().INT().getSymbol().getText();
        }
        result.add(resultNumber);
        return result;
    }

    public JSONObject getParseResult() {
        return parseResult;
    }

    private JSONArray concatArray(JSONArray... arrs) {
        JSONArray result = new JSONArray();
        for (JSONArray arr : arrs) {
            for (Object o : arr) {
                result.add(o);
            }
        }
        return result;
    }
}
