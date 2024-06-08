package core.management.jobOpening.domain;

import eapli.framework.domain.model.ValueObject;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode
@Embeddable
@Getter
public class JobReference implements ValueObject, Serializable, Comparable<JobReference> {
    @Column(nullable = false)
    private String customerCode;

    @Column(nullable = false)
    private int jobNumber;


    public JobReference(String customerCode, int jobNumber) {
        this.customerCode = customerCode;
        this.jobNumber = jobNumber;
    }


    public JobReference(String jobReference) {
        if (jobReference == null || jobReference.isEmpty()) {
            throw new IllegalArgumentException("Job reference cannot be null or empty");
        }
        // Extract the parts
        String[] parts = jobReference.split("-");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Invalid job reference format.");
        }
        this.customerCode = parts[0];
        this.jobNumber = Integer.parseInt(parts[1].replaceFirst("^0+", ""));
    }

    @Override
    public String toString() {
        return String.format("%s-%06d", customerCode, jobNumber);
    }

    @Override
    public int compareTo(JobReference o) {
        int customerCodeComparison = this.customerCode.compareTo(o.customerCode);
        if (customerCodeComparison == 0) {
            return Integer.compare(this.jobNumber, o.jobNumber);
        }
        return customerCodeComparison;
    }
}
