/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.impl.jpa;

import domain.UserEntity;

import javax.persistence.EntityManagerFactory;
import java.util.List;

/**
 *
 * @author eapli
 */
public interface UserEntityRepositorio {

    void defaultData(EntityManagerFactory factory);

    int auth(EntityManagerFactory factory, String usr, String psw, String role);

    Long getId(EntityManagerFactory factory, String usr, String psw);

    UserEntity add(UserEntity userEntity, EntityManagerFactory factory);

    UserEntity findById(Long id, EntityManagerFactory factory);

    String findUsernameById(Long id, EntityManagerFactory factory);

    List<UserEntity> findAll(EntityManagerFactory factory);

    List<UserEntity> findAllActive(EntityManagerFactory factory);

    List<UserEntity> findAllInactive(EntityManagerFactory factory);

    void deactivateOrActivateUser(Long id, EntityManagerFactory factory, boolean b);
}
