package com.org.gen.mapping.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int quesionId;
	
	private String question;
	
	@OneToOne
	private Answers answer;

	public Question() {
		super();
		
	}

	public int getQuesionId() {
		return quesionId;
	}

	public void setQuesionId(int quesionId) {
		this.quesionId = quesionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answers getAnswer() {
		return answer;
	}

	public void setAnswer(Answers answer) {
		this.answer = answer;
	}
	
	
	
	
}
