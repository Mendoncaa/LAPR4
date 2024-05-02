package core.management.jobOpening.domain;

import eapli.framework.domain.model.ValueObject;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

public class Address implements ValueObject{
    private final String address;

    public Address(String address) {
        this.address = address;
    }
}
