package com.challenge.demo.Service;

import com.challenge.demo.Entity.Question;
import com.challenge.demo.Entity.Question_Given;
import com.challenge.demo.Entity.User;

public interface UserService {

    //to be continued once finished DAO layer
    User verifyUser(String username, String password);
    User getUser(String username);
    boolean addUser(String username, String password);
    boolean removeUser(String username, String password);
    Question getQuestion(String username);
    boolean addHistory(Integer questionId, String username);

}
