package com.org.gen.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/org/gen/ci/ConfigCi.xml");
    	MyDemo myD = (MyDemo)context.getBean("Demo");
    	System.out.println(myD.toString());
	}

}
