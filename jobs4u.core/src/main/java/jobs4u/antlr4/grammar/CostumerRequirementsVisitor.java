// Generated from C:/Users/David/Desktop/SEM4PI/sem4pi-23-24-2dj4/jobs4u.core/src/main/java/jobs4u/antlr4/grammar/CostumerRequirements.g4 by ANTLR 4.13.1
package jobs4u.antlr4.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CostumerRequirementsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CostumerRequirementsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CostumerRequirementsParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(CostumerRequirementsParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link CostumerRequirementsParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(CostumerRequirementsParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link CostumerRequirementsParser#requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement(CostumerRequirementsParser.RequirementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CostumerRequirementsParser#reqType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReqType(CostumerRequirementsParser.ReqTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CostumerRequirementsParser#trueFalseReq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseReq(CostumerRequirementsParser.TrueFalseReqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CostumerRequirementsParser#shortAReq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortAReq(CostumerRequirementsParser.ShortAReqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CostumerRequirementsParser#intReq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntReq(CostumerRequirementsParser.IntReqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CostumerRequirementsParser#choiceReq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoiceReq(CostumerRequirementsParser.ChoiceReqContext ctx);
}