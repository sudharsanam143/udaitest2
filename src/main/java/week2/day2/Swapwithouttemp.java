package week2.day2;

public class Swapwithouttemp {

	public static void main(String[] args) {
		int a=10;
		int b=21;
		System.out.println("Before swapping a is:"+a);
		System.out.println("Before swapping b is:"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping a is:"+a);
		System.out.println("After swapping b is:"+b);
	}

}
//Before swapping a is:10
//Before swapping b is:21
//After swapping a is:21
//After swapping b is:10