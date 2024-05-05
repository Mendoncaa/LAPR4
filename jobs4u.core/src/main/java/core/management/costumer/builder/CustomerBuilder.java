package core.management.costumer.builder;


import core.management.costumer.domain.CustomerRepresentative;
import core.management.costumer.domain.Customer;
import core.management.costumer.domain.PhoneNumber;
import eapli.framework.domain.model.DomainFactory;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

public class CustomerBuilder implements DomainFactory<CustomerRepresentative> {

    private SystemUser systemUser;
    private Customer customer;
    private PhoneNumber phoneNumber;
    private SystemUser customerManager;



    public CustomerBuilder withSystemUser(SystemUser systemUser) {
        this.systemUser = systemUser;
        return this;
    }

    public CustomerBuilder withCompany (Customer customer){
        this.customer=customer;
        return this;
    }
    public CustomerBuilder withPhoneNumber(PhoneNumber phoneNumber){
        this.phoneNumber=phoneNumber;
        return this;
    }

    public CustomerBuilder withCustomManager(SystemUser systemUser){
        this.customerManager=systemUser;
        return this;
    }


@Override
    public CustomerRepresentative build(){
        return new CustomerRepresentative(systemUser,customer,phoneNumber, customerManager);
    }

}
