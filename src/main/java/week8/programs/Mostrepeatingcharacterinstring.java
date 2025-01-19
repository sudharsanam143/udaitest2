package week8.programs;

import java.util.Scanner;

public class Mostrepeatingcharacterinstring {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
//		char ch=sc.next().charAt(0);
//		char a[]=str.toCharArray();
//		int c=0;
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==ch) {
//				c++;
//			}
//		}
//		System.out.println(c);
		String str= "sudharsanam";
		int c=0;
		char a[]=str.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(a[i]=='s') {
				c++;
			}
		}
		System.out.println(c);
	}

}
