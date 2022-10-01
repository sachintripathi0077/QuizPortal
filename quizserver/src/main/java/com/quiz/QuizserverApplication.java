package com.quiz;

import ch.qos.logback.core.CoreConstants;
import com.quiz.Models.Role;
import com.quiz.Models.User;
import com.quiz.Models.UserRole;
import com.quiz.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class QuizserverApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(QuizserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Executing ...");
//		User user = new User();
//
//		// Setting user details
//		user.setFirstName("Sachin");
//		user.setLastName("Tripathi");
//		user.setUserName("sachin.tripathi");
//		user.setEmail("sachintripathi0077@gmail.com");
//		user.setPhone("7651962600");
//		user.setPassword("Gyps8m");
//		user.setProfile("default.png");
//
//		// Setting user role
//		Role role = new Role();
//		role.setRoleId(44);
//		role.setRoleDescription("Admin");
//
//		Set<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//
//		this.userService.createUser(user,userRoleSet);
//		System.out.println("user information: \nusername: "+user.getUserName());

	}
}
