package jobs4u.app.backoffice.console.presentation.plugins.RequirementsSpecification;

import core.management.jobOpening.domain.JobOpening;
import core.management.plugins.requirementsSpecifications.controller.SelectRequirementsSpecificationController;
import core.management.plugins.requirementsSpecifications.domain.RequirementsSpecification;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;

public class SelectRequirementsSpecificationUI extends AbstractUI
{
    private final SelectRequirementsSpecificationController controller = new SelectRequirementsSpecificationController();

    @Override
    protected boolean doShow() {

        try{
            controller.associateRequirementsSpecificationToJobOpening(selectJobOpening(), selectRequirementsSpecification());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }


        return true;
    }

    private JobOpening selectJobOpening() {
        Iterable<JobOpening> jobOpenings = controller.allJobOpenings();

        SelectWidget<JobOpening> selectWidget = new SelectWidget<>("Select a job opening:", jobOpenings);

        selectWidget.show();

        return selectWidget.selectedElement();
    }


    private RequirementsSpecification selectRequirementsSpecification() {
        Iterable<RequirementsSpecification> jobRequirementsSpecifications = controller.AllRequirementsSpecifications();

        SelectWidget<RequirementsSpecification> selectWidget = new SelectWidget<>("Select a requirements specification", jobRequirementsSpecifications);

        selectWidget.show();

        return selectWidget.selectedElement();
    }

    @Override
    public String headline() {
        return "Select Requirements Specification";
    }
}