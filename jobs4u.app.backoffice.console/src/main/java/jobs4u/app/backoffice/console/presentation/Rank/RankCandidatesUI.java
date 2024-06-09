package jobs4u.app.backoffice.console.presentation.Rank;

import core.management.jobOpening.domain.JobOpening;
import core.management.rank.application.RankController;
import core.management.rank.domain.RankPosition;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;
import jobs4u.app.backoffice.console.presentation.JobOpening.JobOpeningPrinter;

import java.util.List;

/**
 * UI to display all job openings.
 */
public class RankCandidatesUI extends AbstractUI {

    private final RankController theController = new RankController();

    @Override
    protected boolean doShow() {
        List<JobOpening> jobOpenings;
        try {
            jobOpenings = this.theController.getJobOpeningsInAnalysis();
        } catch (InstantiationException e) {
            System.out.println(e.getMessage());
            return false;
        }
        if (jobOpenings.isEmpty()) {
            System.out.println("No job openings in Analysis found.");
            return false;
        }
        final SelectWidget<JobOpening> selector = new SelectWidget<>("Select JobOpening",
                jobOpenings, new JobOpeningPrinter());
        selector.show();
        final JobOpening jobOpening = selector.selectedElement();

        int choice = -1;

        List<RankPosition> rankPositions;

        if(jobOpening.getRank().getRankPosition().isEmpty()){
            rankPositions = this.theController.generateRankPosition(jobOpening);
        }
        else{
            rankPositions = jobOpening.getRank().getRankPosition();
        }

        while(choice != 0){
            final SelectWidget<RankPosition> candidateSelector = new SelectWidget<>("Select Candidate to Rank:\n#  Candidate  Rank",
                    rankPositions, new RankPositionPrinter());
            candidateSelector.show();
            choice = candidateSelector.selectedOption();
            if(choice != 0){
                int rank = Console.readInteger("Enter Rank:");
                RankPosition rankPosition = rankPositions.get(choice - 1);
                rankPosition.setPosition(rank);
                rankPositions.set(choice - 1, rankPosition);
            }

        }

        this.theController.updateRank(jobOpening, rankPositions);

        return false;
    }

    @Override
    public String headline() {
        return "Rank Candidates";
    }
}
