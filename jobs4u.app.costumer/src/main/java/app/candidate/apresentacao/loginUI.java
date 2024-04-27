package app.candidate.apresentacao;

import core.aplicacao.mainController;

import java.security.NoSuchAlgorithmException;
import java.util.Scanner;


public class loginUI {

    private static final int DEFAULT_MAX_ATTEMPTS = 3;

    public loginUI(mainController mc) throws InstantiationException, NoSuchAlgorithmException {
        Scanner scan = new Scanner(System.in);

        int attempts = 0;
        int outcome = 0;

        do{
            System.out.println("==Login==");
            System.out.println("Username:");
            String usr = scan.nextLine();
            System.out.println("Password:");
            String psw = scan.nextLine();

            outcome = mc.auth(usr,psw, "Costumer");
            if (outcome == 0){
                attempts++;
                System.out.println("Username or Password incorrect");
                System.out.println("YOU HAVE " + (DEFAULT_MAX_ATTEMPTS - attempts) + " ATTEMPTS LEFT");
            }
            else if(outcome == -1){
                System.out.println("User is Deactivated");
            }
            else if(outcome == -2){
                System.out.println("User is not a Costumer");
            }
            else if(outcome == 1){
                Long CostumerId = mc.getId(usr,psw);
                new CostumerUI(CostumerId);
            }
            else{
                throw new InstantiationException("Couldn't login");
            }

        } while (outcome != 1 && attempts < DEFAULT_MAX_ATTEMPTS);

    }
}
