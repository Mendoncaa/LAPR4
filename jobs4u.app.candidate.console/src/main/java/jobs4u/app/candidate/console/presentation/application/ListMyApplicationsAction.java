package jobs4u.app.candidate.console.presentation.application;

import eapli.framework.actions.Action;

public class ListMyApplicationsAction implements Action {

    @Override
    public boolean execute() {
        return new ListMyApplicationsUI().show();
    }
}
