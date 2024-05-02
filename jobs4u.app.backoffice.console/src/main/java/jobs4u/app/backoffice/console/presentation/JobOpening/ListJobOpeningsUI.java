package jobs4u.app.backoffice.console.presentation.JobOpening;

import core.management.jobOpening.domain.JobOpening;
import eapli.framework.presentation.console.AbstractListUI;
import eapli.framework.visitor.Visitor;
import core.management.jobOpening.controller.ListJobOpeningsController;

/**
 * UI to display all job openings.
 */
public class ListJobOpeningsUI extends AbstractListUI<JobOpening> {

    private final ListJobOpeningsController theController = new ListJobOpeningsController();

    @Override
    public String headline() {
        return "List All Job Openings";
    }

    @Override
    protected String emptyMessage() {
        return "No job openings available.";
    }

    @Override
    protected Iterable<JobOpening> elements() {
        return theController.allJobOpenings();
    }

    @Override
    protected Visitor<JobOpening> elementPrinter() {
        return new JobOpeningPrinter();
    }

    @Override
    protected String elementName() {
        return "Job Opening";
    }

    @Override
    protected String listHeader() {
        return String.format("%-10s %-20s %-15s", "ID", "Title", "Location");
    }
}
