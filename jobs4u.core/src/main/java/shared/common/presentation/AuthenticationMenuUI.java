/*
package shared.common.presentation;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sem4pi.core.infrastructure.authentication.application.controller.AppAuthenticationController;
import sem4pi.core.infrastructure.authentication.application.controller.AppAuthorizationController;
import sem4pi.shared.common.presentation.common.ApplicationMenuUI;
import sem4pi.shared.common.presentation.common.ExitUI;
import sem4pi.shared.common.util.Console;
import sem4pi.shared.common.util.MenuItem;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Component
public class AuthenticationMenuUI implements CommandLineRunner {

    private LoginUI loginUI;

    private ApplicationMenuUI applicationMenuUI;

    private AppAuthenticationController appAuthenticationController;

    private AppAuthorizationController appAuthorizationController;

    @Override
    public void run(String... args) {
        loginUI.setAppPermission(applicationMenuUI.getPermissions());
        Console.showList(menuOptions(), "Main Menu");
        int option = Console.readOption(1, 2, 0);
        while (option == 1) {
            loginUI.show();
            if (appAuthenticationController.isLogged()) {
                if (appAuthorizationController.hasPermissions()) {
                    applicationMenuUI.show();
                } else {
                    System.out.println("You do not have permissions to access this application!");
                }
            }
            Console.showList(menuOptions(), "Main Menu");
            option = Console.readOption(1, 2, 0);
        }
        System.out.println("Exiting application...");
    }

    private List<String> menuOptions() {
        return List.of("Login", "Exit Application");
    }
}

 */