package org.edu;

public class Education extends Arts {
	
	public void ug() {
		System.out.println("Under Graduate");
	}
	
	public void pg() {
		System.out.println("Post Graduate");
	}
	
	public static void main(String [] args) {
		Education e = new Education();
		e.ug();
		e.pg();
		e.bsc();
		e.bEd();
		e.bA();
		e.bBA();
		e.bE();
		e.bTech();
		e.physiyo();
		e.dental();
		e.mbbs();
	}

}
