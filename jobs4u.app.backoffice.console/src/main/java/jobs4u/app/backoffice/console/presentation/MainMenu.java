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
package jobs4u.app.backoffice.console.presentation;

import jobs4u.Application;
import jobs4u.app.backoffice.console.presentation.Candidate.AddCandidateAction;
import jobs4u.app.backoffice.console.presentation.Candidate.ListCandidatesAction;
import jobs4u.app.backoffice.console.presentation.JobApplication.DisplayApplicationDataAction;
import jobs4u.app.backoffice.console.presentation.JobApplication.ListApplicationsForJobOpeningAction;
import jobs4u.app.backoffice.console.presentation.JobApplication.RegisterApplicationAction;
import jobs4u.app.backoffice.console.presentation.JobOpening.*;
import jobs4u.app.backoffice.console.presentation.authz.AddUserUI;
import jobs4u.app.backoffice.console.presentation.authz.DeactivateUserAction;
import jobs4u.app.backoffice.console.presentation.authz.GenerateTemplateUI;
import jobs4u.app.backoffice.console.presentation.authz.ListUsersAction;
import jobs4u.app.backoffice.console.presentation.plugins.InterviewModel.SelectInterviewAction;
import jobs4u.app.backoffice.console.presentation.plugins.RegisterPluginAction;
import jobs4u.app.backoffice.console.presentation.plugins.RegisterPluginUI;
import jobs4u.app.backoffice.console.presentation.plugins.RequirementsSpecification.SelectRequirementsAction;
import jobs4u.app.backoffice.console.presentation.utente.AcceptRefuseSignupRequestAction;
import jobs4u.app.common.console.presentation.authz.MyUserMenu;
import core.management.user.domain.ExemploRoles;
import eapli.framework.actions.Actions;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.ExitWithMessageAction;
import eapli.framework.presentation.console.menu.HorizontalMenuRenderer;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;

/**
 * TODO split this class in more specialized classes for each menu
 *
 * @author Paulo Gandra Sousa
 */
public class MainMenu extends AbstractUI {

	private static final String RETURN_LABEL = "Return ";

	private static final int EXIT_OPTION = 0;

	// USERS
	private static final int ADD_USER_OPTION = 1;
	private static final int LIST_USERS_OPTION = 2;
	private static final int DEACTIVATE_USER_OPTION = 3;
	private static final int ACCEPT_REFUSE_SIGNUP_REQUEST_OPTION = 4;

	// CUSTOMERS
	private static final int ADD_CUSTOMER_OPTION = 1;

	// CANDIDATES
	private static final int REGISTER_CANDIDATE_OPTION = 1;
	private static final int LIST_CANDIDATE_INFO_OPTION = 2;

	// JOB OPENING
	private static final int CREATE_JOBOPENING_OPTION = 1;
	private static final int LIST_JOBOPENINGS_OPTION = 2;
	private static final int LIST_APPLICATIONS_FOR_JOBOPENING_OPTION = 2;
	private static final int DISPLAY_APPLICATION_DATA = 3;
	private static final int SETUP_JOBOPENING_PHASES_OPTION = 4;
	private static final int OPEN_OR_CLOSE_PHASES_OPTION = 5;

	// JOB APPLICATION

	private static final int REGISTER_JOBAPPLICATION_OPTION = 1;
	private static final int BRUNA = 12;

	// MAIN MENU
	private static final int MY_USER_OPTION = 1;
	private static final int USERS_OPTION = 2;
	private static final int CM_COSTUMERS_OPTION = 2;
	private static final int CM_JOBOPENING_OPTION = 3;
	private static final int CM_CANDIDATE_OPTION = 4;
	private static final int ADMIN_COSTUMERS_OPTION = 3;
	private static final int ADMIN_JOBOPENING_OPTION = 4;
	private static final int ADMIN_CANDIDATE_OPTION = 5;
	private static final int ADMIN_PLUGIN_OPTION = 6;
	private static final int OP_CANDIDATE_OPTION = 2;


	private static final String SEPARATOR_LABEL = "--------------";

	private final AuthorizationService authz = AuthzRegistry.authorizationService();

	@Override
	public boolean show() {
		drawFormTitle();
		return doShow();
	}

	/**
	 * @return true if the user selected the exit option
	 */
	@Override
	public boolean doShow() {
		final var menu = buildMainMenu();
		final MenuRenderer renderer;
		if (Application.settings().isMenuLayoutHorizontal()) {
			renderer = new HorizontalMenuRenderer(menu, MenuItemRenderer.DEFAULT);
		} else {
			renderer = new VerticalMenuRenderer(menu, MenuItemRenderer.DEFAULT);
		}
		return renderer.render();
	}

	@Override
	public String headline() {

		return authz.session().map(s -> "Backoffice [ @" + s.authenticatedUser().identity() + " ]")
				.orElse("Backoffice [ ==Anonymous== ]");
	}

