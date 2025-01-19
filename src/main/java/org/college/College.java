package org.college;

public class College {
	
	public void collegename() {
		System.out.println("KSR College of Engineering");
	}
	
	public void collegecode() {
		System.out.println("143");
	}
	public  void collegeRank() {
		System.out.println("Lastplace in Tamilnadu");
	}

	public static void main(String[] args) {
		College co=new College();
		co.collegename();
		co.collegeRank();
		co.collegecode();
	}

}
