package core.management.jobOpening.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;
import jakarta.persistence.Embeddable;
import lombok.Getter;


@Getter
@Embeddable
public class JobTitle implements ValueObject {
    private final String jobTitle;

    private JobTitle(String jobTitle) {
        Preconditions.nonEmpty(jobTitle, "Job title cannot be empty");
        this.jobTitle = jobTitle;
    }

    protected JobTitle() {
        this.jobTitle = null;
    }

    public static JobTitle valueOf(String jobTitle) {
        return new JobTitle(jobTitle);
    }
}

