/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.impl.jpa;

import domain.AdminEntity;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.persistence.*;

import app.backoffice.aplicacao.EncryptPassword;

public class AdminEntityRepositorioJPAImpl implements AdminEntityRepositorio {

    private EntityManager getEntityManager(EntityManagerFactory factory) {
        EntityManager manager = factory.createEntityManager();
        return manager;
    }
    private String encryptPassword(String password) throws NoSuchAlgorithmException {
        EncryptPassword encryptPassword = new EncryptPassword();
        return encryptPassword.encrypt(password);
    }

    @Override
    public void defaultData(EntityManagerFactory factory){
        try {

            AdminEntity admin1 = new AdminEntity("admin", encryptPassword("Password1"), "Admin");
            add(admin1, factory);

        } catch (Exception ex){
            System.out.println("Error loading default data");
        }
    }

    @Override
    public int auth(EntityManagerFactory factory, String usr, String psw) {
        try {
            Query q = getEntityManager(factory).createQuery("select us.role, us.isEnabled from AdminEntity us where us.username= :usn and us.password=:pwd ");
            q.setParameter("usn",usr);
            q.setParameter("pwd",encryptPassword(psw));

            Object[] output = q.getResultList().toArray();

            Object[] aux = (Object[]) output[0];

            String ret = (String) aux[0];

            if (!((boolean) aux[1]) && !ret.equals("Admin")) {
                return 0;
            }

            return 1;

            //return output;
        } catch (Exception ex){
            System.out.println("Error executing the query");
            return 0;
        }
    }

    @Override
    public int getAdminId(EntityManagerFactory factory, String usr, String psw) {
        EntityManager manager = factory.createEntityManager();
        try {
            Query q = manager.createQuery("select us.idAdmin from AdminEntity us where us.username= :usn and us.password=:pwd ");
            q.setParameter("usn",usr);
            q.setParameter("pwd",encryptPassword(psw));

            int output = (int) q.getSingleResult();

            return output;
        } catch (Exception ex){
            System.out.println("Error executing the query");
            return 0;
        }
    }

    @Override
    public AdminEntity add(AdminEntity adminEntity, EntityManagerFactory factory) {
        if (adminEntity == null) {
            throw new IllegalArgumentException();
        }
        EntityManager em = getEntityManager(factory);
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(adminEntity);
        tx.commit();
        em.close();

        return adminEntity;
    }

    @Override
    public AdminEntity findById(Long id, EntityManagerFactory factory){
        return getEntityManager(factory).find(AdminEntity.class, id);
    }

    @Override
    public List<AdminEntity> findAll(EntityManagerFactory factory) {

        Query query = getEntityManager(factory).createQuery(
                "SELECT e FROM AdminEntity e");
        List<AdminEntity> list = query.getResultList();
        return list;
    }

}
