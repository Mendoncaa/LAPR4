package domain;

import javax.persistence.*;

@Entity
public class UserEntity {
    @GeneratedValue
    @Id
    @Column(name = "IDUSER")
    private Long idUser;
    @Basic
    @Column(name = "PASSWORD")
    private String password;
    @Basic
    @Column(name = "USERNAME")
    private String username;
    @Basic
    @Column(name = "FIRSTNAME")
    private String firstName;
    @Basic
    @Column(name = "LASTNAME")
    private String lastName;
    @Basic
    @Column(name = "ROLE")
    private String role;
    @Basic
    @Column(name = "ISENABLED")
    private boolean isEnabled = true;

    public UserEntity(String username, String password, String firstName, String lastName, String role){
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public UserEntity() {

    }

    public Long getIdUser() {
        return idUser;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean b) {
        isEnabled = b;
    }

    /* @Override
    public String toString() {
        return "ClientEntity{\n" +
                "Username: '" + username + '\n' +
                "First Name: '" + firstName + '\n' +
                "Last Name: '" + lastName + '\n' +
                "Phone: '" + phone + '\n' +
                "E-mail: '" + email + '\n' +
                "Role: '" + role + '\n' +
                '}';
    }
 /*   @Override
    public int hashCode() {
        int result = idClient;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    } */
}
