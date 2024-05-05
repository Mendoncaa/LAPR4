package core.management.costumer.builder;


import core.management.costumer.domain.CustomerCode;
import core.management.costumer.domain.CustomerRepresentative;
import core.management.costumer.domain.Customer;
import core.management.costumer.domain.PhoneNumber;
import eapli.framework.domain.model.DomainFactory;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

public class CustomerBuilder implements DomainFactory<CustomerRepresentative> {

    private SystemUser systemUser;
    private CustomerCode customerCode;
    private PhoneNumber phoneNumber;
    private SystemUser customerManager;



    public CustomerBuilder withSystemUser(SystemUser systemUser) {
        this.systemUser = systemUser;
        return this;
    }

    public CustomerBuilder withCompany (CustomerCode customerCode){
        this.customerCode=customerCode;
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
        return new CustomerRepresentative(systemUser,customerCode,phoneNumber, customerManager);
    }

}
