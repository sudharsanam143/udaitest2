package week8.programs;

import java.util.Scanner;
import java.util.*;

public class Removedulplicateintegers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n[]=new int[8];

		for(int i=0;i<n.length;i++) {
			n[i]=sc.nextInt();
		}
		Set<Integer> obj=new HashSet<>();
		for(int i=0;i<n.length;i++) 
			obj.add(n[i]);	
		System.out.println(obj);
		
		}
	}


