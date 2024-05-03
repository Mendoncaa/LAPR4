package jobs4u.app.backoffice.console.presentation.JobOpening;

import core.management.costumer.domain.Customer;
import core.management.jobOpening.domain.*;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import core.management.jobOpening.controller.CreateJobOpeningController;

import java.util.List;

public class CreateJobOpeningUI extends AbstractUI {

    private final CreateJobOpeningController theController = new CreateJobOpeningController();

    @Override
    protected boolean doShow() {
        List<Customer> customers = theController.findCustomerByCustomerManager();
        String customerCode;
        if (customers.isEmpty()) {
            System.out.println("No customers found. Please create a customer first.");
            return false;
        }
        else
        {
            customerCode = selectCustomerCode(customers);
        }

        // TODO:
        // Criar JobReference com o CustomerCode

        // jobReference só para não dar erro
        final String jobReference = customerCode;

        final String jobTitle = Console.readLine("Job Title:");
        final ContractType contractType = selectContractType();
        final JobMode mode = selectJobMode();
        final String descriptionText = Console.readLine("Job Description:");

        // Gather address in steps
        final String street = Console.readLine("Street:");
        final int doorNumber = Console.readInteger("Door Number:");
        final String floor = Console.readLine("Floor:");
        final String postalCode = Console.readLine("Postal Code:");

        final int numberOfVacancies = Console.readInteger("Number of Vacancies:");

        try {
            this.theController.createJobOpening(jobReference, jobTitle, contractType, mode, descriptionText, street, doorNumber, floor, postalCode, numberOfVacancies);
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

    private String selectCustomerCode(List<Customer> customers) {
        System.out.println("Select Customer:");
        int index = 1;
        for (Customer customer : customers) {
            System.out.printf("%d. %s\n", index++, customer.getCustomerCode());
        }

        String selectedCustomerCode = null;
        while (selectedCustomerCode == null) {
            int choice = Console.readInteger("Enter the number for the customer:");
            if (choice > 0 && choice <= customers.size()) {
                selectedCustomerCode = customers.get(choice - 1).getCustomerCode().toString();
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }

        return selectedCustomerCode;
    }


    @Override
    public String headline() {
        return "Create Job Opening";
    }
}
