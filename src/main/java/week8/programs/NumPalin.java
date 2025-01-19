package week8.programs;

import java.util.Scanner;

public class NumPalin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		int sum=0;
//		int temp=n;
//		//temp=temp%10;
//		while(temp>0) {
//			int rev=temp%10;
//			sum=(sum*10)+rev;
//			temp=temp/10;
//		}
//		if(sum==n) {
//			System.out.println("palin");
//		}
//		else {
//			System.out.println("not palin");
		
		String str=String.valueOf(n);
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		}
	}


