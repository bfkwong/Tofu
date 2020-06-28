// Generated from Tofu.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface TofuListener extends ParseTreeListener {
	void enterEqOp(TofuParser.EqOpContext ctx);
	void exitEqOp(TofuParser.EqOpContext ctx);

	void enterUnaryOp(TofuParser.UnaryOpContext ctx);
	void exitUnaryOp(TofuParser.UnaryOpContext ctx);

	void enterCallMemExpression(TofuParser.CallMemExpressionContext ctx);
	void exitCallMemExpression(TofuParser.CallMemExpressionContext ctx);

	void enterLogORExpression(TofuParser.LogORExpressionContext ctx);
	void exitLogORExpression(TofuParser.LogORExpressionContext ctx);

	void enterArgumentList(TofuParser.ArgumentListContext ctx);
	void exitArgumentList(TofuParser.ArgumentListContext ctx);

	void enterMultOp(TofuParser.MultOpContext ctx);
	void exitMultOp(TofuParser.MultOpContext ctx);

	void enterFunDecls(TofuParser.FunDeclsContext ctx);
	void exitFunDecls(TofuParser.FunDeclsContext ctx);

	void enterMultExpression(TofuParser.MultExpressionContext ctx);
	void exitMultExpression(TofuParser.MultExpressionContext ctx);

	void enterUnaryExpression(TofuParser.UnaryExpressionContext ctx);
	void exitUnaryExpression(TofuParser.UnaryExpressionContext ctx);

	void enterPrimaryExpression(TofuParser.PrimaryExpressionContext ctx);
	void exitPrimaryExpression(TofuParser.PrimaryExpressionContext ctx);

	void enterExpression(TofuParser.ExpressionContext ctx);
	void exitExpression(TofuParser.ExpressionContext ctx);

	void enterRelExpression(TofuParser.RelExpressionContext ctx);
	void exitRelExpression(TofuParser.RelExpressionContext ctx);

	void enterAddOp(TofuParser.AddOpContext ctx);
	void exitAddOp(TofuParser.AddOpContext ctx);

	void enterExpStmt(TofuParser.ExpStmtContext ctx);
	void exitExpStmt(TofuParser.ExpStmtContext ctx);

	void enterIterationStmt(TofuParser.IterationStmtContext ctx);
	void exitIterationStmt(TofuParser.IterationStmtContext ctx);

	void enterRelOp(TofuParser.RelOpContext ctx);
	void exitRelOp(TofuParser.RelOpContext ctx);

	void enterPrintStmt(TofuParser.PrintStmtContext ctx);
	void exitPrintStmt(TofuParser.PrintStmtContext ctx);

	void enterLogANDExpression(TofuParser.LogANDExpressionContext ctx);
	void exitLogANDExpression(TofuParser.LogANDExpressionContext ctx);

	void enterR(TofuParser.RContext ctx);
	void exitR(TofuParser.RContext ctx);

	void enterEqExpression(TofuParser.EqExpressionContext ctx);
	void exitEqExpression(TofuParser.EqExpressionContext ctx);

	void enterIfStmt(TofuParser.IfStmtContext ctx);
	void exitIfStmt(TofuParser.IfStmtContext ctx);

	void enterAddExpression(TofuParser.AddExpressionContext ctx);
	void exitAddExpression(TofuParser.AddExpressionContext ctx);

	void enterBlockStmt(TofuParser.BlockStmtContext ctx);
	void exitBlockStmt(TofuParser.BlockStmtContext ctx);

	void enterParameterList(TofuParser.ParameterListContext ctx);
	void exitParameterList(TofuParser.ParameterListContext ctx);

	void enterArguments(TofuParser.ArgumentsContext ctx);
	void exitArguments(TofuParser.ArgumentsContext ctx);

	void enterStmt(TofuParser.StmtContext ctx);
	void exitStmt(TofuParser.StmtContext ctx);
}