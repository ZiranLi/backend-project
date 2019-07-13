package com.challenge.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User, Integer> {
    int addUser(User user);
    int removeUser(String username);
    User getUserByUsername(@Param("username") String username);
}
