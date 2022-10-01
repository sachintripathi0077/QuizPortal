package com.quiz.Services;

import com.quiz.Models.User;
import com.quiz.Models.UserRole;

import java.util.Set;

public interface UserService {
    // Creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    // Get user by username
    public User getUser(String username);

    // Deleting user by userId
    public void deleteUser(long userid);
}
