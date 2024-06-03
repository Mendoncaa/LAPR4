// Generated from C:/Users/David/Desktop/SEM4PI/sem4pi-23-24-2dj4/jobs4u.core/src/main/java/jobs4u/antlr4/grammar/CandidateRequirements.g4 by ANTLR 4.13.1
package jobs4u.antlr4.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CandidateRequirementsParser}.
 */
public interface CandidateRequirementsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CandidateRequirementsParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CandidateRequirementsParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CandidateRequirementsParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CandidateRequirementsParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CandidateRequirementsParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(CandidateRequirementsParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CandidateRequirementsParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(CandidateRequirementsParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CandidateRequirementsParser#requirement}.
	 * @param ctx the parse tree
	 */
	void enterRequirement(CandidateRequirementsParser.RequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CandidateRequirementsParser#requirement}.
	 * @param ctx the parse tree
	 */
	void exitRequirement(CandidateRequirementsParser.RequirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CandidateRequirementsParser#reqType}.
	 * @param ctx the parse tree
	 */
	void enterReqType(CandidateRequirementsParser.ReqTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CandidateRequirementsParser#reqType}.
	 * @param ctx the parse tree
	 */
	void exitReqType(CandidateRequirementsParser.ReqTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CandidateRequirementsParser#trueFalseReq}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseReq(CandidateRequirementsParser.TrueFalseReqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CandidateRequirementsParser#trueFalseReq}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseReq(CandidateRequirementsParser.TrueFalseReqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CandidateRequirementsParser#shortAReq}.
	 * @param ctx the parse tree
	 */
	void enterShortAReq(CandidateRequirementsParser.ShortAReqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CandidateRequirementsParser#shortAReq}.
	 * @param ctx the parse tree
	 */
	void exitShortAReq(CandidateRequirementsParser.ShortAReqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CandidateRequirementsParser#intReq}.
	 * @param ctx the parse tree
	 */
	void enterIntReq(CandidateRequirementsParser.IntReqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CandidateRequirementsParser#intReq}.
	 * @param ctx the parse tree
	 */
	void exitIntReq(CandidateRequirementsParser.IntReqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CandidateRequirementsParser#choiceReq}.
	 * @param ctx the parse tree
	 */
	void enterChoiceReq(CandidateRequirementsParser.ChoiceReqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CandidateRequirementsParser#choiceReq}.
	 * @param ctx the parse tree
	 */
	void exitChoiceReq(CandidateRequirementsParser.ChoiceReqContext ctx);
}