// Generated from CandidateRequirements.g4 by ANTLR 4.13.1
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
	 * Visit a parse tree produced by {@link CandidateRequirementsParser#responses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResponses(CandidateRequirementsParser.ResponsesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CandidateRequirementsParser#response}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResponse(CandidateRequirementsParser.ResponseContext ctx);
}