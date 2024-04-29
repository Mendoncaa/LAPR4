package core.jobOpening.domain;

import core.domain.Address;
import core.domain.Description;
import core.domain.Title;

import javax.persistence.*;

@Entity
@Table(name = "job_opening")
public class JobOpening {

    @Id
    @Embedded
    @Column(unique = true, nullable = false)
    private JobReference jobReference;

    @Embedded
    @Column(nullable = false)
    private Title title;

    @Embedded
    @Column(nullable = false)
    private Description description;

    @Embedded
    @Column(nullable = false)
    private Address address;

    @Embedded
    @Column(nullable = false)
    private JobNrVacancies jobNrVacancies;

    @Embedded
    @Column(nullable = false)
    private JobContractType jobContractType;

    @Embedded
    @Column(nullable = false)
    private JobMode jobMode;

    @Embedded
    @Column(nullable = false)
    private JobState jobState;

    @Embedded
    @Column(nullable = false)
    private JobActiveSinceDate jobActiveSinceDate;

    public JobOpening(JobReference jobReference, JobContractType jobContractType, JobMode jobMode, JobState jobState,
                      JobActiveSinceDate jobActiveSinceDate, Title title, Description description,
                      Address address, JobNrVacancies jobNrVacancies) {
        this.jobReference = jobReference;
        this.jobContractType = jobContractType;
        this.jobMode = jobMode;
        this.jobState = jobState;
        this.jobActiveSinceDate = jobActiveSinceDate;
        this.title = title;
        this.description = description;
        this.address = address;
        this.jobNrVacancies = jobNrVacancies;
    }
}