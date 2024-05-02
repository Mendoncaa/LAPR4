package core.management.jobOpening.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

public class JobTitle implements ValueObject {
    private final String jobTitle;

    private JobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public static JobTitle valueOf(String jobTitle) {
        Preconditions.nonEmpty(jobTitle, "Job title cannot be empty");
        // Additional validation logic can be added here
        return new JobTitle(jobTitle);
    }

    @Override
    public String toString() {
        return jobTitle;
    }
}
