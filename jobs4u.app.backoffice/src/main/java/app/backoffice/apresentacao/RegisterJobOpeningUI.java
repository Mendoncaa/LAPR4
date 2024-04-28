package app.backoffice.apresentacao;

import java.util.Scanner;

import core.jobOpening.application.controller.RegisterJobOpeningController;
import core.jobOpening.domain.JobOpening;
import core.jobOpening.domain.JobReference;
import core.jobOpening.domain.Title;
import core.jobOpening.domain.Description;
import core.jobOpening.domain.NrVacancies;
import core.jobOpening.domain.Address;
import app.backoffice.apresentacao.adminUI;


import java.util.Scanner;

public class RegisterJobOpeningUI {

    private Long UserID;
    private String username;

    public RegisterJobOpeningUI(Long UserID, String username) {
        this.UserID = UserID;
        this.username = username;
    }

    public JobOpening createJobOpening() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter job title:");
        String title = scanner.nextLine();

        System.out.println("Enter job description:");
        String description = scanner.nextLine();

        System.out.println("Enter job requirements:");
        String requirements = scanner.nextLine();

        System.out.println("Enter number of vacancies:");
        int vacancies = scanner.nextInt();

        System.out.println("Enter contract type:");
        String contractType = scanner.next();

        System.out.println("Enter job mode:");
        String mode = scanner.next();

        System.out.println("Enter job address:");
        String address = scanner.next();

        /* 
        return new JobOpening(
                new JobReference(),
                new Title(title),
                new JobDescription(description),
                new JobNumberOfVacancies(vacancies),
                new ContractType(contractType),
                new JobMode(mode),
                new JobAddress(address)
        );

        */
    }
}