package jobs4u.app.backoffice.console.presentation.JobApplication;

import eapli.framework.actions.Action;

public class ListApplicationsForJobOpeningAction implements Action {

    @Override
    public boolean execute() {
        return new ListApplicationsForJobOpeningUI().show();
    }
}
