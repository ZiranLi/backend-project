package com.challenge.demo.DAO;

import com.challenge.demo.Entity.Question;
import com.challenge.demo.Entity.UserAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserAnswerRepository extends JpaRepository<UserAnswer, Long> {
    boolean add(@Param("questionId")int questionId, @Param("username")String username);
    List<Integer> getQuestionIdByUsername(@Param("username")String username);
}
