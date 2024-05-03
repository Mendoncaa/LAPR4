package core.management.jobOpening.domain.RecruitmentProcess;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;
import jakarta.persistence.Embeddable;

import java.time.LocalDate;

@Embeddable
public class StartDate implements ValueObject {
    private final LocalDate startDate;

    private StartDate(LocalDate date) {
        this.startDate = date;
    }

    public StartDate() {
        this.startDate = LocalDate.now();
    }

    public static StartDate valueOf(String dateString) {
        Preconditions.nonEmpty(dateString, "Start date cannot be empty");
        LocalDate date = LocalDate.parse(dateString); // Assuming date is in standard ISO format
        return new StartDate(date);
    }

    @Override
    public String toString() {
        return startDate.toString();
    }
}

