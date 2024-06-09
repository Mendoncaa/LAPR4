package jobs4u.app.backoffice.console.presentation.plugins.RequirementsSpecification;


import core.management.jobOpening.domain.JobOpening;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import jobs4u.antlr4.grammar.GenerateRequirementSpecificationTemplateController;
import jobs4u.app.backoffice.console.presentation.JobOpening.JobOpeningPrinter;
import jobs4u.app.backoffice.console.presentation.authz.SystemUserPrinter;

import java.util.ArrayList;
import java.util.List;

public class GenerateRequirementSpecificationTemplateUI extends AbstractUI {

    GenerateRequirementSpecificationTemplateController controller = new GenerateRequirementSpecificationTemplateController();

    protected boolean doShow() {
        Iterable<JobOpening> openings = controller.getJobOpenings();
        List<JobOpening> listJobOpenings = new ArrayList<>();

        if (!openings.iterator().hasNext()) {
            System.out.println("No job openings available");
        } else {
            System.out.println("Job Openings available");
            System.out.println(listHeader());
            int count = 1;

            while (true) {
                JobOpeningPrinter printer = new JobOpeningPrinter();
                for (JobOpening jobOpening : openings) {
                    listJobOpenings.add(jobOpening);
                    System.out.print(count + ". ");
                    printer.visit(jobOpening);
                    System.out.println();
                    count++;
                }
                final int option = Console.readInteger("Select a job opening (Enter 0 to exit): ");
                if (option == 0) {
                    System.out.println("No Job Opening selected");
                    break;
                } else if (option > 0 && option <= listJobOpenings.size()) {
                    JobOpening jobOpening = listJobOpenings.get(option - 1);
                    if(jobOpening.getRequirementsSpecification() == null){
                        System.out.println("Requirements for the selected job opening are not available. Please select another job opening.");
                        return false;
                    }

                    String requirements = String.valueOf(jobOpening.getRequirementsSpecification().getTemplatePath());

                    if (requirements == null || requirements.trim().isEmpty()) {
                        System.out.println("Requirements for the selected job opening are not available. Please select another job opening.");
                    } else {
                        controller.template(requirements, jobOpening);
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
        return "Export Requirement Template File";
    }

    private String listHeader() {
        return String.format("#  %-15s %-20s %-15s %-15s %-10s %-30s %-30s %-10s %-15s",
                "Job Reference", "Job Title", "Job State", "Contract Type", "Mode", "Description", "Address", "Vacancies", "Active Since");
    }
}