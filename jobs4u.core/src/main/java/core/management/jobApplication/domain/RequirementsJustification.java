package core.management.jobApplication.domain;

import eapli.framework.validations.Preconditions;
import jakarta.persistence.Embeddable;

@Embeddable
public class RequirementsJustification {

    private String requirementJustification;

    private RequirementsJustification(String justification) {
        Preconditions.nonEmpty(justification, "Justification cannot be empty");
        this.requirementJustification = justification;
    }

    protected RequirementsJustification() {
        this.requirementJustification = null;
    }

    public static RequirementsJustification valueOf(String justification) {
        return new RequirementsJustification(justification);
    }

    @Override
    public String toString() {
        return requirementJustification;
    }

}
