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
package jobs4u.infrastructure.bootstrapers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import core.infrastructure.persistence.PersistenceContext;
import core.management.user.domain.ExemploRoles;
import core.management.user.domain.UserBuilderHelper;
import eapli.framework.actions.Action;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.infrastructure.authz.application.AuthenticationService;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;
import eapli.framework.strings.util.Strings;
import eapli.framework.validations.Invariants;

/**
 * Bootstrapping data app
 *
 * @author Paulo Gandra de Sousa
 */
@SuppressWarnings("squid:S106")
public class ExemploBootstrapper implements Action {
	private static final Logger LOGGER = LoggerFactory.getLogger(ExemploBootstrapper.class);

	private static final String ADMIN = "TEST_admin_for_creation";
	private static final String ADMIN_PWD = "passwordA1";
	private static final String OPERATOR_PWD = "operatorA1";
	private static final String OPERATOR = "operator";
	private static final String CUSTOMER_MANAGER_PWD = "managerA1";
	private static final String CUSTOMER_MANAGER = "manager";

	private final AuthorizationService authz = AuthzRegistry.authorizationService();
	private final AuthenticationService authenticationService = AuthzRegistry.authenticationService();
	private final UserRepository userRepository = PersistenceContext.repositories().users();

	@Override
	public boolean execute() {
		// declare bootstrap actions
		final Action[] actions = { new MasterUsersBootstrapper(), };

		registerAdmin();
		registerOperator();
		registerCustomerManager();
		authenticateForBootstrapping();

		// execute all bootstrapping
		var ret = true;
		for (final Action boot : actions) {
			System.out.println("Bootstrapping " + nameOfEntity(boot) + "...");
			ret &= boot.execute();
		}
		return ret;
	}

	/**
	 * register a power user directly in the persistence layer as we need to
	 * circumvent authorisations in the Application Layer
	 */
	private boolean registerOperator() {
		final var userBuilder = UserBuilderHelper.builder();
		userBuilder.withUsername(OPERATOR).withPassword(OPERATOR_PWD).withName("Operator", "First")
				.withEmail("operator@email.org").withRoles(ExemploRoles.OPERATOR);
		final var newUser = userBuilder.build();

		SystemUser operator;
		try {
			operator = userRepository.save(newUser);
			assert operator != null;
			return true;
		} catch (ConcurrencyException | IntegrityViolationException e) {
			// ignoring exception. assuming it is just a primary key violation
			// due to the tentative of inserting a duplicated user
			LOGGER.warn("Assuming {} already exists (activate trace log for details)", newUser.username());
			LOGGER.trace("Assuming existing record", e);
			return false;
		}
	}

	private boolean registerAdmin() {
		final var userBuilder = UserBuilderHelper.builder();
		userBuilder.withUsername(ADMIN).withPassword(ADMIN_PWD).withName("admin", "creation")
				.withEmail("creator_admin@email.org").withRoles(ExemploRoles.ADMIN);
		final var newUser = userBuilder.build();

		SystemUser operator;
		try {
			operator = userRepository.save(newUser);
			assert operator != null;
			return true;
		} catch (ConcurrencyException | IntegrityViolationException e) {
			// ignoring exception. assuming it is just a primary key violation
			// due to the tentative of inserting a duplicated user
			LOGGER.warn("Assuming {} already exists (activate trace log for details)", newUser.username());
			LOGGER.trace("Assuming existing record", e);
			return false;
		}
	}

	private boolean registerCustomerManager() {
		final var userBuilder = UserBuilderHelper.builder();
		userBuilder.withUsername(CUSTOMER_MANAGER).withPassword(CUSTOMER_MANAGER_PWD).withName("Customer", "Manager")
				.withEmail("customer_manager@email.org").withRoles(ExemploRoles.CUSTOMER_MANAGER);
		final var newUser = userBuilder.build();

		SystemUser manager;
		try {
			manager = userRepository.save(newUser);
			assert manager != null;
			return true;
		} catch (ConcurrencyException | IntegrityViolationException e) {
			// ignoring exception. assuming it is just a primary key violation
			// due to the tentative of inserting a duplicated user
			LOGGER.warn("Assuming {} already exists (activate trace log for details)", newUser.username());
			LOGGER.trace("Assuming existing record", e);
			return false;
		}
	}

	/**
	 * authenticate a super user to be able to register new users
	 *
	 */
	protected void authenticateForBootstrapping() {
		authenticationService.authenticate(ADMIN, ADMIN_PWD);
		Invariants.ensure(authz.hasSession());
	}

	private String nameOfEntity(final Action boot) {
		final var name = boot.getClass().getSimpleName();
		return Strings.left(name, name.length() - "Bootstrapper".length());
	}
}
