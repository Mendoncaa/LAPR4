package core.management.jobApplication.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;
import jakarta.persistence.Embeddable;

import java.util.Date;

@Embeddable
public class InterviewDateTime implements ValueObject {

    private Date date;

    private InterviewDateTime(Date date) {
        Preconditions.nonNull(date, "Date cannot be null");
        this.date = date;
    }

    protected InterviewDateTime() {
        this.date = null;
    }

    public static InterviewDateTime valueOf(Date date) {
        return new InterviewDateTime(date);
    }

    @Override
    public String toString() {
        return date.toString();
    }

}
