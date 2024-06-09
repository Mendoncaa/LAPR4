package jobs4u.app.backoffice.console.presentation.plugins.InterviewModel;

import eapli.framework.actions.Action;
import jobs4u.app.backoffice.console.presentation.plugins.RequirementsSpecification.UploadRequirementsUI;

public class UploadInterviewsAction implements Action {

    @Override
    public boolean execute() {
        return new UploadInterviewsUI().show();
    }
}
