package core.management.jobOpening.domain;

import eapli.framework.domain.model.ValueObject;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor(access = AccessLevel.PROTECTED) // Keep the no-arg constructor for JPA
@EqualsAndHashCode
@Embeddable
@Getter
public class JobReference implements ValueObject, Serializable, Comparable<JobReference> {
    @Column(nullable = false)
    private String customerCode;

    @Column(nullable = false)
    private int jobNumber;

    // Regular constructor
    public JobReference(String customerCode, int jobNumber) {
        this.customerCode = customerCode;
        this.jobNumber = jobNumber;
    }

    // Constructor that accepts a single string e.g., "ISP2"
    public JobReference(String jobReference) {
        if (jobReference == null || jobReference.isEmpty()) {
            throw new IllegalArgumentException("Job reference cannot be null or empty");
        }
        // Extract the parts
        String[] parts = jobReference.split("(?<=\\D)(?=\\d)");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Invalid job reference format.");
        }
        this.customerCode = parts[0];
        try {
            this.jobNumber = Integer.parseInt(parts[1]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number format in job reference.");
        }
    }

    @Override
    public String toString() {
        return customerCode + jobNumber;
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
