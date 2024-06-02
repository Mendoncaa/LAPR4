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
	 * Visit a parse tree produced by {@link CandidateRequirementsParser#requirements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirements(CandidateRequirementsParser.RequirementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CandidateRequirementsParser#requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement(CandidateRequirementsParser.RequirementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CandidateRequirementsParser#answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswer(CandidateRequirementsParser.AnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CandidateRequirementsParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(CandidateRequirementsParser.TextContext ctx);
}