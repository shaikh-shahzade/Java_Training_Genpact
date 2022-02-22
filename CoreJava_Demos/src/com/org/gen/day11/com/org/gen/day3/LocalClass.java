package com.org.gen.day3;

public class LocalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyExternalClass myClass = new MyExternalClass();
		myClass.getData();

	}

}

class MyExternalClass {
	int sum = 100;

	void getData() {
		class LocalInternalClass {
			public int a;
			public int b;

			private int getResult() {
				return a;
			}

			LocalInternalClass() {
				a = 100;
			}
		}

		LocalInternalClass lc = new LocalInternalClass();
		System.out.println(lc.getResult());
	}

}