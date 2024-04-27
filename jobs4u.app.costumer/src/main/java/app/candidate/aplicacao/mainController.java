package app.candidate.aplicacao;

import core.aplicacao.Factory;
import persistence.impl.jpa.UserEntityRepositorio;
import persistence.impl.jpa.UserEntityRepositorioJPAImpl;

import javax.persistence.EntityManagerFactory;

public class mainController {

    private UserEntityRepositorio userRep = new UserEntityRepositorioJPAImpl();

    private EntityManagerFactory factory = Factory.getFactory();

    public void loadData() {
        if(userRep.findAll(factory).isEmpty())
            userRep.defaultData(factory);
    }

    public int auth(String usr, String psw, String role) {
        return userRep.auth(factory,usr,psw, role);
    }

    public Long getCostumerId(String usr, String psw) {
        return userRep.getId(factory,usr,psw);
    }

}
