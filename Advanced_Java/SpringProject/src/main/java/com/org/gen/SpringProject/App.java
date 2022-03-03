package com.org.gen.SpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
    	Student s1 = (Student) context.getBean("Student1");
    	
    	s1.displayInfo();
    	
Student s2 = (Student) context.getBean("Student2");
    	
    	s2.displayInfo();
    	
    }
}
