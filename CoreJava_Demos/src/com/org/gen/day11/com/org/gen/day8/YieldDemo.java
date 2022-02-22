package com.org.gen.day8;

public class YieldDemo implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YieldDemo yd = new YieldDemo();
		Thread th1 = new Thread(yd , "First Child T");
		
		YieldDemo yd2 = new YieldDemo();
		Thread th2 = new Thread(yd2 , "Second Child T");
		
		th1.setPriority(4);
		th2.setPriority(8);
		th1.start();
		th2.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Current Thread" + Thread.currentThread());
		//Thread.yield();
		System.out.println(Thread.currentThread());
		
	}

}
