package week8.programs;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int a=sc.nextInt();
		int fact=1;
		for(int i=a;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
