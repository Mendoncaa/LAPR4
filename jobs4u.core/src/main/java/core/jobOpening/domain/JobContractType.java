package core.jobOpening.domain;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class JobContractType {
    @Enumerated(EnumType.STRING)
    @Column(name = "contract_type")
    private Type value;

    public JobContractType(Type value) {
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