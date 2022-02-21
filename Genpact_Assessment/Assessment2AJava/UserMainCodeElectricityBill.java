package com.org.gen.Assessment2;

public class UserMainCodeElectricityBill {

	public static int calculateElectricityBill (String prev, String curr, int perU) {
	    int x = Integer.parseInt(prev.substring(5, prev.length()));
	    int y = Integer.parseInt(curr.substring(5, curr.length()));
	    
	    
	    return  Math.abs((x - y) * perU);
	    
	  }
}
