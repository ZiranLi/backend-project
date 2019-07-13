package com.challenge.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {



    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserDao userDao;


    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    @Override
    public User verifyUser(String username, String password) {
        User user = userRepository.getUserByUsername(username);
        if (user == null || !user.getPassword().equals(password)) {
            return null;
        }
        return user;
    }

    @Override
    public User getUser(String username) {
        return userRepository.getUserByUsername(username);
    }

    @Override
    public boolean addUser(String username, String password) {
        User user = userRepository.getUserByUsername(username);
        if (user == null) {
            user = new User(username, password);
            userRepository.addUser(user);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeUser(String username, String password) {
        User user = userRepository.getUserByUsername(username);
        if (user == null || !user.getPassword().equals(password)) {
            return false;
        }
        userRepository.removeUser(username);
        return true;
    }

    @Override
    public Question getQuestion(String username) {
        return null;
    }

    @Override
    public boolean addHistory(Integer questionId, String username) {
        return false;
    }
}
