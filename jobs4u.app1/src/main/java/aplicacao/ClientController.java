/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import domain.ClientEntity;
import persistence.impl.jpa.ClientEntityRepositorio;
import persistence.impl.jpa.ClientEntityRepositorioJPAImpl;

import java.security.NoSuchAlgorithmException;
import java.util.List;

public class ClientController {

    public ClientEntity createAndSaveClient(String username, String password, String firstName, String lastName, String email, String phone, String role) throws NoSuchAlgorithmException {
        String formatedFirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        String formatedLastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        String encryptedPassword = encodePassword(password);
        ClientEntity cl = new ClientEntity(username, encryptedPassword, formatedFirstName, formatedLastName, phone, email, role);
        ClientEntityRepositorio repo = new ClientEntityRepositorioJPAImpl();
        return repo.add(cl);
    }

    public boolean checkValidClient(String username, String password, String firstName, String lastName, String email, String phone, String role) throws InstantiationException {
        CheckClient checkClient = new CheckClient();
        return checkClient.checkValidClient(username, password, firstName, lastName, email, phone, role);
    }
    
    public List<ClientEntity> listarClients() {
        ClientEntityRepositorio repo = new ClientEntityRepositorioJPAImpl();
        return repo.findAll();
	}

	public ClientEntity procurarGrupoAutomovel(long id) {
        ClientEntityRepositorio repo = new ClientEntityRepositorioJPAImpl();
        return repo.findById(id);
	}

    public String encodePassword(String password) throws NoSuchAlgorithmException {
        EncryptPassword encryptPassword = new EncryptPassword();
        return encryptPassword.encrypt(password);
    }
}
