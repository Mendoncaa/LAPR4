package jobs4u.app.backoffice.console.presentation.plugins.InterviewModel;

import eapli.framework.actions.Action;
import jobs4u.app.backoffice.console.presentation.plugins.RequirementsSpecification.RegisterRequirementSpecificationUI;

public class GenerateInterviewTemplateAction implements Action {
    @Override
    public boolean execute() {
        return new GenerateInterviewTemplateUI().show();
    }
}
