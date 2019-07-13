package com.challenge.demo.DAO;

import com.challenge.demo.Entity.Question_Given;
import com.challenge.demo.Entity.Site;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionDTO {

	private Long questionId;

	private Long siteId;

	private String question;

	private Date createdAt;

	private Date updatedAt;

	public static QuestionDTO build(Question_Given questionGiven) {
		final QuestionDTO obj = new QuestionDTO();
		obj.setSiteId(questionGiven.getSite().getSiteId());
		obj.setQuestionId(questionGiven.getQuestionId());
		obj.setQuestion(questionGiven.getQuestion());
		obj.setUpdatedAt(questionGiven.getUpdatedAt());
		obj.setCreatedAt(questionGiven.getCreatedAt());

		return obj;
	}

	public static List<QuestionDTO> build(List<Question_Given> questionGivens) {
		final List<QuestionDTO> ret = new ArrayList<>();

		for (Question_Given questionGiven : questionGivens) {
			ret.add(build(questionGiven));
		}

		return ret;
	}

	public static Question_Given createQuestion(final QuestionDTO incomingQuestion, final Site site) {
		final Question_Given newQ = new Question_Given();
		newQ.setSite(site);
		newQ.setQuestion(incomingQuestion.getQuestion());

		return newQ;
	}

	public Long getSiteId() {
		return siteId;
	}

	public void setSiteId(final Long siteId) {
		this.siteId = siteId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(final String question) {
		this.question = question;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(final Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(final Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(final Long questionId) {
		this.questionId = questionId;
	}
}
