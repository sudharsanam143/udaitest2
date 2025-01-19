package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentname() {
		System.out.println("Sudharsanam");
	}
	public void studentid() {
		System.out.println("2013108");
	}
	
	public  void studentdept() {
		System.out.println("Computer Science and Engineering");
	}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.collegename();
		obj.collegecode();
		obj.collegeRank();
		obj.deptname();
		obj.studentdept();
		obj.studentid();
		obj.studentname();
	}

}
