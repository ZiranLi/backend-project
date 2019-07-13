package com.challenge.demo.Service;

import com.challenge.demo.DAO.*;
import com.challenge.demo.Entity.MatrixQuestion;
import com.challenge.demo.Entity.Question;
import com.challenge.demo.Entity.Question_Given;
import com.challenge.demo.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {



    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserAnswerRepository userAnswerRepository;


    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private MatrixQuestionRepository matrixQuestionRepository;

    @Autowired
    private MatrixItemDetailRepository matrixItemDetailRepository;

    @Autowired
    private QuestionChoiceRepository questionChoiceRepository;


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
        List<Question> remainingQuestion = getAllRemainingQuestion(username);
        if (remainingQuestion == null || remainingQuestion.size() == 0) {
            return null;
        }
        int nextQuestionIndex = (int)(Math.random() * remainingQuestion.size());
        Question res = remainingQuestion.get(nextQuestionIndex);

        // 暂时不考虑enum type，因为不会 哈哈哈

        if (res.getQuestionType() == 3) { // 3 means matrix question
            List<MatrixQuestion> matrixQuestions = matrixQuestionRepository.selectByQuestionId(res.getQuestionId());
            for(MatrixQuestion m: matrixQuestions) {
                // set details for each matrix question
                m.setMatrixItemDetails(matrixItemDetailRepository.selectByMatrixId(m.getMatrixId()));
            }
            //set matrix questions as list of question
            res.setMatrixQuestions(matrixQuestions);
        } else {
            //other types, just set choices
            res.setChoices(questionChoiceRepository.selectByQuestionId(res.getQuestionId()));
        }
        return res;
    }

    public List<Question> getAllRemainingQuestion(String username) {
        List<Question> all = questionRepository.selectAll();
        List<Integer> answered = userAnswerRepository.getQuestionIdByUsername(username);
        Set<Integer> answeredSet = new HashSet<>(answered);
        List<Question> res = new ArrayList<>();
        for(Question q: all) {
            int id = q.getQuestionId();
            if (!answeredSet.contains(id)) {
                res.add(q);
            }
        }
        return res;
    }

    @Override
    public boolean addHistory(Integer questionId, String username) {
        return userAnswerRepository.add(questionId, username);
    }
}
