package com.org.gen.day4;

public class Product implements Cloneable {

	private String name;
	private String ptype;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Product pro = (Product) super.clone();
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Product name : " + super.toString();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Product p1 = new Product();
		p1.setName("Laptops");
		p1.setPtype("Electronics");
		System.out.println(p1.getName() + "" + p1.getPtype());

		Product p2 = (Product) p1.clone();
		System.out.println(p2.getName() + "" + p2.getPtype());

	}

}
