package core.management.jobOpening.domain.RecruitmentProcess;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

import java.time.LocalDate;

public class EndDate implements ValueObject {
    private final LocalDate date;

    private EndDate(LocalDate date) {
        this.date = date;
    }

    public static EndDate valueOf(String dateString) {
        Preconditions.nonEmpty(dateString, "End date cannot be empty");
        LocalDate date = LocalDate.parse(dateString);
        return new EndDate(date);
    }

    @Override
    public String toString() {
        return date.toString();
    }
}
