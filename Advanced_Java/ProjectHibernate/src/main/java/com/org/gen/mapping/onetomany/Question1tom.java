package com.org.gen.mapping.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question1tom {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int quesionId;
	
	private String question;
	
	@OneToMany
	@JoinColumn(name="qid")  
	private List<Answers1tom> answer;

	public Question1tom() {
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

	public List<Answers1tom> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answers1tom> answer) {
		this.answer = answer;
	}
	
	
	
	
}
