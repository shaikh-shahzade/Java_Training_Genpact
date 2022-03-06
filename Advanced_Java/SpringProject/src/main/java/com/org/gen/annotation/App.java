package com.org.gen.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/org/gen/annotation/ConfigCi.xml");
    	MyDemo myD = (MyDemo)context.getBean("myDemo");
    	System.out.println(myD.toString());
    	
    	ApplicationContext context2 = new AnnotationConfigApplicationContext(JavaConfig.class);
    	Student st = (Student) context2.getBean("student");
    	System.out.println(st.toString());
    	
	}

}
