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
public class Interview implements ValueObject {

    @Embedded
    private InterviewDateTime interviewDateTime;

    @Embedded
    private InterviewGrade interviewGrade;

    @Embedded
    private InterviewJustification interviewJustification;

    private Interview(InterviewDateTime interviewDateTime, InterviewGrade interviewGrade, InterviewJustification interviewJustification) {
        Preconditions.nonNull(interviewDateTime, "Interview date and time cannot be null");
        Preconditions.nonNull(interviewGrade, "Interview grade cannot be null");
        Preconditions.nonNull(interviewJustification, "Interview status cannot be null");
        this.interviewDateTime = interviewDateTime;
        this.interviewGrade = interviewGrade;
        this.interviewJustification = interviewJustification;
    }

    public Interview() {
        this.interviewDateTime = null;
        this.interviewGrade = null;
        this.interviewJustification = null;
    }

    public static Interview valueOf(InterviewDateTime interviewDateTime, InterviewGrade interviewGrade, InterviewJustification interviewJustification) {
        return new Interview(interviewDateTime, interviewGrade, interviewJustification);
    }

    @Override
    public String toString() {
        return "Interview{" +
                "interviewDateTime=" + interviewDateTime +
                ", interviewGrade=" + interviewGrade +
                ", interviewJustification=" + interviewJustification +
                '}';
    }
    
}
