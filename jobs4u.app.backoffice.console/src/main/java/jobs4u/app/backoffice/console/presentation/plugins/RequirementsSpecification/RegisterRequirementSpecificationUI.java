package jobs4u.app.backoffice.console.presentation.plugins.RequirementsSpecification;

import core.management.RequirementSpecification.application.controller.RegisterRequirementSpecificationController;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

public class RegisterRequirementSpecificationUI extends AbstractUI {

    private final RegisterRequirementSpecificationController registerRequirementSpecificationController = new RegisterRequirementSpecificationController();

    @Override
    protected boolean doShow() {
        final String name = Console.readLine("Plugin Name:");
        final String jarPath = Console.readLine("Jar Path:");

        try {
            registerRequirementSpecificationController.registerRequirementSpecification(name, jarPath);
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
