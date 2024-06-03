// Generated from C:/Users/David/Desktop/SEM4PI/sem4pi-23-24-2dj4/jobs4u.core/src/main/java/jobs4u/antlr4/grammar/CandidateRequirements.g4 by ANTLR 4.13.1
package jobs4u.antlr4.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CandidateRequirementsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CandidateRequirementsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CandidateRequirementsParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(CandidateRequirementsParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link CandidateRequirementsParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(CandidateRequirementsParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link CandidateRequirementsParser#requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement(CandidateRequirementsParser.RequirementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CandidateRequirementsParser#reqType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReqType(CandidateRequirementsParser.ReqTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CandidateRequirementsParser#trueFalseReq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseReq(CandidateRequirementsParser.TrueFalseReqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CandidateRequirementsParser#shortAReq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortAReq(CandidateRequirementsParser.ShortAReqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CandidateRequirementsParser#intReq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntReq(CandidateRequirementsParser.IntReqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CandidateRequirementsParser#choiceReq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoiceReq(CandidateRequirementsParser.ChoiceReqContext ctx);
}