package jobs4u.app.backoffice.console.presentation.JobApplication;

import core.management.jobApplication.application.controller.DisplayApplicationDataController;
import core.management.jobApplication.domain.jobApplication;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

import java.util.List;

public class DisplayApplicationDataUI extends AbstractUI {
    private DisplayApplicationDataController theController = new DisplayApplicationDataController();

    @Override
    protected boolean doShow() {
        System.out.println("Select an application by entering the corresponding number: ");
        List<jobApplication> applications = (List<jobApplication>) theController.allApplications();

        for (int i = 0; i < applications.size(); i++) {
            System.out.println(i + ": " + applications.get(i).identity());
        }

        int selectedIndex = -1;

        while (selectedIndex < 0 || selectedIndex >= applications.size()) {
            try {
                selectedIndex = Console.readInteger("Enter the number of the application you want to select: ");
                if (selectedIndex < 0 || selectedIndex >= applications.size()) {
                    System.out.println("Invalid selection. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        jobApplication selectedApplication = applications.get(selectedIndex);
        System.out.println("You selected: " + selectedApplication.identity());

        System.out.println(selectedApplication.identity());
        System.out.println(selectedApplication.candidate());
        System.out.println(selectedApplication.jobOpening());
        System.out.println(selectedApplication.status());

        return true;
    }

    @Override
    public String headline() {
        return "Display Application Data";
    }
}
