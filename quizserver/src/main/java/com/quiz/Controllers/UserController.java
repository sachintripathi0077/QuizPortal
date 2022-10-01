package com.quiz.Controllers;

import com.quiz.Models.Role;
import com.quiz.Models.User;
import com.quiz.Models.UserRole;
import com.quiz.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    // Creating user
    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {
        Set<UserRole> roles = new HashSet<>();
        Role role = new Role();
        role.setRoleId(45L);
        role.setRoleDescription("Normal");

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);
        roles.add(userRole);
        return this.userService.createUser(user,roles);
    }

    // Getting user by userName
    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username) {
        return this.userService.getUser(username);
    }

    // Deleting user by userId
    @DeleteMapping("/{userid}")
    public void deleteUser(@PathVariable("userid") long userid){
       this.userService.deleteUser(userid);
    }
}
