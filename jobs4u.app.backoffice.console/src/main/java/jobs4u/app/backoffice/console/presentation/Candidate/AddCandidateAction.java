package jobs4u.app.backoffice.console.presentation.Candidate;

import eapli.framework.actions.Action;

/**
 * Menu action for adding a new user to the application. Created by nuno on
 * 22/03/16.
 */
public class AddCandidateAction implements Action {

    @Override
    public boolean execute() {
        return new AddCandidateUI().show();
    }
}
