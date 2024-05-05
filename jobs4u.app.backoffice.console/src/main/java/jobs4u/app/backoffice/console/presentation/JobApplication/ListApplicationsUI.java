/*package jobs4u.app.backoffice.console.presentation.JobApplication;

import core.management.jobApplication.application.controller.ListApplicationsForJobOpeningController;
import core.management.jobApplication.domain.Application;
import eapli.framework.presentation.console.AbstractListUI;
import eapli.framework.visitor.Visitor;

public class ListApplicationsUI extends AbstractListUI<Application> {
    private final ListApplicationsForJobOpeningController theController = new ListApplicationsForJobOpeningController();

    @Override
    public String headline() {
        return "List All Applications";
    }

    @Override
    protected String emptyMessage() {
        return "No applications found.";
    }

    @Override
    protected Iterable<Application> elements() {
        return theController.allApplications();
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
        return String.format("%-10s %-30s %-20s %-15s", "App ID", "Candidate Name", "Job Opening ID", "Status");
    }
}
*/