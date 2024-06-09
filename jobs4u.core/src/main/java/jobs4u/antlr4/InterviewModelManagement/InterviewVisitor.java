package jobs4u.antlr4.InterviewModelManagement;


import jobs4u.antlr4.grammar.InterviewQuestionsBaseVisitor;
import jobs4u.antlr4.grammar.InterviewQuestionsParser;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class InterviewVisitor extends InterviewQuestionsBaseVisitor<Void> {
    private List<InterviewAnswers> interviews = new ArrayList<>();

    @Override
    public Void visitRequirement(InterviewQuestionsParser.RequirementContext ctx) {
        String id = ctx.id.getText();
        String content = ctx.requirementContent.getText();
        String answer = "";
        int value = 0;

        if (ctx.reqType().trueFalseReq() != null) {
            answer = ctx.reqType().trueFalseReq().answer.getText();
            value = Integer.parseInt(ctx.reqType().trueFalseReq().value.getText());
        } else if (ctx.reqType().shortAReq() != null) {
            answer = ctx.reqType().shortAReq().answer.getText();
            value = Integer.parseInt(ctx.reqType().shortAReq().value.getText());
        } else if (ctx.reqType().intReq() != null) {
            answer = ctx.reqType().intReq().answer.getText();
            value = Integer.parseInt(ctx.reqType().intReq().value.getText());
        } else if (ctx.reqType().choiceReq() != null) {
            answer = ctx.reqType().choiceReq().answer.getText();
            value = Integer.parseInt(ctx.reqType().choiceReq().value.getText());
        } else if (ctx.reqType().dateReq() != null) {
            answer = ctx.reqType().dateReq().answer.getText();
            value = Integer.parseInt(ctx.reqType().dateReq().value.getText());
        } else if (ctx.reqType().timeReq() != null) {
            answer = ctx.reqType().timeReq().answer.getText();
            value = Integer.parseInt(ctx.reqType().timeReq().value.getText());
        } else if (ctx.reqType().decimalReq() != null) {
            answer = ctx.reqType().decimalReq().answer.getText();
            value = Integer.parseInt(ctx.reqType().decimalReq().value.getText());
        }

        interviews.add(new InterviewAnswers(id, content, answer, value));
        return super.visitRequirement(ctx);
    }

}
