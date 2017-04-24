// Generated from Nihao.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NihaoParser}.
 */
public interface NihaoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NihaoParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(NihaoParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link NihaoParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(NihaoParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link NihaoParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(NihaoParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link NihaoParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(NihaoParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link NihaoParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(NihaoParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link NihaoParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(NihaoParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link NihaoParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(NihaoParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NihaoParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(NihaoParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NihaoParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(NihaoParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link NihaoParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(NihaoParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link NihaoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(NihaoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NihaoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(NihaoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NihaoParser#datatype_assignment}.
	 * @param ctx the parse tree
	 */
	void enterDatatype_assignment(NihaoParser.Datatype_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NihaoParser#datatype_assignment}.
	 * @param ctx the parse tree
	 */
	void exitDatatype_assignment(NihaoParser.Datatype_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NihaoParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(NihaoParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NihaoParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(NihaoParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NihaoParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(NihaoParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NihaoParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(NihaoParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NihaoParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(NihaoParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NihaoParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(NihaoParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NihaoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(NihaoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NihaoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(NihaoParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NihaoParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(NihaoParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NihaoParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(NihaoParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NihaoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(NihaoParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link NihaoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(NihaoParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link NihaoParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(NihaoParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link NihaoParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(NihaoParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link NihaoParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(NihaoParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NihaoParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(NihaoParser.FactorContext ctx);
}