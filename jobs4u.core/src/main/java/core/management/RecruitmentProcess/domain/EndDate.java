package core.management.RecruitmentProcess.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;
import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Embeddable
public class EndDate implements ValueObject {
    private final LocalDate endDate;

    public EndDate(LocalDate date) {

        this.endDate = date;
    }

    public EndDate() {
        this.endDate = LocalDate.now();
    }

    public static EndDate valueOf(String dateString) {
        Preconditions.nonEmpty(dateString, "End date cannot be empty");
        LocalDate date = LocalDate.parse(dateString);
        return new EndDate(date);
    }

    @Override
    public String toString() {
        return endDate.toString();
    }
}
