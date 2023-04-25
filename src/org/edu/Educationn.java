package org.edu;

public class Educationn extends Artss{
	public void bSc (String bsc) {
		System.out.println("BSc stands for:  "+bsc);
	}
	public void bEd (String bsc,String bed) {
		System.out.println("BEd stands  for: "+bed);
	}
	public void bA (String bsc,String bed,String ba) {
		System.out.println("BA stands  for: "+ba);
	}
	public void bBA (String bsc,String bed,String ba,String bba) {
		System.out.println("BBA stands  for: "+bba);
	}
	public void ug (String ug) {
		System.out.println("UG stands for:  "+ug);
	}
	public void pg (String ug,String pg) {
		System.out.println("PG stands  for: "+pg);
}
	public static void main(String [] args) {
		Educationn e = new Educationn();
		e.bSc("Bachelor of science");
		e.bEd("Bachelor of science", "Bachelor of Education");
		e.bA("Bachelor of science", "Bachelor of Education", "Bachelor of arts");
		e.bBA("Bachelor of science", "Bachelor of education", "Bachelor of arts", "Bachelor of Business administration");
		e.ug("Under graduate");
		e.pg("Under graduate", "post graduate");
		
	}
}
