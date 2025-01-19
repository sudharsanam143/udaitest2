package week4.testassignment;

public class Calculator {
	public void subract() {
		System.out.println(10+5);
	}
	public void subract(int a,String str) {
		System.out.println(a+" "+str);
	}
	public void multiple(int a,int b) {
		System.out.println(a*b);
		
	}
	public void multiple(String name,float s,int a) {
		System.out.println(name+s*a);
	}
	
 
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		obj.subract();
		obj.subract(143, "Alan");
		obj.multiple(3, 2);
		obj.multiple("Sudhar", 1.33f,3);
	}


}
