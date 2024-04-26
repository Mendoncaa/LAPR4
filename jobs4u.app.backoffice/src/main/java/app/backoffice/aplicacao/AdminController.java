package app.backoffice.aplicacao;

import persistence.impl.jpa.AdminEntityRepositorio;
import persistence.impl.jpa.AdminEntityRepositorioJPAImpl;

import javax.persistence.EntityManagerFactory;

public class AdminController {

    private AdminEntityRepositorio adminRep = new AdminEntityRepositorioJPAImpl();

    private EntityManagerFactory factory = Factory.getFactory();

    public String getUsername(Long AdminId) {
        return adminRep.findUsernameById(AdminId, factory);
    }

}
