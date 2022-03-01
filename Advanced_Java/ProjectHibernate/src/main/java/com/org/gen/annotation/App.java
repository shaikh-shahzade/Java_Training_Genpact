package com.org.gen.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory(); 
        
        Bank bank = new Bank();
        bank.setName("Alan");
        bank.setAccount_number(1009);
        bank.setAvailable_balance(78000);
        bank.setPhone_number("9877689676");
        
        System.out.println(bank.toString());
        
        Session session = factory.openSession(); 
        session.beginTransaction();
        session.save(bank);
        
        //session.delete(bank);
        

        session.getTransaction().commit();
        
        
        factory.close();
    }
}
