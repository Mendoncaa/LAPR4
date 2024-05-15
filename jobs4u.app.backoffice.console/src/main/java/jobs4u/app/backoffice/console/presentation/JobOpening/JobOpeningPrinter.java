package jobs4u.app.backoffice.console.presentation.JobOpening;

import core.management.jobOpening.domain.JobOpening;
import eapli.framework.visitor.Visitor;

public class JobOpeningPrinter implements Visitor<JobOpening> {
    @Override
    public void visit(JobOpening visitee) {
        System.out.printf("%-15s %-20s %-15s %-15s %-10s %-30s %-30s %-10s %-15s%n",
                visitee.JobReference().toString(),
                visitee.jobTitle().toString(),
                visitee.jobState().toString(),
                visitee.contractType().toString(),
                visitee.jobMode().toString(),
                visitee.description().toString(),
                visitee.address().toString(),
                visitee.numberOfVacancies().toString(),
                visitee.ActiveSince().toString()
        );
    }
}
