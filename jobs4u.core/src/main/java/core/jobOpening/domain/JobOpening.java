package core.jobOpening.domain;

import javax.persistence.*;
import java.util.Date;

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
    private NrVacancies nrVacancies;

    @Embedded
    private ContractType contractType;

    @Embedded
    private JobMode jobMode;

    @Embedded
    private JobState jobState;

    @Embedded
    private JobActiveSinceDate jobActiveSinceDate;

    public JobOpening(JobReference jobReference, ContractType contractType, JobMode jobMode, JobState jobState,
                      JobActiveSinceDate jobActiveSinceDate, Title title, Description description,
                      Address address, NrVacancies nrVacancies) {
        this.jobReference = jobReference;
        this.contractType = contractType;
        this.jobMode = jobMode;
        this.jobState = jobState;
        this.jobActiveSinceDate = jobActiveSinceDate;
        this.title = title;
        this.description = description;
        this.address = address;
        this.nrVacancies = nrVacancies;
    }

    // Getters and setters for all fields

    @Embeddable
    public static class ContractType {
        @Enumerated(EnumType.STRING)
        @Column(name = "contract_type")
        private Type value;

        public ContractType(Type value) {
            this.value = value;
        }

        public Type getValue() {
            return value;
        }

        public void setValue(Type value) {
            this.value = value;
        }

        public enum Type {
            FULL_TIME, PART_TIME
        }
    }

    @Embeddable
    public static class JobMode {
        @Enumerated(EnumType.STRING)
        @Column(name = "job_mode")
        private Mode value;

        public JobMode(Mode value) {
            this.value = value;
        }

        public Mode getValue() {
            return value;
        }

        public void setValue(Mode value) {
            this.value = value;
        }

        public enum Mode {
            REMOTE, HYBRID, ONSITE
        }
    }

    @Embeddable
    public static class JobReference {
        @Column(name = "job_reference")
        private String value;

        public JobReference(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    @Embeddable
    public static class JobState {
        @Enumerated(EnumType.STRING)
        @Column(name = "job_state")
        private State value;

        public JobState(State value) {
            this.value = value;
        }

        public State getValue() {
            return value;
        }

        public void setValue(State value) {
            this.value = value;
        }

        public enum State {
            OPEN, CLOSED
        }
    }

    @Embeddable
    public static class JobActiveSinceDate {
        @Column(name = "job_active_since_date")
        private Date value;

        public JobActiveSinceDate(Date value) {
            this.value = value;
        }

        public Date getValue() {
            return value;
        }

        public void setValue(Date value) {
            this.value = value;
        }
    }

}
