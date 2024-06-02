// Generated from C:/Users/David/Desktop/SEM4PI/sem4pi-23-24-2dj4/jobs4u.core/src/main/java/jobs4u/antlr4/grammar/CandidateRequirements.g4 by ANTLR 4.13.1
package jobs4u.antlr4.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CandidateRequirementsParser}.
 */
public interface CandidateRequirementsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CandidateRequirementsParser#requirements}.
	 * @param ctx the parse tree
	 */
	void enterRequirements(CandidateRequirementsParser.RequirementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CandidateRequirementsParser#requirements}.
	 * @param ctx the parse tree
	 */
	void exitRequirements(CandidateRequirementsParser.RequirementsContext ctx);
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
	 * Enter a parse tree produced by {@link CandidateRequirementsParser#answer}.
	 * @param ctx the parse tree
	 */
	void enterAnswer(CandidateRequirementsParser.AnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CandidateRequirementsParser#answer}.
	 * @param ctx the parse tree
	 */
	void exitAnswer(CandidateRequirementsParser.AnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CandidateRequirementsParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(CandidateRequirementsParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link CandidateRequirementsParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(CandidateRequirementsParser.TextContext ctx);
}