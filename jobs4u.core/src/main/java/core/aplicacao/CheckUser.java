package core.aplicacao;

public class CheckUser {
 //   private static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", 2);
    public boolean checkValidClient(String username, String password, String firstName, String lastName, String role) throws InstantiationException{
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
        if (role == null || role.isEmpty()) {
            throw new InstantiationException("Role não pode ser vazio");
        }
        return true;
    }
}
