package core.management.Plugin.application.Utils;

import core.management.Plugin.domain.PluginType;
import eapli.framework.io.util.Console;

public class PluginUtils {

    public static PluginType selectPluginType() {
        System.out.println("Select Plugin Type:");
        System.out.println("1 - JOB_REQUIREMENT");
        System.out.println("2 - INTERVIEW_MODEL");

        int choice = -1;
        while (choice < 1 || choice > 2) {
            choice = Console.readInteger("Enter the number:");
            if (choice < 1 || choice > 2) {
                System.out.println("Invalid choice, please try again.");
            }
        }

        return choice == 1 ? PluginType.JOB_REQUIREMENT : PluginType.INTERVIEW_MODEL;
    }
}
