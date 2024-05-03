package core.management.jobOpening.domain.RecruitmentProcess;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

import java.time.LocalDate;

public class StartDate implements ValueObject {
    private final LocalDate date;

    private StartDate(LocalDate date) {
        this.date = date;
    }

    public static StartDate valueOf(String dateString) {
        Preconditions.nonEmpty(dateString, "Start date cannot be empty");
        LocalDate date = LocalDate.parse(dateString); // Assuming date is in standard ISO format
        return new StartDate(date);
    }

    @Override
    public String toString() {
        return date.toString();
    }
}

