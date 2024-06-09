package core.management.jobApplication.domain;

import eapli.framework.domain.model.ValueObject;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class InterviewGrade implements ValueObject {

    private int grade;

    private InterviewGrade(int grade) {
        if(grade < 0){
            throw new IllegalArgumentException("Grade cannot be negative");
        }
        this.grade = grade;
    }

    protected InterviewGrade() {
        this.grade = 0;
    }

    public static InterviewGrade valueOf(int grade) {
        return new InterviewGrade(grade);
    }

    @Override
    public String toString() {
        return String.valueOf(grade);
    }
}
