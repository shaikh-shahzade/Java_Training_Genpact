package com.org.gen.ds;

public class NeighbourHome implements Urban{
	private Organizer org; 
	
	public String cleaning() {
		// TODO Auto-generated method stub
		return "Cleaning";
	}

	public String decoration() {
		// TODO Auto-generated method stub
		return org.service1();
		
	}

	public Organizer getOrg() {
		return org;
	}

	public void setOrg(Organizer org) {
		this.org = org;
	}


	
	
}
