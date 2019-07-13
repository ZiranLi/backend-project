package com.challenge.demo.DAO;

import com.challenge.demo.Entity.User;
import org.springframework.data.repository.query.Param;


public interface UserDao {
    int addUser(User user);
    int removeUser(String username);
    User getUserByUsername(@Param("username") String username);
}
