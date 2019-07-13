package com.challenge.demo.DAO;

import com.challenge.demo.Entity.MatrixQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MatrixQuestionRepository extends JpaRepository<MatrixQuestion, Long> {
    boolean add(MatrixQuestion matrixQuestion);
    boolean delete(int matrixQuestionId);
    List<MatrixQuestion> selectByQuestionId(int questionId);
    int deleteByQuestionId (int questionId);
    boolean updateMatrixTextById(@Param("matrixId")int matrixId, @Param("matrixItemText")String matrixItemText);
}
