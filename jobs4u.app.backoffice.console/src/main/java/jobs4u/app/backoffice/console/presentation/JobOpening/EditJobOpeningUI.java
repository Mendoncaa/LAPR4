package jobs4u.app.backoffice.console.presentation.JobOpening;

import core.management.jobOpening.controller.EditJobOpeningController;
import core.management.jobOpening.controller.ListJobOpeningsController;
import core.management.jobOpening.domain.JobOpening;
import core.management.jobOpening.domain.JobReference;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

import java.util.List;
import java.util.Scanner;

public class EditJobOpeningUI extends AbstractUI {
    private EditJobOpeningController controller = new EditJobOpeningController();
    private final ListJobOpeningsController listJobOpeningsController = new ListJobOpeningsController();
    public void editJobOpening(JobOpening job) {
        System.out.println("Select the attribute you want to edit:");
        System.out.println("1. Title");
        System.out.println("2. State");
        System.out.println("3. Contract Type");
        System.out.println("4. Mode");
        System.out.println("5. Description");
        System.out.println("6. Address");
        System.out.println("7. Number of Vacancies");

        int choice = Console.readInteger("Enter the number of the attribute: ");

        switch (choice) {
            case 1:
                String newTitle = Console.readLine("Enter the new value for Title: ");
                controller.changeTitle(job, newTitle);
                break;
            case 2:
                String newState = Console.readLine("Enter the new value for State: ");
                controller.changeState(job, newState);
                break;
            case 3:
                String newContractType = Console.readLine("Enter the new value for Contract Type: ");
                controller.changeContractType(job, newContractType);
                break;
            case 4:
                String newMode = Console.readLine("Enter the new value for Mode: ");
                controller.changeMode(job, newMode);
                break;
            case 5:
                String newDescription = Console.readLine("Enter the new value for Description: ");
                controller.changeDescription(job, newDescription);
                break;
            case 6:
                String newAddress = Console.readLine("Enter the new value for Address: ");
                controller.changeAddress(job, newAddress);
                break;
            case 7:
                int newNumberOfVacancies = Console.readInteger("Enter the new value for Number of Vacancies: ");
                controller.changeNumberOfVacancies(job, newNumberOfVacancies);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                return;
        }

        System.out.println("Attribute updated successfully!");
    }

    @Override
    protected boolean doShow() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available Job Openings:");
        List<JobReference> jobReferences = listJobOpeningsController.allJobReferences();
        int count = 1;
        for (JobReference jobReference : jobReferences) {
            System.out.println(count + ") " + jobReference);
            count++;
        };

        System.out.println("Enter Job Reference:");
        String jobReferenceStr = scanner.nextLine();
        JobOpening jobOpening = controller.findByJobReference(jobReferenceStr);
        editJobOpening(jobOpening);
        return false;
    }

    @Override
    public String headline() {
        return "Edit Job Opening";
    }
}
