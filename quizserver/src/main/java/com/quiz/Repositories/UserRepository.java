package com.quiz.Repositories;

import com.quiz.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUserName(String username);
}
