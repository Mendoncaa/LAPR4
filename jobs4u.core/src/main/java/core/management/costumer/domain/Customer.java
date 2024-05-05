package core.management.costumer.domain;

import eapli.framework.domain.model.AggregateRoot;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "CUSTOMER")
public class Customer implements AggregateRoot<CustomerCode> {

    @EmbeddedId
    private CustomerCode customerCode;

    @Embedded
    private Address address;

    @Embedded
    private CustomerName customerName;

    public Customer(CustomerCode customerCode, Address address, CustomerName customerName) {
        if (customerCode == null || address == null || customerName == null) {
            throw new IllegalArgumentException("None of the fields can be null");
        }
        this.customerCode = customerCode;
        this.address = address;
        this.customerName = customerName;
        
    }

    protected Customer() {
        // for JPA
    }

    @Override
    public boolean sameAs(Object other) {
        if (this == other) return true;
        if (!(other instanceof Customer)) return false;
        Customer that = (Customer) other;
        return this.customerCode != null && this.customerCode.equals(that.customerCode);
    }

    @Override
    public CustomerCode identity() {
        return this.customerCode;
    }
}
