package jobs4u.app.backoffice.console.presentation.plugins.InterviewModel;


import core.management.jobOpening.domain.JobOpening;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import jobs4u.antlr4.grammar.GenerateInterviewTemplateController;
import jobs4u.app.backoffice.console.presentation.authz.SystemUserPrinter;

import java.util.ArrayList;
import java.util.List;

public class GenerateInterviewTemplateUI extends AbstractUI {

    GenerateInterviewTemplateController controller = new GenerateInterviewTemplateController();

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
                    if(jobOpening.getInterviewModel() == null){
                        System.out.println("Interviews for the selected job opening are not available. Please select another job opening.");
                        return false;
                    }

                    String interviews = String.valueOf(jobOpening.getInterviewModel().getTemplatePath());

                    if (interviews == null || interviews.trim().isEmpty()) {
                        System.out.println("Interviews for the selected job opening are not available. Please select another job opening.");
                    } else {
                        controller.template(interviews, jobOpening);
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