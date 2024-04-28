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
    private NrVacancies nrVacancies;

    @Embedded
    private Title Title;

    @Embedded
    private ContractType contractType;

    @Embedded
    private Description description;

    @Embedded
    private Address address;

    @Embedded
    private JobMode jobMode;

    @Embedded
    private JobState jobState;

    @Embedded
    private JobActiveSinceDate jobActiveSinceDate;


    // Value Objects and Enums are defined here as inner classes



    @Embeddable
    public static class ContractType {
        public enum Type {
            FULL_TIME, PART_TIME
        }

        @Column(name = "contract_type")
        @Enumerated(EnumType.STRING)
        private Type value;
    }

    @Embeddable
    public static class JobMode {
        public enum Mode {
            REMOTE, HYBRID, ONSITE
        }

        @Column(name = "job_mode")
        @Enumerated(EnumType.STRING)
        private Mode value;
    }

    @Embeddable
    public static class JobReference {
        @Column(name = "job_reference")
        private String value;
    }

    @Embeddable
    public static class JobState {
        public enum State {
            OPEN, CLOSED
        }

        @Column(name = "job_state")
        @Enumerated(EnumType.STRING)
        private State value;
    }

    @Embeddable
    public static class JobActiveSinceDate {
        @Column(name = "job_active_since_date")
        private Date value;
    }

   

    // Standard getters and setters for all fields and inner classes
}
