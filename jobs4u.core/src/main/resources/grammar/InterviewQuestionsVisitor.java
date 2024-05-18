// Generated from InterviewQuestions.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InterviewQuestionsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InterviewQuestionsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#questions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestions(InterviewQuestionsParser.QuestionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(InterviewQuestionsParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#true_false}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue_false(InterviewQuestionsParser.True_falseContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#short}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShort(InterviewQuestionsParser.ShortContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#single_choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_choice(InterviewQuestionsParser.Single_choiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#multiple_choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_choice(InterviewQuestionsParser.Multiple_choiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#c_choices}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_choices(InterviewQuestionsParser.C_choicesContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoice(InterviewQuestionsParser.ChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#int_q}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_q(InterviewQuestionsParser.Int_qContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#real_q}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_q(InterviewQuestionsParser.Real_qContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#date_q}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_q(InterviewQuestionsParser.Date_qContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#time_q}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_q(InterviewQuestionsParser.Time_qContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#scale_q}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScale_q(InterviewQuestionsParser.Scale_qContext ctx);
}