package com.org.gen.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("com/org/gen/springjdbc/ConfigCi.xml");
		
	      
	    EmployeeDao dao=(EmployeeDao)context.getBean("edao");  
	    int status=dao.saveEmployee(new Employee(102,"Amit",35000));  
	    System.out.println(status);  
	}

}
