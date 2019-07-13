package com.challenge.demo.Entity;

import javax.persistence.Entity;

@Entity
public class UserAnswer {
/*- user_id      integer
   - question_id  integer
   - choice_id    integer
   - is_right     boolean
*/

    private Integer userId;

    private Integer questionId;

    private Integer choiceId;

    private boolean isRight;

    public UserAnswer() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(Integer choiceId) {
        this.choiceId = choiceId;
    }

    public boolean isRight() {
        return isRight;
    }

    public void setRight(boolean right) {
        isRight = right;
    }
}
