package jobs4u.app.backoffice.console.presentation.JobApplication;

import core.management.jobApplication.application.controller.ListOrderedApplicationsController;
import core.management.jobApplication.domain.jobApplication;
import eapli.framework.presentation.console.AbstractListUI;
import eapli.framework.visitor.Visitor;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@Transactional
public class ListOrderedApplicationsUI extends AbstractListUI<jobApplication> {

    private ListOrderedApplicationsController controller = new ListOrderedApplicationsController();

    private String jobReference;

    @Override
    protected Iterable<jobApplication> elements() {
        try {
            return controller.validateJobReference(jobReference);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected Visitor<jobApplication> elementPrinter() {
        return new ApplicationByGradePrinter();
    }

    @Override
    protected String elementName() {
        return "Application";
    }

    @Override
    protected String listHeader() {
        return "Ordered List of Applications";
    }

    @Override
    protected String emptyMessage() {
        return "No applications found for this job reference.";
    }

    @Override
    protected boolean doShow() {
        jobReference = askForJobReference();
        try {
            controller.validateJobReference(jobReference);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        return super.doShow();
    }

    private String askForJobReference() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the Job Reference: ");
        return scanner.nextLine();
    }

    @Override
    public String headline() {
        return "List Ordered Applications";
    }
}