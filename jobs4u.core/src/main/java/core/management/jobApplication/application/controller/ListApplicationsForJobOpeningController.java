package core.management.jobApplication.application.controller;

import core.infrastructure.persistence.PersistenceContext;
import core.management.jobApplication.domain.Application;
import core.management.jobApplication.repository.ApplicationRepository;
import org.springframework.stereotype.Controller;

@Controller
public class ListApplicationsForJobOpeningController {

    //private final ApplicationRepository applicationRepository = PersistenceContext.repositories().applications();

    public Iterable<Application> allJobOpenings() {

        //applicationRepository.findAll();
        return null;
    }
}
