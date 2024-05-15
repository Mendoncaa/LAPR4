package core.management.costumer.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;
import jakarta.persistence.Embeddable;

@Embeddable
public class Address implements ValueObject {
    private final String street;
    private final String city;
    private final String postalCode;

    public Address(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public Address() {
        street = "";
        city = "";
        postalCode = "";
    }

    public static Address valueOf(String street, String city, String postalCode) {
        Preconditions.nonEmpty(street, "Street cannot be empty");
        Preconditions.nonEmpty(city, "City cannot be empty");
        Preconditions.nonEmpty(postalCode, "Postal code cannot be empty");
        // Additional validation logic can be added here
        return new Address(street, city, postalCode);
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + postalCode;
    }
}