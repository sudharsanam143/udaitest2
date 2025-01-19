package revise;

import java.util.Scanner;

public class PalindromeInt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=String.valueOf(n);
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		if(rev.equals(str)) {
			System.out.println("palin");
		}
		else {
			System.out.println("not Palin");
		}
		
//		int rev=0;
//		int temp=n;
//		while(temp>0) {
//			int rem=temp%10;//5  4  5  4
//			rev=(rev*10)+rem;//rev=5    54 545  54545
//			temp=temp/10;
//		}
//		if(rev==n) {
//			System.out.println("palin");
//		}
//		else {
//			System.out.println("Not palin");
//		}
//	}
	}

}
