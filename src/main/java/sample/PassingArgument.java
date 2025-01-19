package sample;

public class PassingArgument {
	
	public void drinking(char ch, char ch1, char ch2) {
		System.out.println(ch+""+ch1+""+ch2);
	}
	public void walking(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		PassingArgument obj=new PassingArgument();
		obj.drinking('A','K','S');
		obj.walking(11);
	}

}
