package app.backoffice.aplicacao;

import persistence.impl.jpa.UserEntityRepositorio;
import persistence.impl.jpa.UserEntityRepositorioJPAImpl;

import javax.persistence.*;

public class mainController {

    private UserEntityRepositorio userRep = new UserEntityRepositorioJPAImpl();

    private EntityManagerFactory factory = Factory.getFactory();

    public void loadData() {
        if(userRep.findAll(factory).isEmpty())
            userRep.defaultData(factory);
    }

    public int auth(String usr, String psw) {
        return userRep.auth(factory,usr,psw);
    }

    public Long getAdminId(String usr, String psw) {
        return userRep.getAdminId(factory,usr,psw);
    }

}
