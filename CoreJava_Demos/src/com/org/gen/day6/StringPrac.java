package com.org.gen.day6;

public class StringPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String emails[] = {"abc@gmail.com","xyz@genpact.com" , "trx@yahoo.com","mno@gmail.com","opq@genpact.com" , "uyt@yahoo.com"};
		for(int i= 0 ; i<emails.length; i++)
		{
			if(emails[i].contains("genpact.com"))
				System.out.println(emails[i]);
			
		}
		
	}

}
