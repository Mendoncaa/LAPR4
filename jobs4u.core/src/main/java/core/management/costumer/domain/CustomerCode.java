package core.management.costumer.domain;

import eapli.framework.domain.model.ValueObject;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode
@Embeddable
public class CustomerCode implements ValueObject, Comparable<CustomerCode> {

    private String customerCode;

    @Override
    public String toString() {
        return customerCode;
    }

    @Override
    public int compareTo(CustomerCode o) {
        return customerCode.compareTo(o.customerCode);
    }

    public CustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }
}
