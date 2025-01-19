package org.department;

import org.college.College;

public class Department extends College {
	
	public void deptname() {
		System.out.println("Computer Science and Engineering");
	}

	public static void main(String[] args) {
		Department de=new Department();
		de.collegename();
		de.collegecode();
		de.collegeRank();
		de.deptname();
	}

}
