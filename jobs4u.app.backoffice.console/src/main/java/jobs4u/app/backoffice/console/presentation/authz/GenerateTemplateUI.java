package jobs4u.app.backoffice.console.presentation.authz;


import core.management.jobOpening.domain.JobOpening;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import jobs4u.app.backoffice.console.presentation.JobApplication.GenerateTemplateController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class GenerateTemplateUI extends AbstractUI {

    GenerateTemplateController controller = new GenerateTemplateController();

    protected boolean doShow() {
        Iterable<JobOpening> openings = controller.getJobOpenings();
        List<JobOpening> listJobOpenings = new ArrayList<>();

        if (!openings.iterator().hasNext()) {
            System.out.println("No job openings available");
        } else {
            System.out.println("Job Openings available");
            System.out.println(listHeader());
            int count = 1;
            SystemUserPrinter printer = new SystemUserPrinter();
            for (JobOpening jobOpening : openings) {
                listJobOpenings.add(jobOpening);
                System.out.print(count + " ");
                printer.visit(jobOpening);
                System.out.println();
                count++;
            }

            while (true) {
                final int option = Console.readInteger("Select a job opening (Enter 0 to exit): ");
                if (option == 0) {
                    System.out.println("No Job Opening selected");
                    break;
                } else if (option > 0 && option <= listJobOpenings.size()) {
                    JobOpening jobOpening = listJobOpenings.get(option - 1);
                    String requirements = String.valueOf(jobOpening.getRequirementsSpecification());
                    // requirements estão sempre a nulo na jobOpening
                    requirements = "req1";

                    if (requirements == null || requirements.trim().isEmpty()) {
                        System.out.println("Requirements for the selected job opening are not available. Please select another job opening.");
                    } else {
                        String sourcePath = "jobs4u.core/src/main/resources/requirements/" + requirements;
                        controller.template(sourcePath, jobOpening);
                        break; // Exit the loop after successful processing
                    }
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }

        return false;
    }



    @Override
    public String headline() {
        return "Export Interview Template File";
    }

    private String listHeader() {
        return String.format("#%-10s %-10s %-10s %-10s %-10s %-10s %-10s", "CUSTOMER_ID", "JOB_REFERENCE", "CONTRACT_TYPE", "TITLE","DESCRIPTION ", "MODE", "ADDRESS");
    }
}