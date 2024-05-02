package core.management.jobOpening.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

public class Address implements ValueObject {
    private final String address;

    private Address(String address) {
        this.address = address;
    }

    public static Address valueOf(String address) {
        Preconditions.nonEmpty(address, "Address cannot be empty");
        // Additional validation logic can be added here
        return new Address(address);
    }

    @Override
    public String toString() {
        return address;
    }
}
