package week8.programs;

import java.util.Scanner;

public class Neonnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n*n;
		int sum=0;
		while(temp>0) {
			int rem=temp%10;
			sum+=rem;
			temp=temp/10;
		}
		if(sum==n) {
			System.out.println("neon");
		}
		else {
			System.out.println("not neon");
		}
	}

}
