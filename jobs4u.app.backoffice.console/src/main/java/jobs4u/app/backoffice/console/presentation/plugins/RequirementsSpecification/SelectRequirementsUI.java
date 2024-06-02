package jobs4u.app.backoffice.console.presentation.plugins.RequirementsSpecification;

import core.management.Plugin.application.controller.SelectRequirementsController;
import core.management.Plugin.domain.Plugin;
import core.management.jobOpening.controller.ListJobOpeningsController;
import core.management.jobOpening.domain.JobReference;
import eapli.framework.presentation.console.AbstractUI;

import java.util.List;
import java.util.Scanner;

public class SelectRequirementsUI extends AbstractUI {

    private final SelectRequirementsController selectRequirementsController = new SelectRequirementsController();

    private final ListJobOpeningsController listJobOpeningsController = new ListJobOpeningsController();

    public boolean doShow() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available Job Openings:");
        List<JobReference> jobReferences = listJobOpeningsController.allJobReferences();
        int count = 1;
        for (JobReference jobReference : jobReferences) {
            System.out.println(count + ") " + jobReference);
            count++;
        };

        System.out.println("Enter Job Reference:");
        String jobReferenceStr = scanner.nextLine();

        System.out.println("Available Plugins:");
        List<Plugin> plugins = selectRequirementsController.allPlugins();
        for (Plugin plugin : plugins) {
            System.out.println(count + ") " + plugin.getName());
            count++;
        };

        System.out.println("Enter Plugin Name:");
        String pluginName = scanner.nextLine();

        selectRequirementsController.selectRequirementSpecification(jobReferenceStr, pluginName);

        System.out.println("Requirement Specification selected successfully.");

        return true;
    }
    @Override
    public String headline() {
        return "Select Requirements Specification for a Job Opening";
    }
}
