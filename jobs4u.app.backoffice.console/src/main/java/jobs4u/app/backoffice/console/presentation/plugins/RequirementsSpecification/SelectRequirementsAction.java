package jobs4u.app.backoffice.console.presentation.plugins.RequirementsSpecification;

import eapli.framework.actions.Action;

public class SelectRequirementsAction implements Action {
    @Override
    public boolean execute() {
        return new SelectRequirementsUI().show();
    }
}
