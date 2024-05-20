package jobs4u.app.backoffice.console.presentation.JobApplication;

import core.management.jobApplication.application.controller.ListApplicationsForJobOpeningController;
import core.management.jobApplication.domain.jobApplication;
import core.management.jobOpening.controller.ListJobOpeningsController;
import core.management.jobOpening.domain.JobOpening;
import core.utentemanagement.domain.SignupRequest;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractListUI;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;
import eapli.framework.visitor.Visitor;
import jobs4u.app.backoffice.console.presentation.JobOpening.JobOpeningPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ListApplicationsForJobOpeningUI extends AbstractUI {

    private final ListApplicationsForJobOpeningController theController = new ListApplicationsForJobOpeningController();
    private static final Logger LOGGER = LoggerFactory.getLogger(ListApplicationsForJobOpeningUI.class);
    private final ListJobOpeningsController jobOpeningsController = new ListJobOpeningsController();

    @Override
    protected boolean doShow() {
        List<JobOpening> JobOpenings = (List<JobOpening>) this.jobOpeningsController.allJobOpenings();
        if (JobOpenings.isEmpty()) {
            System.out.println("No job openings found.");
            return false;
        }
        final SelectWidget<JobOpening> selector = new SelectWidget<>("Select JobOpening",
                this.jobOpeningsController.allJobOpenings(), new JobOpeningPrinter());
        selector.show();
        final JobOpening jobOpening = selector.selectedElement();
        if (jobOpening != null) {
            try {
                List<jobApplication> applications = (List<jobApplication>) theController.applicationsForJob(jobOpening);
                if (applications.isEmpty()) {
                    System.out.println("No applications found for the selected job opening.");
                    return false;
                }
                System.out.println("-------------------------------------------------");
                System.out.printf("#   %-15s %-20s %-10s\n", "Job Reference", "Candidate Name", "Status");
                int count = 1;

                for (jobApplication application : applications) {
                    System.out.printf("%-3s %-15s %-20s %-10s\n",count, application.getJobOpening().getJobReference().toString(), application.getCandidate().getCandidateName().toString(), application.getStatus());
                }
            } catch (IntegrityViolationException | ConcurrencyException ex) {
                LOGGER.error("Error performing the operation", ex);
                System.out.println(
                        "Unfortunatelly there was an unexpected error in the application. Please try again and if the problem persists, contact your system admnistrator.");
            }
        }
        return false;
    }

    @Override
    public String headline() {
        return "List Applications for Job Opening";
    }

}


