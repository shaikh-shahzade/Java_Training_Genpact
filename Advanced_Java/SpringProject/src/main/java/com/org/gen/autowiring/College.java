package com.org.gen.autowiring;

public class College {

	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public College(Student student) {
		super();
		this.student = student;
	}

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
