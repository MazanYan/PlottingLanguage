// Generated from /home/yan/IdeaProjects/OwnLanguageTest/src/main/java/Language/MyLanguage.g4 by ANTLR 4.8
package Language.ANTLRGenerated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface MyLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(MyLanguageParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun(MyLanguageParser.FunContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#fun_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_call(MyLanguageParser.Fun_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#args_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs_decl(MyLanguageParser.Args_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#args_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs_call(MyLanguageParser.Args_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MyLanguageParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(MyLanguageParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Factorial}
	 * labeled alternative in {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorial(MyLanguageParser.FactorialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Abs}
	 * labeled alternative in {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbs(MyLanguageParser.AbsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(MyLanguageParser.BracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunCall}
	 * labeled alternative in {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCall(MyLanguageParser.FunCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(MyLanguageParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(MyLanguageParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(MyLanguageParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(MyLanguageParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(MyLanguageParser.EndContext ctx);
}