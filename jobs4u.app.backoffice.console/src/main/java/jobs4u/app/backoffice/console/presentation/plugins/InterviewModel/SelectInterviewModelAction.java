package jobs4u.app.backoffice.console.presentation.plugins.InterviewModel;

import eapli.framework.actions.Action;

public class SelectInterviewModelAction implements Action {
    @Override
    public boolean execute() {
        return new SelectInterviewModelUI().show();
    }
}
