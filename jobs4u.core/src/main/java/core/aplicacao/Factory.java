package core.aplicacao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Factory {

    static EntityManagerFactory factory  = Persistence.createEntityManagerFactory("jobs4u_pu");

    public static EntityManagerFactory getFactory() {
        return factory;
    }
}
