package core.management.costumer.application.service;

import core.management.costumer.domain.CustomerRepresentative;

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


import core.management.costumer.repository.CustomerRepresentativeRepository;

import core.management.costumer.domain.PhoneNumber;
import core.infrastructure.persistence.PersistenceContext;
import core.management.user.domain.ExemploRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.Username;

import java.util.Optional;


public class CustomerRepresentativeService {

    private final AuthorizationService authz =
            AuthzRegistry.authorizationService();
    private final CustomerRepresentativeRepository repo =
            PersistenceContext.repositories().customerRepresentative();

    public Optional<CustomerRepresentative> findCustomerRepresentativeByPhoneNumber(
            final String phoneNumber) {
        authz.ensureAuthenticatedUserHasAnyOf(ExemploRoles.CUSTOMER_MANAGER, ExemploRoles.OPERATOR,
                ExemploRoles.ADMIN,
                ExemploRoles.CANDIDATE);
        return repo.ofIdentity(PhoneNumber.valueOf(phoneNumber));
    }

    public Optional<CustomerRepresentative> findCustomerRepresentativeByUsername(
            final Username user) {
        authz.ensureAuthenticatedUserHasAnyOf(ExemploRoles.CANDIDATE,
                ExemploRoles.ADMIN,
                ExemploRoles.CUSTOMER_MANAGER);
        return repo.findByUsername(user);
    }

    public Iterable<CustomerRepresentative> allUsers() {
        authz.ensureAuthenticatedUserHasAnyOf(ExemploRoles.CUSTOMER_MANAGER,
                ExemploRoles.ADMIN);
        return repo.findAllActive();
    }
}
