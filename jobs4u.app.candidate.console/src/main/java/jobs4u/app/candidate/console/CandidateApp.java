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
package jobs4u.app.candidate.console;

import eapli.framework.infrastructure.pubsub.EventDispatcher;
import core.infrastructure.persistence.PersistenceContext;
import core.management.user.domain.ExemploPasswordPolicy;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.PlainTextEncoder;
import jobs4u.app.candidate.console.presentation.MainMenu;
import jobs4u.app.common.console.BaseApp;
import jobs4u.app.common.console.presentation.authz.LoginUI;
import jobs4u.infrastructure.authz.AuthenticationCredentialHandler;

/**
 * Utente App.
 */
@SuppressWarnings("squid:S106")
public final class CandidateApp extends BaseApp {

	/**
	 * Empty constructor is private to avoid instantiation of this class.
	 */
	private CandidateApp() {
	}

	public static void main(final String[] args) {
		AuthzRegistry.configure(PersistenceContext.repositories().users(), new ExemploPasswordPolicy(),
				new PlainTextEncoder());

		new CandidateApp().run(args);

		// exiting the application, closing all threads
		System.exit(0);
	}

	@Override
	protected void doMain(final String[] args) {
		// login and go to main menu
		if (new LoginUI(new AuthenticationCredentialHandler()).show()) {
			// go to main menu
			final var menu = new MainMenu();
			menu.mainLoop();
		}
	}

	@Override
	protected String appTitle() {
		return "Candidate App";
	}

	@Override
	protected String appGoodbye() {
		return "Candidate App";
	}

	@Override
	protected void doSetupEventHandlers(EventDispatcher dispatcher) {
		// TODO Auto-generated method stub
	}
}
