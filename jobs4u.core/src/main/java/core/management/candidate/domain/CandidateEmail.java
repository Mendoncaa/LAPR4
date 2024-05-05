package core.management.candidate.domain;

import eapli.framework.domain.model.ValueObject;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode
@Embeddable
public class CandidateEmail implements ValueObject, Comparable<CandidateEmail> {

    private String customerCode;

    @Override
    public String toString() {
        return customerCode;
    }

    @Override
    public int compareTo(CandidateEmail o) {
        return customerCode.compareTo(o.customerCode);
    }

    public CandidateEmail(String customerCode) {
        this.customerCode = customerCode;
    }
}