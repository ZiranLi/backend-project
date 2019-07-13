package com.challenge.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class MatrixQuestion {
//    - questionId   auto integer
//   - matrix_item_id      integer
//   - isActive     boolean
//   - item_text   varchar


    private Integer questionId;

    @Id
    @GeneratedValue
    private Integer matrixId;

    private Boolean isActive;

    private String matrixItemText;

    private List<MatrixItemDetail> matrixItemDetails;

    public MatrixQuestion() {
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public List<MatrixItemDetail> getMatrixItemDetails() {
        return matrixItemDetails;
    }

    public void setMatrixItemDetails(List<MatrixItemDetail> matrixItemDetails) {
        this.matrixItemDetails = matrixItemDetails;
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
