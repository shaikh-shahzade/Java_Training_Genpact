package com.org.gen.day5;

@FunctionalInterface
interface I {
	void getName(String name);
}

public class MethodRef implements I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		I i = (name) -> System.out.println(name);
		i.getName("John");

		I refI = MethodRef::getInfo;
		refI.getName("abcde");
	}

	static void getInfo(String s) {
		System.out.println("Ref " + s);
	}

	@Override
	public void getName(String name) {
		// TODO Auto-generated method stub
		System.out.println("OLD");
	}

}
