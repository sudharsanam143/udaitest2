package week8.programs;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 boolean f=false;
		 for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					f=true;
					break;
			 }
		 }
		 if(f) {
			 System.out.println("not prime");
		 }
		 else {
			 System.out.println("prime");
		 }
	}

}
