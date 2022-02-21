package com.org.gen.day6.test;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Box box = new Box();
		box.setBox(4, 3, 2);
		System.out.println("Volume: "+box.getVolume());
	}

}


class Rectangle
{
	
	double length;
	double breadth;
	void setRectangle(double l , double b)
	{
		this.length = l;
		this.breadth = b;
	}
	double getArea()
	{
		return (length * breadth ) ;
	}
	
}

class Box extends Rectangle
{
	double height;
	void setBox(double l , double b, double h)
	{
		this.setRectangle(l, b);
		this.height = h;
	}
	double getVolume()
	{
		return (length * breadth * height) ;
	}
}
