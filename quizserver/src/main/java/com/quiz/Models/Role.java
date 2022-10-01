package com.quiz.Models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    private long roleId;
    private String roleDescription; // same as "roleName"

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "role")
    private Set<UserRole> userRoles = new HashSet<>();

    //CONSTRUCTORS

    public Role(long roleId, String roleDescription) {
        this.roleId = roleId;
        this.roleDescription = roleDescription;
    }

    public Role() {

    }


    // GETTERS

    public long getRoleId() {
        return roleId;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    // SETTERS

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }
}
