package jobs4u.app.backoffice.console.presentation.JobOpening;

import core.management.jobOpening.domain.JobOpening;
import eapli.framework.visitor.Visitor;

public class JobOpeningPrinter implements Visitor<JobOpening> {
    @Override
    public void visit(JobOpening visitee) {
        System.out.printf("%-10s %-20s %-15s %-10s %-10s %-10s %-15s %-10s%n",
                visitee.JobReference().toString(),
                visitee.jobTitle().toString(),
                visitee.address().toString(),
                visitee.contractType().toString(),
                visitee.jobMode().toString(),
                visitee.jobState().toString(),
                visitee.description().toString(),
                visitee.numberOfVacancies().toString(),
                visitee.ActiveSince().toString()
        );
    }
}
