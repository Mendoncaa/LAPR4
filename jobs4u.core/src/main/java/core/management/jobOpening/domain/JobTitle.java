package core.management.jobOpening.domain;


import eapli.framework.domain.model.ValueObject;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;
import shared.exception.DomainInvariantViolatedException;

import java.io.Serializable;

@NoArgsConstructor
@Embeddable
public class JobTitle implements ValueObject{

    @Column(length = 100, nullable = false)
    private String jobTitle;

    @Override
    public String toString() {
        return jobTitle;
    }

    public JobTitle (String jobTitle) throws DomainInvariantViolatedException {
        if (jobTitle == null) {
            throw new DomainInvariantViolatedException("The title is invalid!");
        }
        if(jobTitle.length() > 100) {
            throw new DomainInvariantViolatedException("The JobOpening name is too long!");
        }
        this.jobTitle = jobTitle;
    }

}
