/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.backoffice.aplicacao;

import domain.AdminEntity;
import persistence.impl.jpa.AdminEntityRepositorioJPAImpl;
import persistence.impl.jpa.AdminEntityRepositorio;

import java.security.NoSuchAlgorithmException;
import java.util.List;

public class ClientController {
/*
    public AdminEntity createAndSaveClient(String username, String password, String firstName, String lastName, String email, String phone, String role) throws NoSuchAlgorithmException {
        String formatedFirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        String formatedLastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        String encryptedPassword = encodePassword(password);
        AdminEntity cl = new AdminEntity(username, encryptedPassword, formatedFirstName, formatedLastName, phone, email, role);
        AdminEntityRepositorio repo = new AdminEntityRepositorioJPAImpl();
        return repo.add(cl);
    }

    public boolean checkValidClient(String username, String password, String firstName, String lastName, String email, String phone, String role) throws InstantiationException {
        CheckClient checkClient = new CheckClient();
        return checkClient.checkValidClient(username, password, firstName, lastName, email, phone, role);
    }
    
    public List<AdminEntity> listarClients() {
        AdminEntityRepositorio repo = new AdminEntityRepositorioJPAImpl();
        return repo.findAll();
	}

	public AdminEntity procurarGrupoAutomovel(long id) {
        AdminEntityRepositorio repo = new AdminEntityRepositorioJPAImpl();
        return repo.findById(id);
	}

    public String encodePassword(String password) throws NoSuchAlgorithmException {
        EncryptPassword encryptPassword = new EncryptPassword();
        return encryptPassword.encrypt(password);
    }*/
}
