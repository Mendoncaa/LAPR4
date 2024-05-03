package jobs4u.app.backoffice.console.presentation.JobOpening;

import core.management.jobOpening.domain.JobOpening;
import eapli.framework.visitor.Visitor;

public class JobOpeningPrinter implements Visitor<JobOpening> {
    @Override
    public void visit(JobOpening visitee) {
        System.out.printf("%-10s %-20s %-15s %-10s %-10s %-10s %-15s %-10s%n",
                visitee.identity().toString(),  // Assume JobReference has a toString method
                visitee.getJobTitle().toString(),      // Assume JobTitle has a toString method
                visitee.getAddress().toString(),       // Assume Address has a toString method
                visitee.getContractType().toString(),  // Assume ContractType has a toString method
                visitee.getMode().toString(),       // Assume JobMode has a toString method
                visitee.getJobState().toString(),      // Assume JobState has a toString method
                visitee.getDescription().toString(),   // Assume Description has a toString method
                visitee.getNumberOfVacancies().toString() // Assume NumberOfVacancies has a toString method
        );
    }
}
