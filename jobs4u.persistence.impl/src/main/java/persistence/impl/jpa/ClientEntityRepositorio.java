/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.impl.jpa;

import domain.ClientEntity;

import java.util.List;

/**
 *
 * @author eapli
 */
public interface ClientEntityRepositorio {

    public ClientEntity add(ClientEntity entity);

    public ClientEntity findById(Long id);

    public List<ClientEntity> findAll();
}
