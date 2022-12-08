package com.example.shoppingcart.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Role",
        uniqueConstraints = {
                @UniqueConstraint(name = "ROLE_UK", columnNames = "Role_Name")})
public class Role {

    @Id
    @GeneratedValue
    @Column(name = "Role_Id", nullable = false)
    private Long roleid;

    @Column(name = "Role_Name", length = 30, nullable = false)
    private String rolename;

    @ManyToMany(mappedBy = "roles")
    private List<User> User = new ArrayList<>();



    public Long getRoleId() {
        return roleid;
    }

    public void setRoleId(Long roleId) {
        this.roleid = roleId;
    }

    public String getRoleName() {
        return rolename;
    }

    public void setRoleName(String roleName) {
        this.rolename = roleName;
    }

    public List<com.example.shoppingcart.entity.User> getUser() {
        return User;
    }

    public void setUser(List<User> user) {
        User = user;
    }

}
