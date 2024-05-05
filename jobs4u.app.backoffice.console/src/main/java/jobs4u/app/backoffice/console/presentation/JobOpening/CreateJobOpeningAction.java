package jobs4u.app.backoffice.console.presentation.JobOpening;

import eapli.framework.actions.Action;

/**
 * Action to list all job openings.
 */
public class CreateJobOpeningAction implements Action {

    @Override
    public boolean execute() {
        return new ListJobOpeningsUI().show();
    }
}
