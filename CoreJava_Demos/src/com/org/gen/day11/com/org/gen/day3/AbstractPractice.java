package com.org.gen.day3;

abstract class MyAbsClass
{
	int x=10;
	abstract void calc(int a , int b);
	
	void print()
	{
		System.out.println("Print Method");
	}
	static void statMethod()
	{
		System.out.println("Static  Method");
	}
	
	MyAbsClass()
	{
		System.out.println("Abstract Class Constructor");
	}
	
}


public class AbstractPractice extends MyAbsClass {

	void calc(int a  , int b)
	{
		System.out.println("Addition: "+(a+b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractPractice ap = new AbstractPractice();
		ap.calc(7, 3);
		ap.print();
		ap.statMethod();
		
		
	}

}
