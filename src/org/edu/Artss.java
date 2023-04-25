package org.edu;

public class Artss {
	public void ug (String ug) {
		System.out.println("UG Degree is:  "+ug);
	}
	public void pg (String ug,String pg) {
		System.out.println("PG Degree  is: "+pg);
	}
	
	public static void main(String [] args) {
		Artss a = new Artss();
		a.ug("Engg");
		a.pg("Engg", "IBM");
	}
}