package core.management.RecruitmentProcess.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;
import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Embeddable
public class StartDate implements ValueObject {
    private final LocalDate startDate;

    public StartDate(LocalDate date) {

        this.startDate = date;
    }

    public StartDate() {
        this.startDate = LocalDate.now();
    }

    public static StartDate valueOf(String dateString) {
        Preconditions.nonEmpty(dateString, "Start date cannot be empty");
        LocalDate date = LocalDate.parse(dateString);
        return new StartDate(date);
    }

    @Override
    public String toString() {
        return startDate.toString();
    }
}
