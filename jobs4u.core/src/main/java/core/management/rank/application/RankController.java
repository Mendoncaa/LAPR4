package core.management.rank.application;

import core.infrastructure.persistence.PersistenceContext;
import core.management.RecruitmentProcess.domain.PhaseName;
import core.management.RecruitmentProcess.domain.RecruitmentProcessStatus;
import core.management.candidate.domain.Candidate;
import core.management.candidate.repository.CandidateRepository;
import core.management.jobApplication.repository.ApplicationRepository;
import core.management.jobOpening.domain.JobOpening;
import core.management.jobOpening.repository.JobOpeningRepository;
import core.management.rank.domain.Rank;
import core.management.rank.domain.RankPosition;
import core.management.rank.domain.RankStatus;
import core.management.rank.repository.RankRepository;

import java.util.ArrayList;
import java.util.List;

public class RankController {

    private final JobOpeningRepository jobOpeningRepository = PersistenceContext.repositories().jobOpenings();
    private final ApplicationRepository jobApplicationRepository = PersistenceContext.repositories().application();
    private final RankRepository rankRepository = PersistenceContext.repositories().rank();


    public List<JobOpening> getJobOpeningsInAnalysis() throws InstantiationException {
        List<JobOpening> allJobOpenings = (List<JobOpening>) jobOpeningRepository.findAll();
        List<JobOpening> jobOpeningsInAnalysis = new ArrayList<>();
        for (JobOpening jobOpening : allJobOpenings) {
            if (jobOpening.getRecruitmentProcess().getStatus().equals(RecruitmentProcessStatus.IN_PROCESS)) {
                if(jobOpening.getRecruitmentProcess().currentPhase().getName().equals(PhaseName.ANALYSIS)) {
                    jobOpeningsInAnalysis.add(jobOpening);
                }
                else throw new InstantiationException("The job opening is not in the analysis phase");
            }
            else throw new InstantiationException("The job opening is not in process");
        }
        return jobOpeningsInAnalysis;

    }

    public List<RankPosition> generateRankPosition(JobOpening jobOpening) {
        List<Candidate> candidates = jobApplicationRepository.findCandidatesByJobOpening(jobOpening);
        List<RankPosition> rankPositions = new ArrayList<>();
        for (Candidate candidate : candidates) {
            boolean exists = false;
            for(RankPosition rankPosition : rankPositions){
                if(rankPosition.getCandidate().equals(candidate)){
                    exists = true;
                    break;
                }
            }
            if(!exists){
                RankPosition rankPosition = new RankPosition(0, candidate);
                rankPositions.add(rankPosition);
            }
        }
        return rankPositions;
    }

    public void updateRank(JobOpening jobOpening, List<RankPosition> rankPositions){
        Rank rank = jobOpening.getRank();
        rank.setRankPosition(rankPositions);
        boolean finished = true;
        for(RankPosition rankPosition : rankPositions){
            if (rankPosition.getPosition() == 0) {
                finished = false;
                break;
            }
        }
        if(finished){
            rank.setRankStatus(RankStatus.FINISHED);
        }
        else {
            rank.setRankStatus(RankStatus.STARTED);
        }
        rankRepository.save(rank);
    }
}
