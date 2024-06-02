package jobs4u.app.backoffice.console.presentation.plugins;

import core.management.Plugin.application.Utils.PluginUtils;
import core.management.Plugin.application.controller.RegisterPluginController;
import core.management.Plugin.domain.PluginType;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

public class RegisterPluginUI extends AbstractUI {

    private final RegisterPluginController registerPluginController = new RegisterPluginController();

    @Override
    protected boolean doShow() {
        final String name = Console.readLine("Plugin Name:");
        final String jarPath = Console.readLine("Jar Path:");

        PluginType pluginType = PluginUtils.selectPluginType();

        try {
            registerPluginController.registerPlugin(name, jarPath, pluginType);
            System.out.println("Plugin registered successfully.");
        } catch (Exception e){
            System.err.println("Failed to register plugin.");
            return false;
        }

        return true;
    }

    @Override
    public String headline() {
        return "Register Plugin";
    }
}
