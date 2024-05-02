package jobs4u.app.backoffice.console.presentation;

import core.management.jobOpening.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import core.management.jobOpening.application.controller.RegisterJobOpeningController;
import java.util.Scanner;

import core.management.jobOpening.domain.JobOpening.*;

@Component
public class RegisterJobOpeningUI {
    private final RegisterJobOpeningController controller;

    @Autowired
    public RegisterJobOpeningUI(RegisterJobOpeningController controller) {
        this.controller = controller;
    }

    /*
    public void show() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Register a new job opening");

        System.out.print("Enter Job Reference: ");
        JobReference jobReference = new JobReference(scanner.nextLine());

        System.out.print("Enter Job Title: ");
        JobTitle jobTitle = new JobTitle(scanner.nextLine());

        System.out.print("Enter Job State: ");
        JobState jobState = JobState.valueOf(scanner.nextLine().toUpperCase());

        System.out.print("Enter Contract Type: ");
        ContractType contractType = ContractType.valueOf(scanner.nextLine().toUpperCase());

        System.out.print("Enter Job Mode: ");
        JobMode mode = JobMode.valueOf(scanner.nextLine().toUpperCase());

        System.out.print("Enter Description: ");
        Description description = new Description(scanner.nextLine());

        System.out.print("Enter Address: ");
        Address address = new Address(scanner.nextLine());

        System.out.print("Enter Number Of Vacancies: ");
        NumberOfVacancies numberOfVacancies = new NumberOfVacancies(Integer.parseInt(scanner.nextLine()));

        JobOpeningDTO jobOpeningDTO = new JobOpeningDTO(jobReference, jobTitle, jobState, contractType, mode, description, address, numberOfVacancies);
        boolean success = controller.registerJobOpening(jobOpeningDTO);
        if (success) {
            System.out.println("Job opening registered successfully.");
        } else {
            System.out.println("Failed to register job opening.");
        }
    }

     */
}