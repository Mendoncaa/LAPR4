// Generated from C:/Users/David/Desktop/SEM4PI/sem4pi-23-24-2dj4/jobs4u.core/src/main/java/jobs4u/antlr4/grammar/CostumerRequirements.g4 by ANTLR 4.13.1
package jobs4u.antlr4.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CostumerRequirementsParser}.
 */
public interface CostumerRequirementsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CostumerRequirementsParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CostumerRequirementsParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CostumerRequirementsParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CostumerRequirementsParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CostumerRequirementsParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(CostumerRequirementsParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CostumerRequirementsParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(CostumerRequirementsParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CostumerRequirementsParser#requirement}.
	 * @param ctx the parse tree
	 */
	void enterRequirement(CostumerRequirementsParser.RequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CostumerRequirementsParser#requirement}.
	 * @param ctx the parse tree
	 */
	void exitRequirement(CostumerRequirementsParser.RequirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CostumerRequirementsParser#reqType}.
	 * @param ctx the parse tree
	 */
	void enterReqType(CostumerRequirementsParser.ReqTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CostumerRequirementsParser#reqType}.
	 * @param ctx the parse tree
	 */
	void exitReqType(CostumerRequirementsParser.ReqTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CostumerRequirementsParser#trueFalseReq}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseReq(CostumerRequirementsParser.TrueFalseReqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CostumerRequirementsParser#trueFalseReq}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseReq(CostumerRequirementsParser.TrueFalseReqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CostumerRequirementsParser#shortAReq}.
	 * @param ctx the parse tree
	 */
	void enterShortAReq(CostumerRequirementsParser.ShortAReqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CostumerRequirementsParser#shortAReq}.
	 * @param ctx the parse tree
	 */
	void exitShortAReq(CostumerRequirementsParser.ShortAReqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CostumerRequirementsParser#intReq}.
	 * @param ctx the parse tree
	 */
	void enterIntReq(CostumerRequirementsParser.IntReqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CostumerRequirementsParser#intReq}.
	 * @param ctx the parse tree
	 */
	void exitIntReq(CostumerRequirementsParser.IntReqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CostumerRequirementsParser#choiceReq}.
	 * @param ctx the parse tree
	 */
	void enterChoiceReq(CostumerRequirementsParser.ChoiceReqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CostumerRequirementsParser#choiceReq}.
	 * @param ctx the parse tree
	 */
	void exitChoiceReq(CostumerRequirementsParser.ChoiceReqContext ctx);
}