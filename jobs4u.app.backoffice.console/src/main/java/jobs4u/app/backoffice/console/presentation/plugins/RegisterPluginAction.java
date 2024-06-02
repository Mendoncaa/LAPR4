package jobs4u.app.backoffice.console.presentation.plugins;

import eapli.framework.actions.Action;

public class RegisterPluginAction implements Action {
    @Override
    public boolean execute() {
        return new RegisterPluginUI().show();
    }
}
