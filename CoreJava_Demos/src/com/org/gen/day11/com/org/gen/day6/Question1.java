package com.org.gen.day6;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] sArr = { "ACD22XD", "ACD19PQR", "ACD22TT", "ACD17XYZ", "ACD21AYU" };

		System.out.println("Batch in 2022: ");
		int count = 0;
		for (int i = 0; i < sArr.length; i++) {
			if (sArr[i].startsWith("22", 3)) {
				count += 1;
				System.out.println(sArr[i]);
			}
		}

		System.out.println("total count: " + count);
	}

}
