package com.org.gen.autowiring;

public class Student2 {

	private String name; 
	private int rollno;
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
	public Student2(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
