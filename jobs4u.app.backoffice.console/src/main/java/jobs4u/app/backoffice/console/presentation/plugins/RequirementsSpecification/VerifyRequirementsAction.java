package jobs4u.app.backoffice.console.presentation.plugins.RequirementsSpecification;

import eapli.framework.actions.Action;

public class VerifyRequirementsAction implements Action {

    @Override
    public boolean execute() {
        return new VerifyRequirementsUI().show();
    }
}
