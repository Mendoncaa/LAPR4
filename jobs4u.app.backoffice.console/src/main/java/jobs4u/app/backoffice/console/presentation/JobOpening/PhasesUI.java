package jobs4u.app.backoffice.console.presentation.JobOpening;

import core.management.RecruitmentProcess.controller.PhasesController;
import eapli.framework.presentation.console.AbstractUI;

public class PhasesUI extends AbstractUI {

    private PhasesController controller;

    protected boolean doShow() {
        controller = new PhasesController();
        return true;
    }

    public void askForJobReference() {
        // Simulating user input for JobReference
        String jobReference = "JOB_REF_123";
        controller.validateJobReference(jobReference);
    }

    public void showOptions(Iterable<String> options) {
        // Simulating user selection
        System.out.println("Options: " + options);
        String chosenOption = "Forward"; // Assuming the user chooses "Forward"
        processTransition(chosenOption);
    }

    public void processTransition(String chosenOption) {
        controller.processTransition(chosenOption);
    }

    public void showConfirmationOrError(String message) {
        System.out.println(message);
    }
    @Override
    public String headline() {
        return "Open or Close Phases";
    }
}
