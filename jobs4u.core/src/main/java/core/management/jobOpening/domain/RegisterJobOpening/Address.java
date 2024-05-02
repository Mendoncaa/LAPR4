package core.management.jobOpening.domain.RegisterJobOpening;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

public class Address {
    private final String address;

    public Address(String address) {
        this.address = address;
    }
}
