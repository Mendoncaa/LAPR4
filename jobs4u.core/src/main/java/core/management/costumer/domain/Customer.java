package core.management.costumer.domain;

import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "CUSTOMER") // Explicit table name definition
@Access(AccessType.FIELD) // Explicitly setting field access for consistency
public class Customer implements AggregateRoot<CustomerCode> {

    // Getters for all fields
    @EmbeddedId
    @Column(unique = true, nullable = false)
    private CustomerCode customerCode;

    @Embedded
    @Column(nullable = false)
    private Address address;

    @Embedded
    @Column(nullable = false)
    private CustomerName customerName;

    @Embedded
    @Column(nullable = false)
    private Username customerRepresentative;

    @OneToOne
    @JoinColumn(name = "system_user_id")
    private SystemUser costumerManager;

    public Customer(CustomerCode customerCode, Address address, CustomerName customerName, Username customerRepresentative, SystemUser costumerManager) {
        if (customerCode == null || address == null || customerName == null || customerRepresentative == null) {
            throw new IllegalArgumentException("None of the fields can be null");
        }
        this.customerCode = customerCode;
        this.address = address;
        this.customerName = customerName;
        this.customerRepresentative = customerRepresentative;
        this.costumerManager = costumerManager;
    }

    protected Customer() {

    }

    @Override
    public boolean sameAs(Object other) {
        if (this == other) return true;
        if (!(other instanceof Customer that)) return false;
        return this.customerCode.equals(that.customerCode);
    }

    @Override
    public CustomerCode identity() {
        return this.customerCode;
    }


}
