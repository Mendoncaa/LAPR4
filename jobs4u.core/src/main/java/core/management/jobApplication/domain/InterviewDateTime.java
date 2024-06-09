package core.management.jobApplication.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;
import jakarta.persistence.Embeddable;

import java.time.LocalDate;

@Embeddable
public class InterviewDateTime implements ValueObject {

    private LocalDate date;

    private InterviewDateTime(LocalDate date) {
        Preconditions.nonNull(date, "Date cannot be null");
        this.date = date;
    }

    protected InterviewDateTime() {
        this.date = null;
    }

    public static InterviewDateTime valueOf(LocalDate date) {
        return new InterviewDateTime(date);
    }

    @Override
    public String toString() {
        return date.toString();
    }

}
