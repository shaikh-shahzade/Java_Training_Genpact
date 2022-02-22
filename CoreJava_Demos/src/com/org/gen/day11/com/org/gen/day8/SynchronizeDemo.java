package com.org.gen.day8;

class Customer {
	int d_amount = 10000;

	synchronized void withdraw(int d_amount)  {
		System.out.println("Going to withdraw");
		if (this.d_amount < d_amount)
			{
			System.out.println("Balance is not available");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		System.out.println("withdraw Completed");
		
	}

	synchronized void deposit(int d_amount) {
		System.out.println("Going to Deposit");
		this.d_amount += d_amount;
		System.out.println("Deposit Complete");
		notify();
	}
}

public class SynchronizeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c1 = new Customer();
		new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				c1.withdraw(20000);
			}

		}.start();

		new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				c1.deposit(10000);
			}

		}.start();

	}

}
