package jobs4u.app.backoffice.console.presentation.JobApplication;

import eapli.framework.actions.Action;

public class RegisterApplicationAction implements Action {

    @Override
    public boolean execute() {
        return new RegisterApplicationUI().show();
    }
}
