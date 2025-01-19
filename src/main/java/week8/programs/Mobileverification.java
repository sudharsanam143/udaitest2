package week8.programs;

import java.util.Scanner;

public class Mobileverification {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(str.length()==12 && str.charAt('9')&&str.charAt('1')) {
			System.out.println("valid");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
