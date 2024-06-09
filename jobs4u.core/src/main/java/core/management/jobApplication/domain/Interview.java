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
    private InterviewJustification interviewStatus;

    private Interview(InterviewDateTime interviewDateTime, InterviewGrade interviewGrade, InterviewJustification interviewStatus) {
        Preconditions.nonNull(interviewDateTime, "Interview date and time cannot be null");
        Preconditions.nonNull(interviewGrade, "Interview grade cannot be null");
        Preconditions.nonNull(interviewStatus, "Interview status cannot be null");
        this.interviewDateTime = interviewDateTime;
        this.interviewGrade = interviewGrade;
        this.interviewStatus = interviewStatus;
    }

    protected Interview() {
        this.interviewDateTime = null;
        this.interviewGrade = null;
        this.interviewStatus = null;
    }

    public static Interview valueOf(InterviewDateTime interviewDateTime, InterviewGrade interviewGrade, InterviewJustification interviewStatus) {
        return new Interview(interviewDateTime, interviewGrade, interviewStatus);
    }

    @Override
    public String toString() {
        return "Interview{" +
                "interviewDateTime=" + interviewDateTime +
                ", interviewGrade=" + interviewGrade +
                ", interviewStatus=" + interviewStatus +
                '}';
    }
    
}
