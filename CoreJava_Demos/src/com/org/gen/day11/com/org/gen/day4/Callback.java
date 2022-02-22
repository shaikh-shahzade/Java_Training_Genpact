package com.org.gen.day4;

public class Callback {
	TaxPrint tp;

	public Callback(TaxPrint tp) {
		super();
		this.tp = tp;
	}

	public void sampleFunc2(String txt) {
		// TODO Auto-generated method stub
		tp.sampleFunc(txt);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassA ac = new ClassA();
		Callback objC = new Callback(ac);
		objC.sampleFunc2("Hello");

	}

}

interface TaxPrint {
	void sampleFunc(String txt);
}

class ClassA implements TaxPrint {

	@Override
	public void sampleFunc(String txt) {
		// TODO Auto-generated method stub
		System.out.println(txt);
	}

}