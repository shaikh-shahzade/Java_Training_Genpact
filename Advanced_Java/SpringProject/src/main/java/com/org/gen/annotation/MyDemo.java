package com.org.gen.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyDemo {

	@Value("Alan")
	private String name;
	@Value("12")
	private int rollno;
	
	
	public MyDemo(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	
	
	
	public MyDemo() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getRollno() {
		return rollno;
	}



	public void setRollno(int rollno) {
		this.rollno = rollno;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " +name + " Rollno: "+rollno;
	}

	
	
	
}
