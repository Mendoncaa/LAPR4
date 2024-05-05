package jobs4u.app.backoffice.console.presentation.JobOpening;

import eapli.framework.actions.Action;

public class SetUpRecruitmentProcessAction implements Action {

        @Override
        public boolean execute() {
            return new SetUpRecruitmentProcessUI().show();
        }
}
