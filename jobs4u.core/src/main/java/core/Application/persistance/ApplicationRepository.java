package core.Application.persistance;

/* 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
*/
import core.Application.domain.Application;
import core.Application.domain.ApplicationID;

// @Repository


public interface ApplicationRepository {
    Application findByApplicationID(ApplicationID applicationID);
}

//extends JpaRepository<Application, Long>