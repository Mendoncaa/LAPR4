/*
 * Copyright (c) 2013-2024 the original author or authors.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package core.management.costumer.domain;

import core.management.user.domain.ExemploRoles;
import jakarta.persistence.*;

import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import lombok.Getter;

import java.io.File;

/**
 * A Client Representative.
 * This class represents client users. It follows a DDD approach where User
 * is the root entity of the Base User Aggregate and all of its properties
 * are instances of value objects. A Client User references a System User
 * This approach may seem a little more complex than just having String or
 * native type attributes but provides for real semantic of the domain and
 * follows the Single Responsibility Pattern
 *
 * @author Jorge Santos ajs@isep.ipp.pt
 */
@Entity
@Embeddable
public class CustomerRepresentative implements AggregateRoot<PhoneNumber> {

    private static final long serialVersionUID = 1L;

    @Version
    private Long version;

    @EmbeddedId
    private PhoneNumber phoneNumber;
    

    @ManyToOne()
    private SystemUser customerManager;

    @Embedded
    private CustomerCode customerCode;


    @OneToOne()
    private SystemUser systemUser;

    public CustomerRepresentative(final SystemUser user, final PhoneNumber phoneNumber) {
        if (phoneNumber == null || user == null) {
            throw new IllegalArgumentException();
        }
        this.systemUser = user;
        this.phoneNumber = phoneNumber;
    }

    public CustomerCode getCustomerCode() {
        if (systemUser.hasAny(ExemploRoles.CUSTOMER)) {
            return customerCode;
        }
        return null;
    }

    /**
     * instatiates a new Customer
     * 
     * @param customerCode
     * @param systemUser
     */
    public CustomerRepresentative(SystemUser systemUser, CustomerCode customerCode, PhoneNumber phoneNumber) {
        this.customerCode = customerCode;
        this.systemUser = systemUser;
        this.phoneNumber = phoneNumber;
        if (systemUser == null || customerCode == null || phoneNumber == null
                || !systemUser.hasAny(ExemploRoles.CUSTOMER)) {
            throw new IllegalArgumentException();
        }
    }

    public CustomerRepresentative(SystemUser systemUser, CustomerCode customerCode, PhoneNumber phoneNumber,
            SystemUser customerManager) {
        this.customerCode = customerCode;
        this.systemUser = systemUser;
        this.phoneNumber = phoneNumber;
        this.customerManager = customerManager;
        if (systemUser == null || customerCode == null || phoneNumber == null || customerManager == null
                || !systemUser.hasAny(ExemploRoles.CUSTOMER)) {
            throw new IllegalArgumentException();
        }
    }

    protected CustomerRepresentative() {
        
    }

    public SystemUser user() {
        return this.systemUser;
    }

    @Override
    public boolean equals(final Object o) {
        return DomainEntities.areEqual(this, o);
    }

    @Override
    public int hashCode() {
        return DomainEntities.hashCode(this);
    }

    @Override
    public boolean sameAs(final Object other) {
        return DomainEntities.areEqual(this, other);
    }

    public PhoneNumber phoneNumber() {
        return identity();
    }

    @Override
    public PhoneNumber identity() {
        return this.phoneNumber;
    }

    @Override
    public String toString() {
        String customerData = (customerCode == null) ? "NO DATA" : customerCode.toString();
        String customerManagerData = (customerManager == null) ? "NO DATA" : customerManager.toString();

        return "Name: " + systemUser.name() +
                "\nUsername: " + systemUser.username() +
                "\nEmail: " + systemUser.email() +
                "\nPhone Number: " + phoneNumber +
                "\nCustomer: " + customerData +
                "\nCustomer Manager: " + customerManagerData;
    }

}