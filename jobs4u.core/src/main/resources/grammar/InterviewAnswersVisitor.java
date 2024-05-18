// Generated from InterviewAnswers.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InterviewAnswersParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InterviewAnswersVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#answers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswers(InterviewAnswersParser.AnswersContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswer(InterviewAnswersParser.AnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#true_false}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue_false(InterviewAnswersParser.True_falseContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#short}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShort(InterviewAnswersParser.ShortContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#single_choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_choice(InterviewAnswersParser.Single_choiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#multiple_choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_choice(InterviewAnswersParser.Multiple_choiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#int_q}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_q(InterviewAnswersParser.Int_qContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#real_q}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_q(InterviewAnswersParser.Real_qContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#date_q}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_q(InterviewAnswersParser.Date_qContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#time_q}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_q(InterviewAnswersParser.Time_qContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#scale_q}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScale_q(InterviewAnswersParser.Scale_qContext ctx);
}