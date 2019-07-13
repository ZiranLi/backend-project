package com.challenge.demo.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

public class Question {

    /*- question_id   auto integer
   - question_type integer
   - question_text      varchar
   - is_active     boolean
*/

    @Id
    @GeneratedValue
    private Integer questionId;

    private Integer questionType;

    private String questionText;

    private Boolean isActive;

    private List<QuestionChoice> choices;

    private List<MatrixQuestion> matrixQuestions;

    public Question() {
    }

    public Question(Integer questionId, Integer questionType, String questionText, Boolean isActive) {
        this.questionId = questionId;
        this.questionType = questionType;
        this.questionText = questionText;
        this.isActive = isActive;
    }


    public List<QuestionChoice> getChoices() {
        return choices;
    }

    public void setChoices(List<QuestionChoice> choices) {
        this.choices = choices;
    }

    public List<MatrixQuestion> getMatrixQuestions() {
        return matrixQuestions;
    }

    public void setMatrixQuestions(List<MatrixQuestion> matrixQuestions) {
        this.matrixQuestions = matrixQuestions;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
