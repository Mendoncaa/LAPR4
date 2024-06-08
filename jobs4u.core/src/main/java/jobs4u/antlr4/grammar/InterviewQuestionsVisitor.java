// Generated from /Users/mendonca/PROJETO_LAPR4/jobs4u.core/src/main/java/jobs4u/antlr4/grammar/InterviewQuestions.g4 by ANTLR 4.13.1
package jobs4u.antlr4.grammar;
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
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(InterviewQuestionsParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(InterviewQuestionsParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement(InterviewQuestionsParser.RequirementContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#reqType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReqType(InterviewQuestionsParser.ReqTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#trueFalseReq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseReq(InterviewQuestionsParser.TrueFalseReqContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#shortAReq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortAReq(InterviewQuestionsParser.ShortAReqContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#intReq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntReq(InterviewQuestionsParser.IntReqContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#multiChoiceReq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiChoiceReq(InterviewQuestionsParser.MultiChoiceReqContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#choiceReq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoiceReq(InterviewQuestionsParser.ChoiceReqContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#dateReq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateReq(InterviewQuestionsParser.DateReqContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#timeReq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeReq(InterviewQuestionsParser.TimeReqContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#decimalReq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalReq(InterviewQuestionsParser.DecimalReqContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#answer1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswer1(InterviewQuestionsParser.Answer1Context ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#answer2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswer2(InterviewQuestionsParser.Answer2Context ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#answer3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswer3(InterviewQuestionsParser.Answer3Context ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#answer4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswer4(InterviewQuestionsParser.Answer4Context ctx);
}