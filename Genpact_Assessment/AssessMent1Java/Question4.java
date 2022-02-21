package com.org.gen.day6.test;


public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Holiday holiday1 = new Holiday("Shimla" , 12 , "January");
		
		System.out.println("Holiday 1\nname:"+holiday1.getName());
		
		
		System.out.println("date: "+holiday1.getDate()+" "+holiday1.getMonth());
	}

}


class Holiday
{
	 private String name;
	 private int date;
	 private String month;
	public Holiday(String name, int date, String month) {
		super();
		this.name = name;
		this.date = date;
		this.month = month;
	}
	 String getName() {
		return name;
	}
	 int getDate() {
		return date;
	}
	 String getMonth() {
		return month;
	}
	 
	 
}