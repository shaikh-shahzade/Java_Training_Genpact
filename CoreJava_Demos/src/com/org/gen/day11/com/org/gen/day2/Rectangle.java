package com.org.gen.day2;

public class Rectangle {

	int length;
	int breadth;

	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	void area() {
		System.out.println("Area: " + length * breadth);
	}

	void perimeter() {
		System.out.println("perimeter: " + (length + breadth) * 2);
	}
}

class Square extends Rectangle {
	Square(int s) {
		super(s, s);
	}
}