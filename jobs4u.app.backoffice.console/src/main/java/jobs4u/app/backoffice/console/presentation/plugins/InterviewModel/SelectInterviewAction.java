package jobs4u.app.backoffice.console.presentation.plugins.InterviewModel;

import eapli.framework.actions.Action;

public class SelectInterviewAction implements Action {
    @Override
    public boolean execute() {
        return new SelectInterviewUI().show();
    }
}