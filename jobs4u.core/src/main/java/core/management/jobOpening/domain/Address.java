package core.management.jobOpening.domain;

import eapli.framework.domain.model.ValueObject;

public class Address implements ValueObject {
    private final String address;

    public Address(String address) {
        if (address == null || address.trim().isEmpty()) {
            throw new IllegalArgumentException("Address cannot be empty");
        }
        this.address = address;
    }
}
