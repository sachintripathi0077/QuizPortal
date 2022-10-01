package com.quiz.Models;

import javax.persistence.*;

@Entity
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userRoleID;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @ManyToOne
    private Role role;

    // GETTERS

    public long getUserRoleID() {
        return userRoleID;
    }

    public User getUser() {
        return user;
    }

    public Role getRole() {
        return role;
    }

    // SETTERS


    public void setUserRoleID(long userRoleID) {
        this.userRoleID = userRoleID;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
