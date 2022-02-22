package com.org.gen.day4;

public class PracticeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Divide div = new Divide(35, 7);
		div.setOnResult(new OnResult() {

			@Override
			public void onSuccess(double a) {
				// TODO Auto-generated method stub
				System.out.print("Divided Result:" + a);
			}

			@Override
			public void onError(Exception e) {
				// TODO Auto-generated method stub
				System.out.print(e);
			}

		});
		div.onDiv();
	}

}

interface OnResult {

	void onSuccess(double a);

	void onError(Exception e);
}

class Divide {

	OnResult onRes;
	double a, b;

	public Divide(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	void onDiv() {
		if (b == 0) {
			onRes.onError(new Exception("Divide by 0"));
			return;
		}
		onRes.onSuccess(a / b);

	}

	void setOnResult(OnResult onRes) {
		this.onRes = onRes;
	}

}