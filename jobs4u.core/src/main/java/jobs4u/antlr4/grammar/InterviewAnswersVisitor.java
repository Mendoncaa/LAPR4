// Generated from C:/Users/David/Desktop/SEM4PI/sem4pi-23-24-2dj4/jobs4u.core/src/main/java/jobs4u/antlr4/grammar/InterviewAnswers.g4 by ANTLR 4.13.1
package jobs4u.antlr4.grammar;
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
	 * Visit a parse tree produced by {@link InterviewAnswersParser#interview}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterview(InterviewAnswersParser.InterviewContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#questionAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionAnswer(InterviewAnswersParser.QuestionAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#trueFalseAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseAnswer(InterviewAnswersParser.TrueFalseAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#shortTextAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortTextAnswer(InterviewAnswersParser.ShortTextAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#singleChoiceAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleChoiceAnswer(InterviewAnswersParser.SingleChoiceAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#multipleChoiceAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoiceAnswer(InterviewAnswersParser.MultipleChoiceAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#integerAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerAnswer(InterviewAnswersParser.IntegerAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#decimalAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalAnswer(InterviewAnswersParser.DecimalAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#dateAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateAnswer(InterviewAnswersParser.DateAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#timeAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeAnswer(InterviewAnswersParser.TimeAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#numericScaleAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericScaleAnswer(InterviewAnswersParser.NumericScaleAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(InterviewAnswersParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#weight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeight(InterviewAnswersParser.WeightContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoice(InterviewAnswersParser.ChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#scale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScale(InterviewAnswersParser.ScaleContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#answerTrueFalse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswerTrueFalse(InterviewAnswersParser.AnswerTrueFalseContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#answerShort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswerShort(InterviewAnswersParser.AnswerShortContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#answerSingle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswerSingle(InterviewAnswersParser.AnswerSingleContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#answerMultiple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswerMultiple(InterviewAnswersParser.AnswerMultipleContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#answerInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswerInteger(InterviewAnswersParser.AnswerIntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#answerDecimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswerDecimal(InterviewAnswersParser.AnswerDecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#answerDate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswerDate(InterviewAnswersParser.AnswerDateContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#answerTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswerTime(InterviewAnswersParser.AnswerTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewAnswersParser#answerScale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswerScale(InterviewAnswersParser.AnswerScaleContext ctx);
}