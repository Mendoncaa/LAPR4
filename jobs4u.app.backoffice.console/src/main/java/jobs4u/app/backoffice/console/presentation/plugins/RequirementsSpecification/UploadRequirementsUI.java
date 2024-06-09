package jobs4u.app.backoffice.console.presentation.plugins.RequirementsSpecification;

import jobs4u.antlr4.grammar.UploadRequirementsController;
import core.management.jobApplication.domain.jobApplication;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import jobs4u.app.backoffice.console.presentation.authz.SystemUserPrinter;

import java.util.ArrayList;
import java.util.List;

public class UploadRequirementsUI extends AbstractUI {
    private final UploadRequirementsController controller = new UploadRequirementsController();

    @Override
    protected boolean doShow() {
        Iterable<jobApplication> applications = controller.getApplications();
        List<jobApplication> listApps = new ArrayList<>();

        if (!applications.iterator().hasNext()) {
            System.out.println("No job applications available");
        } else {
            System.out.println("Job Openings available");
            System.out.println(listHeader());
            int count = 1;
            SystemUserPrinter printer = new SystemUserPrinter();
            for (jobApplication application : applications) {
                listApps.add(application);
                System.out.print(count + " ");
                //printer.visit(application);
                System.out.println();
                count++;
            }

            while (true) {
                final int option = Console.readInteger("Select an application (Enter 0 to exit): ");
                if (option == 0) {
                    System.out.println("No Application selected");
                    break;
                } else if (option > 0 && option <= listApps.size()) {
                    jobApplication application = listApps.get(option - 1);
                    String path = Console.readLine("Enter the path to the file: ");
                    controller.uploadTextFile(application, path);
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }

        }

        return true;
    }

    @Override
    public String headline() {
        return "Upload Requirements";
    }

    private String listHeader() {
        return String.format("#%-10s %-10s %-10s %-10s %-10s %-10s %-10s", "CUSTOMER_ID", "JOB_REFERENCE", "CONTRACT_TYPE", "TITLE", "DESCRIPTION ", "MODE", "ADDRESS");
    }
}
