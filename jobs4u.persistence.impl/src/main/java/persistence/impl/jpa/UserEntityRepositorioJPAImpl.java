/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.impl.jpa;

import domain.UserEntity;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.persistence.*;

import core.aplicacao.EncryptPassword;

public class UserEntityRepositorioJPAImpl implements UserEntityRepositorio {

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

            UserEntity admin = new UserEntity("admin", encryptPassword("Password1"), "Administrator", "One", "Admin");
            add(admin, factory);

            UserEntity candidate = new UserEntity("candidate1", encryptPassword("Password1"), "Antonio", "Silva", "Candidate");
            add(candidate, factory);

            UserEntity costumer = new UserEntity("costumer1", encryptPassword("Password1"), "Empresa", "Teste", "Costumer");
            add(costumer, factory);

            UserEntity candidate2 = new UserEntity("candidate2", encryptPassword("Password2"), "Joao", "Guedes", "Candidate");
            add(candidate2, factory);

        } catch (Exception ex){
            System.out.println("Error loading default data");
        }
    }

    @Override
    public int auth(EntityManagerFactory factory, String usr, String psw, String role) {
        try {
            Query q = getEntityManager(factory).createQuery("select us.role, us.isEnabled from UserEntity us where us.username= :usn and us.password=:pwd ");
            q.setParameter("usn",usr);
            q.setParameter("pwd",encryptPassword(psw));

            Object[] output = q.getResultList().toArray();

            if(output.length == 0){
                return 0;
            }

            Object[] aux = (Object[]) output[0];

            String ret = (String) aux[0];

            if (!((boolean) aux[1])) {
                return -1;
            }
            else if(!ret.equals(role)){
                return -2;
            }

            return 1;
        } catch (Exception ex){
            System.out.println("Error executing the query");
            return 0;
        }
    }

    @Override
    public Long getId(EntityManagerFactory factory, String usr, String psw) {
        EntityManager manager = factory.createEntityManager();
        try {
            Query q = manager.createQuery("select us.idUser from UserEntity us where us.username= :usn and us.password=:pwd ");
            q.setParameter("usn",usr);
            q.setParameter("pwd",encryptPassword(psw));

            Long output = (Long) q.getSingleResult();

            return output;
        } catch (Exception ex){
            System.out.println("Error executing the query");
            return 0L;
        }
    }

    @Override
    public UserEntity add(UserEntity userEntity, EntityManagerFactory factory) {
        if (userEntity == null) {
            throw new IllegalArgumentException();
        }
        EntityManager em = getEntityManager(factory);
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(userEntity);
        tx.commit();
        em.close();

        return userEntity;
    }

    @Override
    public UserEntity findById(Long id, EntityManagerFactory factory){
        return getEntityManager(factory).find(UserEntity.class, id);
    }

    @Override
    public String findUsernameById(Long id, EntityManagerFactory factory){
        return getEntityManager(factory).find(UserEntity.class, id).getUsername();
    }

    @Override
    public List<UserEntity> findAll(EntityManagerFactory factory) {

        Query query = getEntityManager(factory).createQuery(
                "SELECT e FROM UserEntity e");
        List<UserEntity> list = query.getResultList();
        return list;
    }

    @Override
    public List<UserEntity> findAllActive(EntityManagerFactory factory) {

        Query query = getEntityManager(factory).createQuery(
                "SELECT e FROM UserEntity e WHERE e.isEnabled = true");
        List<UserEntity> list = query.getResultList();
        return list;
    }

    @Override
    public List<UserEntity> findAllInactive(EntityManagerFactory factory) {

        Query query = getEntityManager(factory).createQuery(
                "SELECT e FROM UserEntity e WHERE e.isEnabled = false");
        List<UserEntity> list = query.getResultList();
        return list;
    }

    @Override
    public void deactivateOrActivateUser(Long id, EntityManagerFactory factory, boolean b){
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        UserEntity user = manager.find(UserEntity.class, id);
        user.setEnabled(b);
        manager.persist(user);
        transaction.commit();
        manager.close();
    }

}
