package com.sheryians.major.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Data
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotEmpty
    @Column(nullable = false)
    private String firstName;

    private String lastName;

    @Column(nullable = false,unique = true)
    @NotEmpty
    @Email(message = "{errors.invalid_email}")
    private String email;

    private String password;

    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(
        name = "user_role",
        joinColumns = {@JoinColumn(name = "USER_ID" , referencedColumnName = "ID")},
        inverseJoinColumns = {@JoinColumn(name = "ROLE_ID", referencedColumnName = "ID")} 
    )
    private List<Role> roles;


    public User(User user) {
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.roles = user.getRoles();

    }

    public User() {

    }

    protected List<Role> getRoles() {
        return roles;
    }


    public String getPassword() {
        return password;
    }


    @NotEmpty @Email(message = "{errors.invalid_email}")
    public String getEmail() {
        return email;
    }


    private String getLastName() {
        return lastName;
    }


    private @NotEmpty String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}