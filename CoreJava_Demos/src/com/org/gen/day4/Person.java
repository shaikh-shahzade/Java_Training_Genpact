package com.org.gen.day4;

public class Person implements Cloneable {

	String name;
	int id;

	Person() {

	}

	Person(String name, int id) {
		this.id = id;
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Person p = new Person("shah", 1);
		Person p2 = (Person) p.clone();

		System.out.println("name: " + p.name + " id:" + p.id);
		System.out.println("name: " + p2.name + " id:" + p2.id);

		System.out.println("p hash: " + p.hashCode());
		System.out.println("p2 hash: " + p2.hashCode());
	}

}
