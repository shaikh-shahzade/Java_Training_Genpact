package com.org.gen.day4;

@FunctionalInterface
interface GenericInterface<T> {
	T func(T t);
}

interface Myinterface {
	public int max(int a, int b);
}

public class LambdaPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myinterface mi = (a, b) -> {
			return Math.max(a, b);
		};

		System.out.println(mi.max(53, 6));

		GenericInterface<Integer> calc = (n) -> {
			System.out.print(n * 5);
			return n * 5;

		};
		calc.func(67);

	}

}
