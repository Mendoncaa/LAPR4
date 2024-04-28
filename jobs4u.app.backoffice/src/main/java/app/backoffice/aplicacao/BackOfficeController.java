package app.backoffice.aplicacao;

import domain.UserEntity;
import java.util.List;
import persistence.impl.jpa.UserEntityRepositorio;

import javax.persistence.EntityManagerFactory;

public class BackOfficeController {
    private final Long userId;
    private final UserEntityRepositorio userRepo;
    private final EntityManagerFactory emFactory;

    // Constructor that injects the EntityManagerFactory and UserEntityRepositorio
    public BackOfficeController(Long userId, EntityManagerFactory emFactory, UserEntityRepositorio userRepo) {
        this.userId = userId;
        this.emFactory = emFactory;
        this.userRepo = userRepo;
    }

    public String getUserId() {
        return userId.toString();
    }

    public String getUsername(Long userId) {
        return userRepo.findUsernameById(userId, emFactory);
    }

    public List<UserEntity> findAll(){
        return userRepo.findAll(emFactory);
    }

    public List<UserEntity> findAllActive(){
        return userRepo.findAllActive(emFactory);
    }

    public List<UserEntity> findAllInactive(){
        return userRepo.findAllInactive(emFactory);
    }

    public void deactivateOrActivateUser(Long userId, boolean active){
        userRepo.deactivateOrActivateUser(userId, emFactory, active);
    }

}
