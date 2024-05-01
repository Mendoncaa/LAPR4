/*package jobs4u.app.backoffice.console.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import core.management.jobOpening.application.controller.RegisterJobOpeningController;
import java.util.Scanner;
import core.management.jobOpening.domain.RegisterJobOpening.JobOpeningDTO;

@Component
public class RegisterJobOpeningUI {
    private final RegisterJobOpeningController controller;

    @Autowired
    public RegisterJobOpeningUI(RegisterJobOpeningController controller) {
        this.controller = controller;
    }

    public void show() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Register a new job opening");
        System.out.print("Enter Job Title: ");
        String title = scanner.nextLine();

        JobOpeningDTO jobOpeningDTO = new JobOpeningDTO(title);
        boolean success = controller.registerJobOpening(jobOpeningDTO);
        if (success) {
            System.out.println("Job opening registered successfully.");
        } else {
            System.out.println("Failed to register job opening.");
        }
    }
}
*/