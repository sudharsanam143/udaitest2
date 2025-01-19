package week4.testassignment; 

public class Overriding extends Calculator {
	public void subract() {
		System.out.println(10+5);
	}
	public void multiple(int a,int b) {
		System.out.println(a*b);
		
	}

	public static void main(String[] args) {
		Overriding obj2=new Overriding();
		obj2.subract();
		obj2.multiple(143, 143);

	}

}
