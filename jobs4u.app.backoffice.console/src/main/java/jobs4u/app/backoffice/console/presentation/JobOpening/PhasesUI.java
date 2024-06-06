package jobs4u.app.backoffice.console.presentation.JobOpening;

import core.management.RecruitmentProcess.controller.PhasesController;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class PhasesUI extends AbstractUI {

    private PhasesController controller = new PhasesController();

    @Override
    protected boolean doShow() {
        // Step 1: Ask for Job Reference
        String jobReference = askForJobReference();

        // Step 2: Validate Job Reference
        Iterable<String> options;
        try {
            options = controller.validateJobReference(jobReference);
        } catch (Exception e) {
            showConfirmationOrError(e.getMessage());
            return false;
        }
        if (!options.iterator().hasNext()) {
            showConfirmationOrError("No options available for this Job Reference!");
            return false;
        }

        // Step 3: Retrieve and Display Options
        showOptions(options, jobReference);

        return true;
    }

    private String askForJobReference() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the Job Reference: ");
        return scanner.nextLine();
    }

    public void showOptions(Iterable<String> options, String jobReference) {
        // Convert Iterable to List
        List<String> optionsList = new ArrayList<>();
        options.forEach(optionsList::add);

        // Display the options to the user
        SelectWidget<String> selector = new SelectWidget<>("Available Options", optionsList);
        selector.show();

        // Get the selected option
        String chosenOption = selector.selectedElement();

        if (chosenOption != null) {
            // Process the chosen option
            try {
                processTransition(chosenOption);
            } catch (Exception e) {
                showConfirmationOrError(e.getMessage());
            }
        } else {
            showConfirmationOrError("No option selected!");
        }
    }

    public void processTransition(String chosenOption) throws Exception {
        boolean success = controller.processTransition(chosenOption);
        if (success) {
            showConfirmationOrError("Phase transition successful!");
        } else {
            showConfirmationOrError("Phase transition failed!");
        }
    }

    public void showConfirmationOrError(String message) {
        System.out.println(message);
    }

    @Override
    public String headline() {
        return "Open or Close Phases";
    }
}
