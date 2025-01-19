package week8.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Duliplicatesinstring {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String str[]=new String[10];
//		for(int i=0;i<str.length;i++) {
//			str[i]=sc.nextLine();
//		}
		
//		String str[]= {"sudhar","sabari","harish","sudahr","prasanth","sudhar","sabari","harish"};
//		Set<String> obj=new HashSet<String>();
//		for(int i=0;i<str.length;i++) {
//			obj.add(str[i]);
//		}
//		System.out.println(obj);
		
		int str[]= {999,888,777,666,999,888,555,666,77};
		Set<Integer>obj=new HashSet<Integer>();
		for(int i=0;i<str.length;i++) {
			obj.add(str[i]);
		}
		
		System.out.println(obj);
	}

}
