package core.management.costumer.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;
import jakarta.persistence.Embeddable;

@Embeddable
public class CustomerName implements ValueObject {
    private final String customerName;
    

    public CustomerName(String customerName) {
        this.customerName = customerName;
        
    }

    public CustomerName() {
        this.customerName = "";
    }

    public static CustomerName valueOf(String customerName, String lastName) {
        Preconditions.nonEmpty(customerName, "First name cannot be empty");
        // Additional validation logic can be added here
        return new CustomerName(customerName);
    }

    @Override
    public String toString() {
        return customerName;
    }
}