package core.management.jobOpening.domain.RegisterJobOpening;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

public class ContractType {
    private final String contractType;

    public ContractType(String contractType) {
        this.contractType = contractType;
    }

    public static ContractType valueOf(String upperCase) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'valueOf'");
    }
}
