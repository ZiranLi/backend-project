package com.challenge.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MatrixQuestion {
//    - questionId   auto integer
//   - matrix_item_id      integer
//   - isActive     boolean
//   - item_text   varchar


    private Integer questionId;

    private Integer matrixId;

    @Id
    @GeneratedValue
    private Boolean isActive;

    private String matrixItemText;


    public MatrixQuestion() {
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getMatrixId() {
        return matrixId;
    }

    public void setMatrixId(Integer matrixId) {
        this.matrixId = matrixId;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getMatrixItemText() {
        return matrixItemText;
    }

    public void setMatrixItemText(String matrixItemText) {
        this.matrixItemText = matrixItemText;
    }
}
