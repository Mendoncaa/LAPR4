package domain;

import javax.persistence.*;

@Entity
public class AdminEntity {
    @GeneratedValue
    @Id
    @Column(name = "IDADMIN")
    private Long idAdmin;
    @Basic
    @Column(name = "PASSWORD")
    private String password;
    @Basic
    @Column(name = "USERNAME")
    private String username;
    @Basic
    @Column(name = "ROLE")
    private String role;
    @Basic
    @Column(name = "ISENABLED")
    private boolean isEnabled = true;

    public AdminEntity(String username, String password, String role){
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public AdminEntity() {

    }

    public Long getIdAdmin() {
        return idAdmin;
    }

    public String getPassword() {
        return password;
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
