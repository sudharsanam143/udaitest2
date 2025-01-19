package week8.programs;

public class Palindrome {

	public static void main(String[] args) {
		int a=121;
		int rev=0;
		int temp=a;
		while(temp>0) {
			int rem=temp%10;
			rev = (rev*10)+rem; 
			temp/=10;	
		}
		if(rev==a) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}
