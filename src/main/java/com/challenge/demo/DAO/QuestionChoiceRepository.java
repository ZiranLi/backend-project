package com.challenge.demo.DAO;

import com.challenge.demo.Entity.QuestionChoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface QuestionChoiceRepository extends JpaRepository<QuestionChoice, Long> {
    boolean addChoice(QuestionChoice choice);
    boolean deleteChoiceByChoiceId(int choiceId);
    boolean deleteChoiceByQuestionId(int questionId);
    List<QuestionChoice> selectByQuestionId(int questionId);
    boolean updateChoiceTextById(@Param("choiceId") int choiceId, @Param("choiceText") String choiceText);
    boolean updateChoiceCorrectness(@Param("choiceId") int choiceId, @Param("isRightChoice") boolean isRightChoice);
}
