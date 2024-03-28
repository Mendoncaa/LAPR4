package aplicacao;

import java.util.regex.Pattern;

public class CheckClient {
    private static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", 2);
    public boolean checkValidClient(String username, String password, String firstName, String lastName, String email, String phone, String role) throws InstantiationException{
        if (username == null || username.isEmpty()) {
            throw new InstantiationException("Username não pode ser vazio");
        }
        if (password == null || password.isEmpty()) {
            throw new InstantiationException("Password não pode ser vazio");
        }
        if(password.length() < 8){
            throw new InstantiationException("Password deve ter no mínimo 8 caracteres");
        }
        if(!password.matches(".*\\d.*")){
            throw new InstantiationException("Password deve ter no minimo um número");
        }
        if(!password.matches(".*[A-Z].*")){
            throw new InstantiationException("Password deve ter no mínimo uma letra maiúscula");
        }
        if (firstName == null || firstName.isEmpty()) {
            throw new InstantiationException("First Name não pode ser vazio");
        }
        if (lastName == null || lastName.isEmpty()) {
            throw new InstantiationException("Last Name não pode ser vazio");
        }
        if (email == null || email.isEmpty()) {
            throw new InstantiationException("Email não pode ser vazio");
        }

        if(!VALID_EMAIL_ADDRESS_REGEX.matcher(email).find()){
            throw new InstantiationException("Email inválido");
        }
        if (phone == null || phone.isEmpty()) {
            throw new InstantiationException("Phone não pode ser vazio");
        }
        if (role == null || role.isEmpty()) {
            throw new InstantiationException("Role não pode ser vazio");
        }
        return true;
    }
}
