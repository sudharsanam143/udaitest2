package week8.programs;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
//		char ch[]=str.toCharArray();
//		for(int i=ch.length-1;i>=0;i--) {
//			System.out.print(ch[i]);
		String rev="";
		for(int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
		}
//		System.out.println(rev);
		if(rev.equals(str)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
