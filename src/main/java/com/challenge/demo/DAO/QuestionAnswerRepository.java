package com.challenge.demo.DAO;

import com.challenge.demo.Entity.QuestionAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionAnswerRepository extends JpaRepository<QuestionAnswer, Long> {
}
