package jobs4u.app.backoffice.console.presentation.JobOpening;

import core.management.jobOpening.domain.*;
import eapli.framework.general.domain.model.Description;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import core.management.jobOpening.controller.CreateJobOpeningController;

/**
 * UI for creating a job opening in the application.
 */
public class CreateJobOpeningUI extends AbstractUI {

    private final CreateJobOpeningController theController = new CreateJobOpeningController();

    @Override
    protected boolean doShow() {
        final String jobReference = Console.readLine("Job Reference (ID):");
        final String jobTitle = Console.readLine("Job Title:");
        final ContractType contractType = selectContractType();
        final JobMode mode = selectJobMode();
        final String descriptionText = Console.readLine("Job Description:");
        final String addressText = Console.readLine("Job Location Address:");
        final int numberOfVacancies = Console.readInteger("Number of Vacancies:");

        try {
            // Using valueOf to create Description, Address, and JobTitle objects
            Description description = Description.valueOf(descriptionText);
            Address address = Address.valueOf(addressText);
            JobTitle title = JobTitle.valueOf(jobTitle);

            // Assuming JobReference and NumberOfVacancies have appropriate constructors
            JobReference reference = new JobReference(jobReference);
            NumberOfVacancies vacancies = new NumberOfVacancies(numberOfVacancies);

            this.theController.createJobOpening(reference, title, contractType, mode, description, address, vacancies);
            System.out.println("Job opening created successfully.");
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid input: " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.err.println("Error creating job opening: " + e.getMessage());
            return false;
        }
        return true;
    }



    private ContractType selectContractType() {
        ContractType[] types = ContractType.values();
        int index = 1;
        System.out.println("Select Contract Type:");
        for (ContractType type : types) {
            System.out.printf("%d - %s\n", index++, type.name());
        }
        ContractType selectedType = null;
        while (selectedType == null) {
            int choice = Console.readInteger("Enter the number for the contract type:");
            if (choice > 0 && choice <= types.length) {
                selectedType = types[choice - 1];
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
        return selectedType;
    }

    private JobMode selectJobMode() {
        JobMode[] modes = JobMode.values();
        int index = 1;
        System.out.println("Select Job Mode:");
        for (JobMode mode : modes) {
            System.out.printf("%d - %s\n", index++, mode.name());
        }
        JobMode selectedMode = null;
        while (selectedMode == null) {
            int choice = Console.readInteger("Enter the number for the job mode:");
            if (choice > 0 && choice <= modes.length) {
                selectedMode = modes[choice - 1];
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
        return selectedMode;
    }


    @Override
    public String headline() {
        return "Create Job Opening";
    }
}
