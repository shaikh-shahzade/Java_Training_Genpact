package com.org.gen.mapping.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Questionmtom {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int quesionId;
	
	private String question;
	
	@ManyToMany(targetEntity = Answersmtom.class, cascade = { CascadeType.ALL })  
	private List<Answersmtom> answer;

	public Questionmtom() {
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

	public List<Answersmtom> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answersmtom> answer) {
		this.answer = answer;
	}
	
	
	
	
}