	private Menu buildMainMenu() {
		final var mainMenu = new Menu();

		final Menu myUserMenu = new MyUserMenu();
		mainMenu.addSubMenu(MY_USER_OPTION, myUserMenu);

		if (!Application.settings().isMenuLayoutHorizontal()) {
			mainMenu.addItem(MenuItem.separator(SEPARATOR_LABEL));
		}

		if (authz.isAuthenticatedUserAuthorizedTo(ExemploRoles.ADMIN)) {
			final var usersMenu = buildUsersMenu();
			mainMenu.addSubMenu(USERS_OPTION, usersMenu);
			final var customersMenu = buildCustomersMenu();
			mainMenu.addSubMenu(ADMIN_COSTUMERS_OPTION, customersMenu);
			final var jobOpeningMenu = buildJobOpeningMenu();
			mainMenu.addSubMenu(ADMIN_JOBOPENING_OPTION, jobOpeningMenu);
			final var candidatesMenu = buildCandidatesMenu();
			mainMenu.addSubMenu(ADMIN_CANDIDATE_OPTION, candidatesMenu);
			final var pluginsMenu = buildPluginMenu();
			mainMenu.addSubMenu(ADMIN_PLUGIN_OPTION, pluginsMenu);
			final var applicationsMenu = buildJobApplicationMenu();
			mainMenu.addSubMenu(7, applicationsMenu);

		}
		if(authz.isAuthenticatedUserAuthorizedTo(ExemploRoles.CUSTOMER_MANAGER)){
			final var customersMenu = buildCustomersMenu();
			mainMenu.addSubMenu(CM_COSTUMERS_OPTION, customersMenu);
			final var jobOpeningMenu = buildJobOpeningMenu();
			mainMenu.addSubMenu(CM_JOBOPENING_OPTION, jobOpeningMenu);
			final var candidatesMenu = buildCandidatesMenu();
			mainMenu.addSubMenu(CM_CANDIDATE_OPTION, candidatesMenu);
			final var pluginsMenu = buildPluginMenu();
			mainMenu.addSubMenu(5, pluginsMenu);

		}
		if(authz.isAuthenticatedUserAuthorizedTo(ExemploRoles.OPERATOR)){
			final var candidatesMenu = buildCandidatesMenu();
			mainMenu.addSubMenu(OP_CANDIDATE_OPTION, candidatesMenu);
			final var applicationsMenu = buildJobApplicationMenu();
			mainMenu.addSubMenu(3, applicationsMenu);
		}

		if (!Application.settings().isMenuLayoutHorizontal()) {
			mainMenu.addItem(MenuItem.separator(SEPARATOR_LABEL));
		}

		mainMenu.addItem(EXIT_OPTION, "Exit", new ExitWithMessageAction("Bye, Bye"));

		return mainMenu;
	}

	private Menu buildUsersMenu() {
		final var menu = new Menu("Users >");

		menu.addItem(ADD_USER_OPTION, "Add User", new AddUserUI()::show);
		menu.addItem(LIST_USERS_OPTION, "List all Users", new ListUsersAction());
		menu.addItem(DEACTIVATE_USER_OPTION, "Deactivate User", new DeactivateUserAction());
		menu.addItem(ACCEPT_REFUSE_SIGNUP_REQUEST_OPTION, "Accept/Refuse Signup Request",
				new AcceptRefuseSignupRequestAction());
		menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

		return menu;
	}

	private Menu buildCustomersMenu() {
		final var menu = new Menu("Customers >");

		menu.addItem(ADD_CUSTOMER_OPTION, "Add Customer", new RegisterCustomerUI()::show);
		menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

		return menu;
	}

	private Menu buildJobOpeningMenu() {
		final var menu = new Menu("JobOpening >");

		menu.addItem(CREATE_JOBOPENING_OPTION, "Create a Job Opening", new CreateJobOpeningAction());
		menu.addItem(LIST_JOBOPENINGS_OPTION, "List all Job Openings", new ListJobOpeningsAction());
		menu.addItem(SETUP_JOBOPENING_PHASES_OPTION, "Setup Job Opening Phases", new SetUpRecruitmentProcessAction());
		menu.addItem(OPEN_OR_CLOSE_PHASES_OPTION, "Open or Close Phases", new PhasesAction());
		menu.addItem(BRUNA, "BRUNAAAAA", new GenerateTemplateUI()::show);
		menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

		return menu;
	}

	private Menu buildJobApplicationMenu() {
		final var menu = new Menu("JobApplication >");

		menu.addItem(REGISTER_JOBAPPLICATION_OPTION, "Register Job Application", new RegisterApplicationAction());

		if(authz.isAuthenticatedUserAuthorizedTo(ExemploRoles.ADMIN, ExemploRoles.CUSTOMER_MANAGER)){
			menu.addItem(LIST_APPLICATIONS_FOR_JOBOPENING_OPTION, "List all Applications for a Job Opening", new ListApplicationsForJobOpeningAction()); //new ListApplicationsForJobOpeningAction());
			menu.addItem(DISPLAY_APPLICATION_DATA,"Display Application Data", new DisplayApplicationDataAction());
		}

		menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

		return menu;
	}

	private Menu buildCandidatesMenu() {
		final var menu = new Menu("Candidates >");

		menu.addItem(REGISTER_CANDIDATE_OPTION, "Register Candidate", new AddCandidateAction());
		menu.addItem(LIST_CANDIDATE_INFO_OPTION, "List Candidates", new ListCandidatesAction());
		menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

		return menu;
	}

	private Menu buildPluginMenu() {
		final var menu = new Menu("Plugins >");

		menu.addItem(1, "Register a Plugin", new RegisterPluginAction());
		menu.addItem(2, "Select Requirement Specification for a JobOpening", new SelectRequirementsAction());
		menu.addItem(3, "Select Interview Model for a JobOpening", new SelectInterviewAction());
		menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

		return menu;
	}

}
