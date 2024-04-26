package app.backoffice.aplicacao;

import domain.UserEntity;
import java.util.List;
import persistence.impl.jpa.UserEntityRepositorio;
import persistence.impl.jpa.UserEntityRepositorioJPAImpl;

import javax.persistence.EntityManagerFactory;

public class BackOfficeController {

    private UserEntityRepositorio adminRep = new UserEntityRepositorioJPAImpl();

    private EntityManagerFactory factory = Factory.getFactory();

    public String getUsername(Long UserId) {
        return adminRep.findUsernameById(UserId, factory);
    }

    public List<UserEntity> findAll(){
        return adminRep.findAll(factory);
    }

}
