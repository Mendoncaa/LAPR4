/* package app.backoffice.apresentacao;

import app.backoffice.aplicacao.RegisterApplicationController;
// import org.springframework.stereotype.Component;
import core.util.UI;
import core.util.Console;


// @Component
public class RegisterApplicationUI implements UI {

    private final RegisterApplicationController controller;

    public RegisterApplicationUI(RegisterApplicationController controller) {
        this.controller = controller;
    }

    @Override
    public void show() {
        System.out.println("\n--- Register New Application ---");
        System.out.println("\nEnter the path of the application file:");
        
        String filePath = Console.readLine("File Path: ");
        try {
            boolean success = controller.registerApplication(filePath);     // error (controller) save due to springFrameowork is not implemented
            if (success) {
                System.out.println("Application successfully registered.");
            } else {
                System.out.println("Failed to register application. Please check the file path and file format.");
            }
        } catch (Exception e) {
            System.out.println("Failed to register application. Please check the file path and file format.");
        }
    }
}
*/