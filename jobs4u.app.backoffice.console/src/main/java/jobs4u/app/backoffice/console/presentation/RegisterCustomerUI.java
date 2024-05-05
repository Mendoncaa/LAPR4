package jobs4u.app.backoffice.console.presentation;

import core.management.costumer.application.controller.RegisterCustomerController;
import core.management.costumer.builder.CustomerBuilder;
import core.management.costumer.domain.Customer;
import core.management.costumer.domain.CustomerCode;
import core.management.costumer.domain.CustomerName;
import core.management.costumer.domain.PhoneNumber;
import core.management.costumer.domain.Address;
import core.infrastructure.persistence.PersistenceContext;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

import java.text.Normalizer;

public class RegisterCustomerUI extends AbstractUI {
    private final RegisterCustomerController theController = new RegisterCustomerController(
            PersistenceContext.repositories().customerRepresentative(), new CustomerBuilder());
    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    @Override
    public boolean doShow() {
        System.out.println("\n================== Register Customer ==================\n");
        try {
            SystemUser customerManager = theController.getLoggedInUser();
            final String username = Console.readNonEmptyLine("Enter Username: ", "Username cannot be empty");
            printSeparator();
            final String password = Console.readNonEmptyLine("Enter Password: ", "Password cannot be empty");
            printSeparator();
            String firstName = Console.readNonEmptyLine("Enter First Name: ", "First name cannot be empty");

            firstName = Normalizer.normalize(firstName, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
            printSeparator();
            String lastName = Console.readNonEmptyLine("Enter Last Name: ", "Last name cannot be empty");

            lastName = Normalizer.normalize(lastName, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
            printSeparator();
            final String email = Console.readLine("Enter Email: ");
            printSeparator();
            final String customerName = Console.readLine("Enter Customer Name: ");
            printSeparator();
            final String customerStreet = Console.readLine("Enter Customer Street: ");
            printSeparator();
            final String customerCity = Console.readLine("Enter Customer City: ");
            printSeparator();
            final String costumerPostalCode = Console.readLine("Enter Customer Postal Code: ");
            printSeparator();
            final String customerCode = Console.readLine("Enter Customer Code: ");
            printSeparator();
            PhoneNumber number = new PhoneNumber(Console.readLine("Enter Phone Number: "));

            CustomerCode code = new CustomerCode(customerCode);
            Address address = new Address(customerStreet, customerCity, costumerPostalCode);
            CustomerName name = new CustomerName(customerName);

            Customer customer = new Customer(code, address, name);

            theController.registerCustomer(username, password, firstName, lastName, email, customer, number,
                    customerManager);
            System.out.println("\nCustomer registered with success!\n");
            System.out.println(customerManager.toString());

            return false;
        } catch (IllegalArgumentException e) {
            if (e.getMessage() == null) {
                System.out.println(
                        "\nWas not possible to create the user. Check that the password entered meets the following criteria: -Minimum 6 characters, -One uppercase letter (at least), -One number.\n");
            } else {
                System.out.println("\nError: " + e.getMessage() + "\n");
            }
            return false;
        }
    }

    private void printSeparator() {
        System.out.println("-------------------------------------------------------");
    }

    @Override
    public String headline() {
        return "Register Customer";
    }
}