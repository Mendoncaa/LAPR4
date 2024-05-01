/*
package shared.common.presentation;


import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import sem4pi.core.infrastructure.authentication.domain.AppPermission;
import sem4pi.core.infrastructure.authentication.domain.AuthDTO;
import sem4pi.shared.common.domain.ResultDTO;
import sem4pi.shared.common.presentation.common.UI;
import sem4pi.shared.common.util.Console;
import sem4pi.core.infrastructure.authentication.application.controller.AppAuthenticationController;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Component
public class LoginUI implements UI {

    private final AppAuthenticationController controller;

    @Setter
    private AppPermission appPermission;
    private int numberOfAttemps = 3;

    @Override
    public void show() {
        controller.setAppPermissions(appPermission);
        System.out.println("*******************************");
        System.out.println("*            Login            *");
        System.out.println("*******************************");
        System.out.println("\nPlease login to continue:\n");

        ResultDTO result = readCredentials();
        while (result.isError() && numberOfAttemps != 0) {
            System.out.println(result);
            numberOfAttemps--;
            Console.showList(getOptions(), "Do you want to try the login again?");
            int option = Console.readOption(1, 2, 0);
            if (option == 2) {
                break;
            }
            result = readCredentials();
        }
        if (numberOfAttemps == 0) {
            System.out.println("You exceded the number of attempts to login!");
        }
    }

    private ResultDTO readCredentials() {
        String email = Console.readLine("Email: ");
        String password = Console.readLine("Password: ");
        AuthDTO authDTO = new AuthDTO(email, password);
        return controller.login(authDTO);
    }

    private List<String> getOptions(){
        List<String> options = new ArrayList<>();
        options.add("Yes");
        options.add("No");
        return options;
    }
}

 */