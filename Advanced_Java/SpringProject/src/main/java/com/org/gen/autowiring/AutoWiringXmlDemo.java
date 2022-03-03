package com.org.gen.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringXmlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/org/gen/autowiring/ConfigOverWriting.xml");
		
		Student st = (Student)context.getBean("student");
		College cg = (College)context.getBean("College");
		
		System.out.println(cg.getStudent().toString());
		
		
	}

}
