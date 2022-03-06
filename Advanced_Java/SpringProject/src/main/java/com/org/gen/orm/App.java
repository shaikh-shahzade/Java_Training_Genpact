package com.org.gen.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.gen.orm.dao.StudentDao;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("com/org/gen/orm/ConfigCi.xml");
		
	      
	    StudentDao dao=(StudentDao)context.getBean("studentDao");  
	    int status=dao.insert(new Student(102,"Shayam"));  
	    System.out.println(status);  
		
	}

}
