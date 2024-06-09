package jobs4u.app.backoffice.console.presentation.plugins.InterviewModel;

import eapli.framework.actions.Action;

public class VerifyInterviewsAction implements Action {

    @Override
    public boolean execute() {
        return new VerifyInterviewsUI().show();
    }
}
