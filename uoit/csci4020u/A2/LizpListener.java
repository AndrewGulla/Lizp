// Generated from Lizp.g4 by ANTLR 4.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LizpParser}.
 */
public interface LizpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LizpParser#conExpr}.
	 * @param ctx the parse tree
	 */
	void enterConExpr(@NotNull LizpParser.ConExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizpParser#conExpr}.
	 * @param ctx the parse tree
	 */
	void exitConExpr(@NotNull LizpParser.ConExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link LizpParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(@NotNull LizpParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizpParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(@NotNull LizpParser.AndExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link LizpParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull LizpParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizpParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull LizpParser.AtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link LizpParser#naryExpr}.
	 * @param ctx the parse tree
	 */
	void enterNaryExpr(@NotNull LizpParser.NaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizpParser#naryExpr}.
	 * @param ctx the parse tree
	 */
	void exitNaryExpr(@NotNull LizpParser.NaryExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link LizpParser#relOp}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(@NotNull LizpParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizpParser#relOp}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(@NotNull LizpParser.RelOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link LizpParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(@NotNull LizpParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizpParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(@NotNull LizpParser.BoolExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link LizpParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(@NotNull LizpParser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizpParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(@NotNull LizpParser.UnaryOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link LizpParser#binaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(@NotNull LizpParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizpParser#binaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(@NotNull LizpParser.BinaryExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link LizpParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOp(@NotNull LizpParser.BinaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizpParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOp(@NotNull LizpParser.BinaryOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link LizpParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelExpr(@NotNull LizpParser.RelExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizpParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelExpr(@NotNull LizpParser.RelExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link LizpParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(@NotNull LizpParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizpParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(@NotNull LizpParser.OrExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link LizpParser#naryOp}.
	 * @param ctx the parse tree
	 */
	void enterNaryOp(@NotNull LizpParser.NaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizpParser#naryOp}.
	 * @param ctx the parse tree
	 */
	void exitNaryOp(@NotNull LizpParser.NaryOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link LizpParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(@NotNull LizpParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizpParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(@NotNull LizpParser.IfExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link LizpParser#printExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(@NotNull LizpParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizpParser#printExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(@NotNull LizpParser.PrintExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link LizpParser#sExp}.
	 * @param ctx the parse tree
	 */
	void enterSExp(@NotNull LizpParser.SExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizpParser#sExp}.
	 * @param ctx the parse tree
	 */
	void exitSExp(@NotNull LizpParser.SExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link LizpParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(@NotNull LizpParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizpParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(@NotNull LizpParser.UnaryExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link LizpParser#condExpr}.
	 * @param ctx the parse tree
	 */
	void enterCondExpr(@NotNull LizpParser.CondExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizpParser#condExpr}.
	 * @param ctx the parse tree
	 */
	void exitCondExpr(@NotNull LizpParser.CondExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link LizpParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull LizpParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizpParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull LizpParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link LizpParser#arithExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithExpr(@NotNull LizpParser.ArithExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizpParser#arithExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithExpr(@NotNull LizpParser.ArithExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link LizpParser#bindExpr}.
	 * @param ctx the parse tree
	 */
	void enterBindExpr(@NotNull LizpParser.BindExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizpParser#bindExpr}.
	 * @param ctx the parse tree
	 */
	void exitBindExpr(@NotNull LizpParser.BindExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link LizpParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(@NotNull LizpParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LizpParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(@NotNull LizpParser.NotExprContext ctx);
}