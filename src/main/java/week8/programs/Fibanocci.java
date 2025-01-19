package week8.programs;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int first=sc.nextInt();
		int second=sc.nextInt();
		System.out.println(first+" "+second);
		int result=0;
		for(int i=0;i<n;i++) {
			result=first+second;
			System.out.println(result);
			first=second;
			second=result;
		}
	}

}
