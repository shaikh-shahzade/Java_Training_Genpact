package com.org.gen.SpringProject;

public class Student {  
private String name;  
private String email; 
private String address; 




  
public Student(String name, String email, String address) {
	super();
	this.name = name;
	this.email = email;
	this.address = address;
}





public Student() {
	super();
	// TODO Auto-generated constructor stub
}





public String getName() {
	return name;
}





public void setName(String name) {
	this.name = name;
}





public String getEmail() {
	return email;
}





public void setEmail(String email) {
	this.email = email;
}





public String getAddress() {
	return address;
}





public void setAddress(String address) {
	this.address = address;
}





public void displayInfo(){  
    System.out.println("Name: "+name + " Email: " +email + " Address: "+address);  
}  
}  