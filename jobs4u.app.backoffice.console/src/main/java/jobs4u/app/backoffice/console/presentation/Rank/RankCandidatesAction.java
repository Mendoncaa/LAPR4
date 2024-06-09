package jobs4u.app.backoffice.console.presentation.Rank;

import eapli.framework.actions.Action;
import jobs4u.app.backoffice.console.presentation.JobOpening.ListJobOpeningsUI;

/**
 * Action to list all job openings.
 */
public class RankCandidatesAction implements Action {

    @Override
    public boolean execute() {
        return new RankCandidatesUI().show();
    }
}
