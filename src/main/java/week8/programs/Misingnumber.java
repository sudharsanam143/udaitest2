package week8.programs;

import java.util.Arrays;
import java.util.Scanner;

public class Misingnumber {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n[]= new int[6];
//		for(int i=0;i<n.length;i++) {
//			n[i]=sc.nextInt();
		int n[]= {3,4,6,2,1,};
		Arrays.sort(n);
		// 1 2 3 4 6
		for(int i=0;i<n.length;i++) {
			if(i+1!=n[i]) {//1=1
				           //1+1=2
				           //2+1=3
				           //3+1=4
				           //4+1=5
				System.out.println(i+1);
				break;
			}
		}
		
	}

}
