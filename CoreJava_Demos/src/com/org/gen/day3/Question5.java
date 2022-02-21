package com.org.gen.day3;

public class Question5 implements In1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Question5 q = new Question5();
		q.display(100);

	}

	@Override
	public void display(int p) {
		// TODO Auto-generated method stub

		int total = 0;

		for (int j = 2; j <= p; j++) {
			boolean isPrime = true;

			for (int i = 2; i <= j / 2; i++) {
				if (j % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime)
				total++;
		}

		System.out.print(total);
	}

}
