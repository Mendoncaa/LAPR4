package domain;

import javax.persistence.*;

@Entity
public class ClientEntity {
    @GeneratedValue
    @Id
    @Column(name = "IDCLIENT")
    private int idClient;
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
    @Column(name = "PHONE")
    private String phone;
    @Basic
    @Column(name = "EMAIL")
    private String email;
    @Basic
    @Column(name = "ROLE")
    private String role;
    @Basic
    @Column(name = "ISENABLED")
    private boolean isEnabled = true;

    public ClientEntity(String username, String password, String firstName, String lastName, String phone, String email, String role){
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.role = role;
    }

    public ClientEntity() {

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
