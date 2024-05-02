package jobs4u.app.backoffice.console.presentation.JobOpening;

import core.management.jobOpening.domain.JobOpening;
import eapli.framework.visitor.Visitor;

public class JobOpeningPrinter implements Visitor<JobOpening> {
    @Override
    public void visit(JobOpening visitee) {
        System.out.printf("%-10s %-20s %-15s %-10s %-10s %-10s %-15s %-10s%n",
                visitee.jobReference().toString(),  // Assume JobReference has a toString method
                visitee.jobTitle().toString(),      // Assume JobTitle has a toString method
                visitee.address().toString(),       // Assume Address has a toString method
                visitee.contractType().toString(),  // Assume ContractType has a toString method
                visitee.jobMode().toString(),       // Assume JobMode has a toString method
                visitee.jobState().toString(),      // Assume JobState has a toString method
                visitee.description().toString(),   // Assume Description has a toString method
                visitee.numberOfVacancies().toString() // Assume NumberOfVacancies has a toString method
        );
    }
}
