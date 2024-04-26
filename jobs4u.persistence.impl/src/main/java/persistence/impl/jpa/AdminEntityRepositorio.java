/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.impl.jpa;

import domain.AdminEntity;

import javax.persistence.EntityManagerFactory;
import java.util.List;

/**
 *
 * @author eapli
 */
public interface AdminEntityRepositorio {

    void defaultData(EntityManagerFactory factory);

    int auth(EntityManagerFactory factory, String usr, String psw);

    Long getAdminId(EntityManagerFactory factory, String usr, String psw);

    AdminEntity add(AdminEntity adminEntity, EntityManagerFactory factory);

    AdminEntity findById(Long id, EntityManagerFactory factory);

    String findUsernameById(Long id, EntityManagerFactory factory);

    List<AdminEntity> findAll(EntityManagerFactory factory);
}
