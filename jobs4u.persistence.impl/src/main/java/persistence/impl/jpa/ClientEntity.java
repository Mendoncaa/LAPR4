package persistence.impl.jpa;

import javax.persistence.*;

@Entity
@Table(name = "USERS", schema = "PUBLIC", catalog = "JOBS4U")
public class ClientEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private int role;
    @Basic
    @Column(name = "ISENABLED")
    private boolean isEnabled = true;

    public int getIdCLient() {
        return idClient;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRole(){
        return this.role;
    }
    public void setRole(int role) {
        this.role = role;
    }

    public void setEnabled(boolean enabled){
        this.isEnabled = enabled;
    }
    public boolean isEnabled(){
        return this.isEnabled;
    }

    public String toString(){
        return "User " + idClient +
                ": username='" + username + '\'' +
                "| role=" + (role==1 ? "admin" : role==2 ? "teacher" : "student");
    }
    @Override
    public int hashCode() {
        int result = idClient;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + role;
        return result;
    }
}
