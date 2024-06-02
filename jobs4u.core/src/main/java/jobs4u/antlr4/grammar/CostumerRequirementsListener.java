// Generated from C:/Users/David/Desktop/SEM4PI/sem4pi-23-24-2dj4/jobs4u.core/src/main/java/jobs4u/antlr4/grammar/CostumerRequirements.g4 by ANTLR 4.13.1
package jobs4u.antlr4.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CostumerRequirementsParser}.
 */
public interface CostumerRequirementsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CostumerRequirementsParser#requirements}.
	 * @param ctx the parse tree
	 */
	void enterRequirements(CostumerRequirementsParser.RequirementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CostumerRequirementsParser#requirements}.
	 * @param ctx the parse tree
	 */
	void exitRequirements(CostumerRequirementsParser.RequirementsContext ctx);
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
	 * Enter a parse tree produced by {@link CostumerRequirementsParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(CostumerRequirementsParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link CostumerRequirementsParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(CostumerRequirementsParser.TextContext ctx);
}