package com.challenge.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class QuestionChoice {
    /* - choice_id        auto integer
   - question_id      integer
   - is_right_choice  boolean
   - choice _text          varchar
*/
    @Id
    @GeneratedValue
    private Integer choiceId;

    private Integer questionId;

    private Boolean isRightChoice;

    private String choiceText;

    public QuestionChoice() {
    }

    public Integer getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(Integer choiceId) {
        this.choiceId = choiceId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Boolean getRightChoice() {
        return isRightChoice;
    }

    public void setRightChoice(Boolean rightChoice) {
        isRightChoice = rightChoice;
    }

    public String getChoiceText() {
        return choiceText;
    }

    public void setChoiceText(String choiceText) {
        this.choiceText = choiceText;
    }
}
