package com.org.gen.day6.test;

public class Question5 {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		
		AirlineLuggage lg = new AirlineLuggage();
		lg.luggageWeight = 18;
		
		lg.checkIn();
	}

}

class AirlineLuggage
{
	
	double luggageWeight;
	
	
	boolean checkIn() throws MyException
	{
		if(luggageWeight>15)
			{
			throw new MyException("Weight Cannot Exceed more than 15kg ! ");
			
			}
		
		return true;
	}
}

class MyException extends Exception
{

	public MyException(String string) {
		// TODO Auto-generated constructor stub
		System.out.println(string);
	}
	
	
}