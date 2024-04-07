/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.impl.jpa;

import domain.ClientEntity;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ClientEntityRepositorioJPAImpl implements ClientEntityRepositorio {

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.
                createEntityManagerFactory("jobs4u_pu");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }

    @Override
    public ClientEntity add(ClientEntity clientEntity) {
        if (clientEntity == null) {
            throw new IllegalArgumentException();
        }
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(clientEntity);
        tx.commit();
        em.close();

        return clientEntity;
    }

    @Override
    public ClientEntity findById(Long id) {
        return getEntityManager().find(ClientEntity.class, id);
    }

    @Override
    public List<ClientEntity> findAll() {
        Query query = getEntityManager().createQuery(
                "SELECT e FROM ClientEntity e");
        List<ClientEntity> list = query.getResultList();
        return list;
    }

}
