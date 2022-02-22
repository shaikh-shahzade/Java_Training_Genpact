package com.org.gen.day8;

public class SleepCurrentThreadDemo implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SleepCurrentThreadDemo sp = new SleepCurrentThreadDemo();
		Thread t = new Thread(sp , "Child Thread");
		t.start();
		
		System.out.println("no of active thread " + Thread.activeCount());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello Thread");
	}

}
