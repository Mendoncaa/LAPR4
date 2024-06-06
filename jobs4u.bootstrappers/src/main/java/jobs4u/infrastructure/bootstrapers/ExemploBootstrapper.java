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

import core.management.costumer.builder.CustomerBuilder;
import core.management.costumer.domain.*;
import core.management.costumer.domain.Address;
import core.management.costumer.repository.CustomerRepository;
import core.management.costumer.repository.CustomerRepresentativeRepository;
import core.management.jobOpening.domain.*;
import core.management.jobOpening.repository.JobOpeningRepository;
import core.management.rank.domain.Rank;
import core.management.rank.domain.RankPosition;
import eapli.framework.general.domain.model.Description;
import eapli.framework.io.util.Console;
import jakarta.persistence.RollbackException;
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

import java.util.ArrayList;
import java.util.List;

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
	private static final String CUSTOMER = "customer1";
	private static final String CUSTOMER_PWD = "customerA1";

	private final AuthorizationService authz = AuthzRegistry.authorizationService();
	private final AuthenticationService authenticationService = AuthzRegistry.authenticationService();
	private final UserRepository userRepository = PersistenceContext.repositories().users();
	private final CustomerRepresentativeRepository customerRepresentativeRepository = PersistenceContext.repositories().customerRepresentative();
	private final CustomerRepository customerRepository = PersistenceContext.repositories().customer();
	private final JobOpeningRepository jobOpeningRepository = PersistenceContext.repositories().jobOpenings();

	@Override
	public boolean execute() {
		// declare bootstrap actions
		final Action[] actions = { new MasterUsersBootstrapper(), };

		registerAdmin();
		registerOperator();
		registerCustomerManager();
		registerCustomer();
		registerJobOpening();
		authenticateForBootstrapping();

		// execute all bootstrapping
		var ret = true;
		for (final Action boot : actions) {
			System.out.println("Bootstrapping " + nameOfEntity(boot) + "...");
			ret &= boot.execute();
		}

		removeExtraAdmin();

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
	SystemUser manager;

	private boolean registerCustomerManager() {
		final var userBuilder = UserBuilderHelper.builder();
		userBuilder.withUsername(CUSTOMER_MANAGER).withPassword(CUSTOMER_MANAGER_PWD).withName("Customer", "Manager")
				.withEmail("customer_manager@email.org").withRoles(ExemploRoles.CUSTOMER_MANAGER);
		final var newUser = userBuilder.build();



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

	private boolean registerCustomer() {
		final var userBuilder = UserBuilderHelper.builder();
		userBuilder.withUsername(CUSTOMER).withPassword(CUSTOMER_PWD).withName("Customer", "One")
				.withEmail("customer1@email.org").withRoles(ExemploRoles.CUSTOMER);
		final var newUser = userBuilder.build();

		final var userBuilder2 = UserBuilderHelper.builder();
		userBuilder2.withUsername(CUSTOMER_MANAGER).withPassword(CUSTOMER_MANAGER_PWD).withName("Customer", "Manager")
				.withEmail("customer_manager@email.org").withRoles(ExemploRoles.CUSTOMER_MANAGER);
		final var newUser2 = userBuilder2.build();

		PhoneNumber number = new PhoneNumber("912321222");

		CustomerCode code = new CustomerCode("TST");

		Address address = new Address("rua teste", "porto", "1000-100");
		CustomerName name = new CustomerName("TESTE Lda");

		Customer customer = new Customer(code, address, name);


		SystemUser customer1;
		CustomerRepresentative customerRepresentative;
		Customer customer2;
		try {
			customer1 = userRepository.save(newUser);
			assert customer1 != null;
			CustomerBuilder builder = new CustomerBuilder();
			builder.withSystemUser(customer1)
					.withCompany(code)
					.withPhoneNumber(number)
					.withCustomManager(manager);

			CustomerRepresentative newCustomer = builder.build();
			customerRepresentative = customerRepresentativeRepository.save(newCustomer);
			assert customerRepresentative != null;
			customer2 = customerRepository.save(customer);
			assert customer2 != null;
			return true;
		} catch (ConcurrencyException | IntegrityViolationException | RollbackException e) {
			// ignoring exception. assuming it is just a primary key violation
			// due to the tentative of inserting a duplicated user
			LOGGER.warn("Assuming {} already exists (activate trace log for details)", newUser.username());
			LOGGER.trace("Assuming existing record", e);
			Throwable cause = e.getCause();
			while (cause != null) {
				System.out.println(cause.getMessage());
				cause = cause.getCause();
			}
			return false;
		}
	}

	private boolean registerJobOpening() {
		JobReference ref = new JobReference("TST", 1);
		JobTitle title = JobTitle.valueOf("Titulo");
		Description desc = Description.valueOf("descricao");
		core.management.jobOpening.domain.Address addr = core.management.jobOpening.domain.Address.valueOf("rua teste2", 0, "0", "1000-100");
		NumberOfVacancies vacancies = new NumberOfVacancies(5);
		List<RankPosition> rankPositions = new ArrayList<>();
		Rank rank = new Rank(rankPositions);

		JobOpening jobOpening = new JobOpening(ref, title, JobState.CLOSED, ContractType.FULL_TIME, JobMode.HYBRID, desc, addr, vacancies, rank);

		JobOpening jobOpening1;

		try {
			jobOpening1 = jobOpeningRepository.save(jobOpening);
			assert jobOpening1 != null;
			return true;
		} catch (ConcurrencyException | IntegrityViolationException e) {
			// ignoring exception. assuming it is just a primary key violation
			// due to the tentative of inserting a duplicated user
			LOGGER.warn("Assuming {} already exists (activate trace log for details)", jobOpening.getJobReference().toString());
			LOGGER.trace("Assuming existing record", e);
			return false;
		}
	}

	private boolean removeExtraAdmin() {
		final var userBuilder = UserBuilderHelper.builder();
		userBuilder.withUsername(ADMIN).withPassword(ADMIN_PWD).withName("admin", "creation")
				.withEmail("creator_admin@email.org").withRoles(ExemploRoles.ADMIN);
		final var newUser = userBuilder.build();
		try {
			userRepository.deleteOfIdentity(newUser.identity());
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
