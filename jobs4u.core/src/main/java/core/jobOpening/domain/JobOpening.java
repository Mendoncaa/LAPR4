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
    private JobReference jobReference;

    @Embedded
    private Title title;

    @Embedded
    private Description description;

    @Embedded
    private Address address;

    @Embedded
    private JobNrVacancies jobNrVacancies;

    @Embedded
    private JobContractType jobContractType;

    @Embedded
    private JobMode jobMode;

    @Embedded
    private JobState jobState;

    @Embedded
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