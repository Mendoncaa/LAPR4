// Generated from C:/Users/David/Desktop/SEM4PI/sem4pi-23-24-2dj4/jobs4u.core/src/main/java/jobs4u/antlr4/grammar/InterviewAnswers.g4 by ANTLR 4.13.1
package jobs4u.antlr4.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InterviewAnswersParser}.
 */
public interface InterviewAnswersListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InterviewAnswersParser#interview}.
	 * @param ctx the parse tree
	 */
	void enterInterview(InterviewAnswersParser.InterviewContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewAnswersParser#interview}.
	 * @param ctx the parse tree
	 */
	void exitInterview(InterviewAnswersParser.InterviewContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewAnswersParser#questionAnswer}.
	 * @param ctx the parse tree
	 */
	void enterQuestionAnswer(InterviewAnswersParser.QuestionAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewAnswersParser#questionAnswer}.
	 * @param ctx the parse tree
	 */
	void exitQuestionAnswer(InterviewAnswersParser.QuestionAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewAnswersParser#trueFalseAnswer}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseAnswer(InterviewAnswersParser.TrueFalseAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewAnswersParser#trueFalseAnswer}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseAnswer(InterviewAnswersParser.TrueFalseAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewAnswersParser#shortTextAnswer}.
	 * @param ctx the parse tree
	 */
	void enterShortTextAnswer(InterviewAnswersParser.ShortTextAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewAnswersParser#shortTextAnswer}.
	 * @param ctx the parse tree
	 */
	void exitShortTextAnswer(InterviewAnswersParser.ShortTextAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewAnswersParser#singleChoiceAnswer}.
	 * @param ctx the parse tree
	 */
	void enterSingleChoiceAnswer(InterviewAnswersParser.SingleChoiceAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewAnswersParser#singleChoiceAnswer}.
	 * @param ctx the parse tree
	 */
	void exitSingleChoiceAnswer(InterviewAnswersParser.SingleChoiceAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewAnswersParser#multipleChoiceAnswer}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoiceAnswer(InterviewAnswersParser.MultipleChoiceAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewAnswersParser#multipleChoiceAnswer}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoiceAnswer(InterviewAnswersParser.MultipleChoiceAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewAnswersParser#integerAnswer}.
	 * @param ctx the parse tree
	 */
	void enterIntegerAnswer(InterviewAnswersParser.IntegerAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewAnswersParser#integerAnswer}.
	 * @param ctx the parse tree
	 */
	void exitIntegerAnswer(InterviewAnswersParser.IntegerAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewAnswersParser#decimalAnswer}.
	 * @param ctx the parse tree
	 */
	void enterDecimalAnswer(InterviewAnswersParser.DecimalAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewAnswersParser#decimalAnswer}.
	 * @param ctx the parse tree
	 */
	void exitDecimalAnswer(InterviewAnswersParser.DecimalAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewAnswersParser#dateAnswer}.
	 * @param ctx the parse tree
	 */
	void enterDateAnswer(InterviewAnswersParser.DateAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewAnswersParser#dateAnswer}.
	 * @param ctx the parse tree
	 */
	void exitDateAnswer(InterviewAnswersParser.DateAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewAnswersParser#timeAnswer}.
	 * @param ctx the parse tree
	 */
	void enterTimeAnswer(InterviewAnswersParser.TimeAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewAnswersParser#timeAnswer}.
	 * @param ctx the parse tree
	 */
	void exitTimeAnswer(InterviewAnswersParser.TimeAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewAnswersParser#numericScaleAnswer}.
	 * @param ctx the parse tree
	 */
	void enterNumericScaleAnswer(InterviewAnswersParser.NumericScaleAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewAnswersParser#numericScaleAnswer}.
	 * @param ctx the parse tree
	 */
	void exitNumericScaleAnswer(InterviewAnswersParser.NumericScaleAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewAnswersParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(InterviewAnswersParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewAnswersParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(InterviewAnswersParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewAnswersParser#weight}.
	 * @param ctx the parse tree
	 */
	void enterWeight(InterviewAnswersParser.WeightContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewAnswersParser#weight}.
	 * @param ctx the parse tree
	 */
	void exitWeight(InterviewAnswersParser.WeightContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewAnswersParser#choice}.
	 * @param ctx the parse tree
	 */
	void enterChoice(InterviewAnswersParser.ChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewAnswersParser#choice}.
	 * @param ctx the parse tree
	 */
	void exitChoice(InterviewAnswersParser.ChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewAnswersParser#scale}.
	 * @param ctx the parse tree
	 */
	void enterScale(InterviewAnswersParser.ScaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewAnswersParser#scale}.
	 * @param ctx the parse tree
	 */
	void exitScale(InterviewAnswersParser.ScaleContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewAnswersParser#answerTrueFalse}.
	 * @param ctx the parse tree
	 */
	void enterAnswerTrueFalse(InterviewAnswersParser.AnswerTrueFalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewAnswersParser#answerTrueFalse}.
	 * @param ctx the parse tree
	 */
	void exitAnswerTrueFalse(InterviewAnswersParser.AnswerTrueFalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewAnswersParser#answerShort}.
	 * @param ctx the parse tree
	 */
	void enterAnswerShort(InterviewAnswersParser.AnswerShortContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewAnswersParser#answerShort}.
	 * @param ctx the parse tree
	 */
	void exitAnswerShort(InterviewAnswersParser.AnswerShortContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewAnswersParser#answerSingle}.
	 * @param ctx the parse tree
	 */
	void enterAnswerSingle(InterviewAnswersParser.AnswerSingleContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewAnswersParser#answerSingle}.
	 * @param ctx the parse tree
	 */
	void exitAnswerSingle(InterviewAnswersParser.AnswerSingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewAnswersParser#answerMultiple}.
	 * @param ctx the parse tree
	 */
	void enterAnswerMultiple(InterviewAnswersParser.AnswerMultipleContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewAnswersParser#answerMultiple}.
	 * @param ctx the parse tree
	 */
	void exitAnswerMultiple(InterviewAnswersParser.AnswerMultipleContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewAnswersParser#answerInteger}.
	 * @param ctx the parse tree
	 */
	void enterAnswerInteger(InterviewAnswersParser.AnswerIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewAnswersParser#answerInteger}.
	 * @param ctx the parse tree
	 */
	void exitAnswerInteger(InterviewAnswersParser.AnswerIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewAnswersParser#answerDecimal}.
	 * @param ctx the parse tree
	 */
	void enterAnswerDecimal(InterviewAnswersParser.AnswerDecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewAnswersParser#answerDecimal}.
	 * @param ctx the parse tree
	 */
	void exitAnswerDecimal(InterviewAnswersParser.AnswerDecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewAnswersParser#answerDate}.
	 * @param ctx the parse tree
	 */
	void enterAnswerDate(InterviewAnswersParser.AnswerDateContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewAnswersParser#answerDate}.
	 * @param ctx the parse tree
	 */
	void exitAnswerDate(InterviewAnswersParser.AnswerDateContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewAnswersParser#answerTime}.
	 * @param ctx the parse tree
	 */
	void enterAnswerTime(InterviewAnswersParser.AnswerTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewAnswersParser#answerTime}.
	 * @param ctx the parse tree
	 */
	void exitAnswerTime(InterviewAnswersParser.AnswerTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewAnswersParser#answerScale}.
	 * @param ctx the parse tree
	 */
	void enterAnswerScale(InterviewAnswersParser.AnswerScaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewAnswersParser#answerScale}.
	 * @param ctx the parse tree
	 */
	void exitAnswerScale(InterviewAnswersParser.AnswerScaleContext ctx);
}