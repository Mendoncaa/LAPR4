/*
 * Copyright (c) 2013-2024 the original author or authors.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package core.management.candidate.application;

import core.infrastructure.persistence.PersistenceContext;
import core.management.candidate.domain.Candidate;
import core.management.candidate.domain.CandidateEmail;
import core.management.candidate.domain.CandidateName;
import core.management.candidate.domain.CandidatePhone;
import core.management.candidate.repository.CandidateRepository;
import core.management.user.domain.ExemploRoles;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.application.UserManagementService;
import eapli.framework.infrastructure.authz.domain.model.Role;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.time.util.CurrentTimeCalendars;

import java.util.Calendar;
import java.util.Set;

/**
 *
 * Created by nuno on 21/03/16.
 */
@UseCaseController
public class AddCandidateController {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final UserManagementService userSvc = AuthzRegistry.userService();
    private final CandidateRepository candidateRepository = PersistenceContext.repositories().candidate();

    /**
     * Get existing RoleTypes available to the user.
     *
     * @return a list of RoleTypes
     */
    public Role[] getRoleTypes() {
        return ExemploRoles.nonUserValues();
    }

    public SystemUser addUser(final String username, final String password, final String firstName,
            final String lastName,
            final String email, final Set<Role> roles, final Calendar createdOn) {
        authz.ensureAuthenticatedUserHasAnyOf(ExemploRoles.ADMIN, ExemploRoles.CUSTOMER_MANAGER, ExemploRoles.OPERATOR);

        return userSvc.registerNewUser(username, password, firstName, lastName, email, roles,
                createdOn);
    }

    public SystemUser addUser(final String username, final String password, final String firstName,
            final String lastName,
            final String email, final Set<Role> roles) {
        return addUser(username, password, firstName, lastName, email, roles, CurrentTimeCalendars.now());
    }

    public void addCandidate(final SystemUser candidate, final String phone, final String email, final String name){

        authz.ensureAuthenticatedUserHasAnyOf(ExemploRoles.ADMIN, ExemploRoles.CUSTOMER_MANAGER, ExemploRoles.OPERATOR);

        CandidateEmail candidateEmail = new CandidateEmail(email);
        CandidateName candidateName = new CandidateName(name);
        CandidatePhone candidatePhone = new CandidatePhone(phone);

        candidateRepository.save(new Candidate(candidateEmail, candidateName, candidatePhone, candidate));
    }
}
