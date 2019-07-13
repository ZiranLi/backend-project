package com.challenge.demo.DAO;

import com.challenge.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends JpaRepository<User, Long> {
    boolean addUser(User user);
    boolean removeUser(String username);
    User getUserByUsername(@Param("username") String username);
}
