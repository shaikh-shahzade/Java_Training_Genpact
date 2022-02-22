package com.org.gen.day8;

public class ThreadDemo extends Thread {

	String task;
	
	public ThreadDemo(String task) {
		super();
		this.task = task;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=5;i++)
			System.out.println(task+" " +i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo  th1 = new ThreadDemo("cut the ticket");
		
		ThreadDemo th2 = new ThreadDemo("show your ticket");
		
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th2);
		t1.start();
		t2.start();
	}

}
