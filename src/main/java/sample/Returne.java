package sample;

public class Returne  {
	public int walk(){
		int a=9;
		System.out.println(a);
		return a;
	}
	public void sleep() {
		String s="bye";
		System.out.println(s);
	}

	public static void main(String[] args) {
		Returne d=new Returne();
		//System.out.println(a);
		d.sleep();
		d.walk();
	}

}
