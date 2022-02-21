package com.org.gen.day8;

public class PriorityThread implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityThread pt1 = new PriorityThread();
		Thread th1 = new Thread(pt1 , "First Child T");
		
		PriorityThread pt2 = new PriorityThread();
		Thread th2 = new Thread(pt2 , "Second Child T");
		
		PriorityThread pt3 = new PriorityThread();
		Thread th3 = new Thread(pt3 , "Third Child T");
		
		th1.setPriority(2);
		th2.setPriority(4);
		th3.setPriority(8);
		th1.start();
		th2.start();
		th3.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Current Thread" + Thread.currentThread());
		
		Thread.yield();
		System.out.println(Thread.currentThread());
		
	}

}
