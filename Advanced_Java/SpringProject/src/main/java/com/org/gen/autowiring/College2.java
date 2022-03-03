package com.org.gen.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class College2 {
	@Autowired
	private Student2 student2;

	public Student2 getStudent() {
		return student2;
	}

	public void setStudent(Student2 student2) {
		this.student2 = student2;
	}

	public College2(Student2 student2) {
		super();
		this.student2 = student2;
	}

	public College2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
