package com.org.gen.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/org/gen/autowiring/ConfigOverWriting.xml");
		
		Student2 st = (Student2)context.getBean("student2");
		College2 cg = (College2)context.getBean("College2");
		
		System.out.println(cg.getStudent().toString());
		
	}

}
