// Generated from /home/yan/IdeaProjects/OwnLanguageTest/src/main/java/Language/MyLanguage.g4 by ANTLR 4.8
package Language.ANTLRGenerated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLanguageParser}.
 */
interface MyLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(MyLanguageParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(MyLanguageParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#fun}.
	 * @param ctx the parse tree
	 */
	void enterFun(MyLanguageParser.FunContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#fun}.
	 * @param ctx the parse tree
	 */
	void exitFun(MyLanguageParser.FunContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#fun_call}.
	 * @param ctx the parse tree
	 */
	void enterFun_call(MyLanguageParser.Fun_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#fun_call}.
	 * @param ctx the parse tree
	 */
	void exitFun_call(MyLanguageParser.Fun_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#args_decl}.
	 * @param ctx the parse tree
	 */
	void enterArgs_decl(MyLanguageParser.Args_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#args_decl}.
	 * @param ctx the parse tree
	 */
	void exitArgs_decl(MyLanguageParser.Args_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#args_call}.
	 * @param ctx the parse tree
	 */
	void enterArgs_call(MyLanguageParser.Args_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#args_call}.
	 * @param ctx the parse tree
	 */
	void exitArgs_call(MyLanguageParser.Args_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MyLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MyLanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(MyLanguageParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(MyLanguageParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Factorial}
	 * labeled alternative in {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFactorial(MyLanguageParser.FactorialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Factorial}
	 * labeled alternative in {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFactorial(MyLanguageParser.FactorialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Abs}
	 * labeled alternative in {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAbs(MyLanguageParser.AbsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Abs}
	 * labeled alternative in {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAbs(MyLanguageParser.AbsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(MyLanguageParser.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(MyLanguageParser.BracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunCall}
	 * labeled alternative in {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunCall(MyLanguageParser.FunCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunCall}
	 * labeled alternative in {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunCall(MyLanguageParser.FunCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(MyLanguageParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(MyLanguageParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(MyLanguageParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(MyLanguageParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Num}
	 * labeled alternative in {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNum(MyLanguageParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNum(MyLanguageParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterId(MyLanguageParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitId(MyLanguageParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(MyLanguageParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(MyLanguageParser.EndContext ctx);
}