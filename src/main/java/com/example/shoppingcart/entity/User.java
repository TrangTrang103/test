package com.example.shoppingcart.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "User", uniqueConstraints = {@UniqueConstraint(name = "USER_UK", columnNames = "User_Name")})
public class User {

    @Id
    @GeneratedValue
    @Column(name = "User_Id", nullable = false)
    private Long id ;

    @Column(name = "User_Name", length = 100, nullable = false)
    private String username ;

    @Column(name = "Encryted_Password", length = 128, nullable = false)
    private String encrytedPassword ;

    @Column(name = "Enable" , length = 1, nullable = false)
    private boolean enable ;



    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "User_Id"),
            inverseJoinColumns = @JoinColumn(name = "Role_id"))

    private Set<Role> roles = new HashSet<>();

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getEncrytedPassword() {
        return encrytedPassword;
    }

    public void setEncrytedPassword(String encrytedPassword) {
        this.encrytedPassword = encrytedPassword;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
