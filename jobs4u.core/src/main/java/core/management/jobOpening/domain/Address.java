package core.management.jobOpening.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;
import lombok.Getter;
import jakarta.persistence.Embeddable;

@Getter
@Embeddable
public class Address implements ValueObject {
    private final String street;
    private final int doorNumber;
    private final String floor;
    private final String postalCode;

    private Address(String street, int doorNumber, String floor, String postalCode) {
        Preconditions.nonEmpty(street, "Street cannot be empty");
        Preconditions.nonEmpty(floor, "Floor cannot be empty");
        Preconditions.nonEmpty(postalCode, "Postal code cannot be empty");
        Preconditions.ensure(postalCode.matches("\\d{4}-\\d{3}"), "Postal code must be in the format 1000-123");
        this.street = street;
        this.doorNumber = doorNumber;
        this.floor = floor;
        this.postalCode = postalCode;
    }

    protected Address() {
        this.street = null;
        this.doorNumber = -1;
        this.floor = null;
        this.postalCode = null;
    }

    public static Address valueOf(String street, int doorNumber, String floor, String postalCode) {
        return new Address(street, doorNumber, floor, postalCode);
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %s, %s", street, doorNumber, floor, postalCode);
    }
}
