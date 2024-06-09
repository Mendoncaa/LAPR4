package jobs4u.antlr4.CustomerRequirementsManagement;


import jobs4u.antlr4.grammar.CostumerRequirementsBaseVisitor;
import jobs4u.antlr4.grammar.CostumerRequirementsParser;

import java.util.ArrayList;
import java.util.List;

public class RequirementsVisitor extends CostumerRequirementsBaseVisitor<Void> {
    private List<RequirementAnswers> requirements = new ArrayList<>();

    @Override
    public Void visitRequirement(CostumerRequirementsParser.RequirementContext ctx) {
        String id = ctx.id.getText();
        String content = ctx.requirementContent.getText();
        String answer = "";

        if (ctx.reqType().trueFalseReq() != null) {
            answer = ctx.reqType().trueFalseReq().answer.getText();
        } else if (ctx.reqType().shortAReq() != null) {
            answer = ctx.reqType().shortAReq().answer.getText();
        } else if (ctx.reqType().intReq() != null) {
            answer = ctx.reqType().intReq().answer.getText();
        } else if (ctx.reqType().choiceReq() != null) {
            answer = ctx.reqType().choiceReq().answer.getText();
        }

        requirements.add(new RequirementAnswers(id, content, answer));

        return super.visitRequirement(ctx);
    }

    public List<RequirementAnswers> getRequirements() {
        return requirements;
    }
}