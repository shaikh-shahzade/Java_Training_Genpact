package com.org.gen.handson;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dep_Id;
	
	private String dep_name;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getDep_Id() {
		return dep_Id;
	}

	public void setDep_Id(int dep_Id) {
		this.dep_Id = dep_Id;
	}

	public String getDep_name() {
		return dep_name;
	}

	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	
	
	
	
}
