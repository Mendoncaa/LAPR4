package jobs4u.app.backoffice.console.presentation.Rank;

import core.management.rank.domain.RankPosition;
import eapli.framework.visitor.Visitor;

public class RankPositionPrinter implements Visitor<RankPosition> {
    @Override
    public void visit(RankPosition visitee) {
        if (visitee.getPosition() == -1) {
            System.out.printf("%-10s (Rank: Not Ranked)",
                    visitee.getCandidate().getCandidateName().toString()
            );
        }
        else{
            System.out.printf("%-10s (Rank: %d)",
                    visitee.getCandidate().getCandidateName().toString(),
                    visitee.getPosition()
            );
        }
    }
}
