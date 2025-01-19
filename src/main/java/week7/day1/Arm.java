package week7.day1;

import java.util.Scanner;

public class Arm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while(temp>0) {
			int rem=temp%10;
		    sum+=Math.pow(rem,3);
		    temp/=10;
		}
		if(sum==n) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
