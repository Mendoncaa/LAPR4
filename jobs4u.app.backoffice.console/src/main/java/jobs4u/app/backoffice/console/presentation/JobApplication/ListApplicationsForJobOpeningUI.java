/*package jobs4u.app.backoffice.console.presentation.JobApplication;

import core.management.jobApplication.application.controller.ListApplicationsForJobOpeningController;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractListUI;
import eapli.framework.visitor.Visitor;
import jobs4u.Application;

public class ListApplicationsForJobOpeningUI extends AbstractListUI<Application> {

    private final ListApplicationsForJobOpeningController theController = new ListApplicationsForJobOpeningController();

    @Override
    public String headline() {
        return "List Applications for Job Opening";
    }

    @Override
    protected String emptyMessage() {
        return "No applications found.";
    }

    @Override
    protected Iterable<Application> elements() {
        String jobReference = Console.readLine("Enter Job Reference ID to list applications:");
        return theController.applicationsForJob(jobReference);
    }

    @Override
    protected Visitor<Application> elementPrinter() {
        return new ApplicationPrinter();
    }

    @Override
    protected String elementName() {
        return "Application";
    }

    @Override
    protected String listHeader() {
        return String.format("%-10s %-20s %-15s", "App ID", "Applicant Name", "Status");
    }
}
*/

