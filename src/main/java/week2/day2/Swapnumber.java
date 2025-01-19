package week2.day2;

public class Swapnumber {

	public static void main(String[] args) {
		int a=18;
		int b=23;
		int temp;
		System.out.println("Before swapping a is:"+a);
		System.out.println("Before swapping b is:"+b);
//		a=a+b;
//		b=a-b;
//		a=a-b;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping a is:"+a);
		System.out.println("After swapping b is:"+b);
	}

}


//Before swapping a is:18
//Before swapping b is:23
//After swapping a is:23
//After swapping b is:18