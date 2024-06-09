package core.management.RecruitmentProcess.domain;

import eapli.framework.domain.model.ValueObject;
import lombok.Getter;

@Getter
public enum PhaseName implements ValueObject {
    APPLICATION,
    SCREENING,
    INTERVIEWS,
    ANALYSIS,
    RESULT
}
