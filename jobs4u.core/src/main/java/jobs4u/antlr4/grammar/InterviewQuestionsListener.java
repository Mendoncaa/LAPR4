// Generated from C:/Users/David/Desktop/SEM4PI/sem4pi-23-24-2dj4/jobs4u.core/src/main/java/jobs4u/antlr4/grammar/InterviewQuestions.g4 by ANTLR 4.13.1
package jobs4u.antlr4.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InterviewQuestionsParser}.
 */
public interface InterviewQuestionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#interview}.
	 * @param ctx the parse tree
	 */
	void enterInterview(InterviewQuestionsParser.InterviewContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#interview}.
	 * @param ctx the parse tree
	 */
	void exitInterview(InterviewQuestionsParser.InterviewContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(InterviewQuestionsParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(InterviewQuestionsParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseQuestion(InterviewQuestionsParser.TrueFalseQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseQuestion(InterviewQuestionsParser.TrueFalseQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#shortTextQuestion}.
	 * @param ctx the parse tree
	 */
	void enterShortTextQuestion(InterviewQuestionsParser.ShortTextQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#shortTextQuestion}.
	 * @param ctx the parse tree
	 */
	void exitShortTextQuestion(InterviewQuestionsParser.ShortTextQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#singleChoiceQuestion}.
	 * @param ctx the parse tree
	 */
	void enterSingleChoiceQuestion(InterviewQuestionsParser.SingleChoiceQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#singleChoiceQuestion}.
	 * @param ctx the parse tree
	 */
	void exitSingleChoiceQuestion(InterviewQuestionsParser.SingleChoiceQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#multipleChoiceQuestion}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoiceQuestion(InterviewQuestionsParser.MultipleChoiceQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#multipleChoiceQuestion}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoiceQuestion(InterviewQuestionsParser.MultipleChoiceQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#integerQuestion}.
	 * @param ctx the parse tree
	 */
	void enterIntegerQuestion(InterviewQuestionsParser.IntegerQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#integerQuestion}.
	 * @param ctx the parse tree
	 */
	void exitIntegerQuestion(InterviewQuestionsParser.IntegerQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#decimalQuestion}.
	 * @param ctx the parse tree
	 */
	void enterDecimalQuestion(InterviewQuestionsParser.DecimalQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#decimalQuestion}.
	 * @param ctx the parse tree
	 */
	void exitDecimalQuestion(InterviewQuestionsParser.DecimalQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#dateQuestion}.
	 * @param ctx the parse tree
	 */
	void enterDateQuestion(InterviewQuestionsParser.DateQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#dateQuestion}.
	 * @param ctx the parse tree
	 */
	void exitDateQuestion(InterviewQuestionsParser.DateQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#timeQuestion}.
	 * @param ctx the parse tree
	 */
	void enterTimeQuestion(InterviewQuestionsParser.TimeQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#timeQuestion}.
	 * @param ctx the parse tree
	 */
	void exitTimeQuestion(InterviewQuestionsParser.TimeQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#numericScaleQuestion}.
	 * @param ctx the parse tree
	 */
	void enterNumericScaleQuestion(InterviewQuestionsParser.NumericScaleQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#numericScaleQuestion}.
	 * @param ctx the parse tree
	 */
	void exitNumericScaleQuestion(InterviewQuestionsParser.NumericScaleQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(InterviewQuestionsParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(InterviewQuestionsParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#weight}.
	 * @param ctx the parse tree
	 */
	void enterWeight(InterviewQuestionsParser.WeightContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#weight}.
	 * @param ctx the parse tree
	 */
	void exitWeight(InterviewQuestionsParser.WeightContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#choice}.
	 * @param ctx the parse tree
	 */
	void enterChoice(InterviewQuestionsParser.ChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#choice}.
	 * @param ctx the parse tree
	 */
	void exitChoice(InterviewQuestionsParser.ChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#scale}.
	 * @param ctx the parse tree
	 */
	void enterScale(InterviewQuestionsParser.ScaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#scale}.
	 * @param ctx the parse tree
	 */
	void exitScale(InterviewQuestionsParser.ScaleContext ctx);
}