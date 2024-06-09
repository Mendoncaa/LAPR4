package core.management.jobApplication.domain;

import core.management.jobOpening.domain.JobTitle;
import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;
import jakarta.persistence.Embeddable;

@Embeddable
public class InterviewJustification implements ValueObject {

    private String interviewJustification;

    private InterviewJustification(String justification) {
        Preconditions.nonEmpty(justification, "Justification cannot be empty");
        this.interviewJustification = justification;
    }

    protected InterviewJustification() {
        this.interviewJustification = null;
    }

    public static InterviewJustification valueOf(String justification) {
        return new InterviewJustification(justification);
    }

    @Override
    public String toString() {
        return interviewJustification;
    }

}
