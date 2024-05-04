package core.management.costumer.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;
import jakarta.persistence.Embeddable;

@Embeddable
public class CustomerName implements ValueObject {
    private final String firstName;
    private final String lastName;

    public CustomerName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public CustomerName() {
        this.firstName = "";
        this.lastName = "";
    }

    public static CustomerName valueOf(String firstName, String lastName) {
        Preconditions.nonEmpty(firstName, "First name cannot be empty");
        Preconditions.nonEmpty(lastName, "Last name cannot be empty");
        // Additional validation logic can be added here
        return new CustomerName(firstName, lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}