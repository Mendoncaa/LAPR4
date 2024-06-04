package jobs4u.app.candidate.console.presentation.application;

import core.management.jobApplication.application.controller.ListApplicationsForJobOpeningController;
import core.management.jobApplication.domain.jobApplication;
import core.management.jobOpening.controller.ListJobOpeningsController;
import core.management.jobOpening.domain.JobOpening;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ListMyApplicationsUI extends AbstractUI {

    private final ListApplicationsForJobOpeningController theController = new ListApplicationsForJobOpeningController();
    private static final Logger LOGGER = LoggerFactory.getLogger(ListMyApplicationsUI.class);

    @Override
    protected boolean doShow() {

        List<jobApplication> applications = theController.listAllMyApplications();

        if (applications.isEmpty()) {
            System.out.println("No applications found.");
        } else {
            System.out.println("My Applications:");
            for (jobApplication application : applications) {
                System.out.println(application.getJobOpening().getJobReference().toString() + " - " + application.getStatus() + " (" + theController.getNumberOfApplicants(application.getJobOpening()) + " applicant(s) for this Job Opening)");
            }
        }

        return false;
    }

    @Override
    public String headline() {
        return "List All my Applications";
    }

}


