package com.org.gen.ds;

public class MyHome implements Organizer {

	private NeighbourHome neighbour;
	
	public String service1() {
		// TODO Auto-generated method stub
		return "Service1";
	}

	public NeighbourHome getNeighbour() {
		return neighbour;
	}

	public void setNeighbour(NeighbourHome neighbour) {
		this.neighbour = neighbour;
	}

}
