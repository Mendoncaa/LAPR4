package jobs4u.app.backoffice.console.presentation.JobOpening;

import core.management.jobOpening.domain.*;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import core.management.jobOpening.controller.CreateJobOpeningController;

public class CreateJobOpeningUI extends AbstractUI {

    private final CreateJobOpeningController theController = new CreateJobOpeningController();

    @Override
    protected boolean doShow() {
        String customerCode;
        do {
            customerCode = Console.readLine("Customer Code:");
        }while (!theController.verifyIfCustomerExists(customerCode));


        final String jobTitle = Console.readLine("Job Title:");
        final ContractType contractType = selectEnum(ContractType.values(), "Select Contract Type:");
        final JobMode mode = selectEnum(JobMode.values(), "Select Job Mode:");
        final String descriptionText = Console.readLine("Job Description:");

        final String street = Console.readLine("Street:");
        final int doorNumber = Console.readInteger("Door Number:");
        final String floor = Console.readLine("Floor:");
        final String postalCode = Console.readLine("Postal Code:");
        final int numberOfVacancies = Console.readInteger("Number of Vacancies:");

        try {
            theController.createJobOpening(customerCode, jobTitle, contractType, mode, descriptionText, street, doorNumber, floor, postalCode, numberOfVacancies);
            System.out.println("Job opening created successfully.");
            return true;
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid input: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error creating job opening: " + e.getMessage());
        }
        return false;
    }

    private <T extends Enum<T>> T selectEnum(T[] values, String prompt) {
        int index = 1;
        System.out.println(prompt);
        for (T value : values) {
            System.out.printf("%d - %s\n", index++, value.name());
        }
        T selected = null;
        while (selected == null) {
            try {
                int choice = Console.readInteger("Enter the number:");
                if (choice > 0 && choice <= values.length) {
                    selected = values[choice - 1];
                } else {
                    System.out.println("Invalid choice, please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
        return selected;
    }

    @Override
    public String headline() {
        return "Create Job Opening";
    }
}
