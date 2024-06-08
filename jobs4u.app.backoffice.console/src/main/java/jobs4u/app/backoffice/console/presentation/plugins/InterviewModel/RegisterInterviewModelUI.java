package jobs4u.app.backoffice.console.presentation.plugins.InterviewModel;

import core.management.InterviewModel.application.controller.RegisterInterviewModelController;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

public class RegisterInterviewModelUI extends AbstractUI {

    private final RegisterInterviewModelController registerInterviewModelController = new RegisterInterviewModelController();

    @Override
    protected boolean doShow() {
        final String name = Console.readLine("Plugin Name:");
        final String jarPath = Console.readLine("Jar Path:");

        try {
            registerInterviewModelController.registerInterviewModel(name, jarPath);
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
