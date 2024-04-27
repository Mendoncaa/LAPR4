package app.backoffice.aplicacao;

import core.aplicacao.Factory;
import domain.UserEntity;
import java.util.List;
import persistence.impl.jpa.UserEntityRepositorio;
import persistence.impl.jpa.UserEntityRepositorioJPAImpl;

import javax.persistence.EntityManagerFactory;

public class BackOfficeController {

    private UserEntityRepositorio UserRep = new UserEntityRepositorioJPAImpl();

    private EntityManagerFactory factory = Factory.getFactory();

    public String getUsername(Long UserId) {
        return UserRep.findUsernameById(UserId, factory);
    }

    public List<UserEntity> findAll(){
        return UserRep.findAll(factory);
    }

    public List<UserEntity> findAllActive(){
        return UserRep.findAllActive(factory);
    }

    public List<UserEntity> findAllInactive(){
        return UserRep.findAllInactive(factory);
    }

    public void deactivateOrActivateUser(Long UserId, boolean b){
        UserRep.deactivateOrActivateUser(UserId, factory, b);
    }

}
