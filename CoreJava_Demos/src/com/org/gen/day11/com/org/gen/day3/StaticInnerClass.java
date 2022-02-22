package com.org.gen.day3;

class MotherBoard {
	static class USB {
		int usb1 = 1;

		int getports() {
			return usb1;
		}
	}

}

public class StaticInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotherBoard.USB usb = new MotherBoard.USB();
		System.out.println("Ports:" + usb.getports());
	}

}
