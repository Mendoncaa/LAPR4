package app.backoffice.aplicacao;

import core.aplicacao.CheckUser;
import core.aplicacao.Factory;
import domain.UserEntity;
import persistence.impl.jpa.UserEntityRepositorio;
import persistence.impl.jpa.UserEntityRepositorioJPAImpl;
import core.aplicacao.EncryptPassword;

import java.security.NoSuchAlgorithmException;

public class CreateUserController {

    public UserEntity createAndSaveUser(String username, String password, String firstName, String lastName, String role) throws NoSuchAlgorithmException {
        String formatedFirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        String formatedLastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        String encryptedPassword = encodePassword(password);
        UserEntity ue = new UserEntity(username, encryptedPassword, formatedFirstName, formatedLastName, role);
        UserEntityRepositorio repo = new UserEntityRepositorioJPAImpl();
        return repo.add(ue, Factory.getFactory());
    }

    public boolean checkValidUser(String username, String password, String firstName, String lastName, String role) throws InstantiationException {
        CheckUser checkUser = new CheckUser();
        return checkUser.checkValidClient(username, password, firstName, lastName, role);
    }

    public String encodePassword(String password) throws NoSuchAlgorithmException {
        EncryptPassword encryptPassword = new EncryptPassword();
        return encryptPassword.encrypt(password);
    }
}
