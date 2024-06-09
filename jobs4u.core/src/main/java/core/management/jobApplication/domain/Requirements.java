package core.management.jobApplication.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Requirements implements ValueObject {

    private RequirementsEvaluation requirementEvaluation;

    @Embedded
    private RequirementsJustification requirementJustification;

    private Requirements(RequirementsEvaluation requirementEvaluation, RequirementsJustification requirementJustification) {
        Preconditions.nonNull(requirementEvaluation, "Requirement Evaluation cannot be null");
        Preconditions.nonNull(requirementJustification, "Requirement Justification cannot be null");
        this.requirementEvaluation = requirementEvaluation;
        this.requirementJustification = requirementJustification;
    }

    protected Requirements() {
        this.requirementEvaluation = RequirementsEvaluation.PENDING;
        this.requirementJustification = null;
    }

    public static Requirements valueOf(RequirementsEvaluation requirementEvaluation, RequirementsJustification requirementJustification) {
        return new Requirements(requirementEvaluation, requirementJustification);
    }

    @Override
    public String toString() {
        return requirementEvaluation.toString() + " - " + requirementJustification.toString();
    }
}
