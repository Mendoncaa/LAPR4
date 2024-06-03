package jobs4u.app.backoffice.console.presentation.JobOpening;

import core.management.RecruitmentProcess.controller.PhasesController;
import eapli.framework.presentation.console.AbstractUI;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class PhasesUI extends AbstractUI {

    @Autowired
    private PhasesController controller;

    @Override
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
