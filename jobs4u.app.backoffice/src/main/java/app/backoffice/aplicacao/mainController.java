package app.backoffice.aplicacao;

import persistence.impl.jpa.AdminEntityRepositorio;
import persistence.impl.jpa.AdminEntityRepositorioJPAImpl;

import javax.persistence.*;

public class mainController {

    private AdminEntityRepositorio adminRep = new AdminEntityRepositorioJPAImpl();

    private EntityManagerFactory factory = Factory.getFactory();

    public void loadData() {
        if(adminRep.findAll(factory).isEmpty())
            adminRep.defaultData(factory);
    }

    public int auth(String usr, String psw) {
        return adminRep.auth(factory,usr,psw);
    }

    public Long getAdminId(String usr, String psw) {
        return adminRep.getAdminId(factory,usr,psw);
    }

}
