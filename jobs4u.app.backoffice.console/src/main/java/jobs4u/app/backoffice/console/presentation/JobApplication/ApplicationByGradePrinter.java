package jobs4u.app.backoffice.console.presentation.JobApplication;


import core.management.jobApplication.domain.jobApplication;
import eapli.framework.visitor.Visitor;

public class ApplicationByGradePrinter implements Visitor<jobApplication> {

    private static final String HEADER_FORMAT = "| %-20s | %-30s | %-5s |%n";
    private static final String ROW_FORMAT = "| %-20s | %-30s | %-5s |%n";

    @Override
    public void visit(jobApplication visitee) {
        if (visitee == null) {
            return;
        }

        System.out.println("Job Opening: " + visitee.jobOpening().identity());
        printHeader();
        // Print table row for each application
        System.out.printf(ROW_FORMAT,
                visitee.candidate().getCandidateName().toString(),
                visitee.candidate().getCandidateEmail().toString(),
                visitee.getInterview().getInterviewGrade().getGrade()
        );
    }

    private void printHeader() {
        System.out.format("+----------------------+--------------------------------+-------+%n");
        System.out.format(HEADER_FORMAT, "Name", "Email", "Grade");
        System.out.format("+----------------------+--------------------------------+-------+%n");
    }

    private void printFooter() {
        System.out.format("+----------------------+--------------------------------+-------+%n");
    }
}