package jobs4u.app.backoffice.console.presentation.plugins.RequirementsSpecification;

import core.management.RequirementSpecification.application.controller.SelectRequirementsController;
import core.management.RequirementSpecification.domain.RequirementSpecification;
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
        JobReference jobReference = jobReferences.get(scanner.nextInt() - 1);

        System.out.println("Available Plugins:");
        count = 1;
        List<RequirementSpecification> plugins = selectRequirementsController.allPlugins();
        for (RequirementSpecification plugin : plugins) {
            System.out.println(count + ") " + plugin.getName());
            count++;
        };

        System.out.println("Enter Plugin Name:");
        String pluginName = plugins.get(scanner.nextInt() - 1).getName();

        selectRequirementsController.selectRequirementSpecification(jobReference, pluginName);

        System.out.println("Requirement Specification selected successfully.");

        return true;
    }
    @Override
    public String headline() {
        return "Select Requirements Specification for a Job Opening";
    }
}
