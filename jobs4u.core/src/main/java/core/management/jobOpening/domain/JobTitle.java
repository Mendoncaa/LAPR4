package core.management.jobOpening.domain;

import eapli.framework.domain.model.ValueObject;

public class JobTitle implements ValueObject {
    private final String jobTitle;

    public JobTitle(String jobTitle) {
        if (jobTitle == null || jobTitle.trim().isEmpty()) {
            throw new IllegalArgumentException("Job title cannot be empty");
        }
        this.jobTitle = jobTitle;
    }
}
