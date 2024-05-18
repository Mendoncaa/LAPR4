// Generated from CostumerRequirements.g4 by ANTLR 4.13.1
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
	 * Visit a parse tree produced by {@link CostumerRequirementsParser#requirements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirements(CostumerRequirementsParser.RequirementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CostumerRequirementsParser#requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement(CostumerRequirementsParser.RequirementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CostumerRequirementsParser#requirementsType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirementsType(CostumerRequirementsParser.RequirementsTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CostumerRequirementsParser#arr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr(CostumerRequirementsParser.ArrContext ctx);
}