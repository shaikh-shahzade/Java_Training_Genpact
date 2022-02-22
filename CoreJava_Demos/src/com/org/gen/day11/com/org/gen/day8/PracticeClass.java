package com.org.gen.day8;

public class PracticeClass implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PracticeClass p1 = new PracticeClass();
		Thread th1 = new Thread(p1 , "First Child T");
		
		PracticeClass p2 = new PracticeClass();
		Thread th2 = new Thread(p2 , "Second Child T");
		
		PracticeClass p3 = new PracticeClass();
		Thread th3 = new Thread(p3 , "Third Child T");
		
		th1.start();
		th2.start();
		for(int i=1 ; i<6;i++)
		{
			th1.yield();
			System.out.println("Current Thread" + Thread.currentThread());
			
		}
			
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1 ; i<6;i++)
		System.out.println("Current Thread" + Thread.currentThread());
		
	}

}
