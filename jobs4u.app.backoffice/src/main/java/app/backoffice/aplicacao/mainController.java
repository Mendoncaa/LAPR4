package app.backoffice.aplicacao;

import persistence.impl.jpa.AdminEntityRepositorio;
import persistence.impl.jpa.AdminEntityRepositorioJPAImpl;

import javax.persistence.*;

public class mainController {

    static EntityManagerFactory factory;

    private AdminEntityRepositorio adminRep = new AdminEntityRepositorioJPAImpl();

    public boolean createFactory(String connectionName){
        try {
            factory = Persistence.createEntityManagerFactory(connectionName);
            return true;
        } catch (Exception ex) {
            System.out.println("Error creating factory");
            return false;
        }
    }

    public void loadData() {
        if(adminRep.findAll(factory).isEmpty())
            adminRep.defaultData(factory);
    }

    public int auth(String usr, String psw) {
        return adminRep.auth(factory,usr,psw);
    }

    public int getAdminId(String usr, String psw) {
        return adminRep.getAdminId(factory,usr,psw);
    }

}
