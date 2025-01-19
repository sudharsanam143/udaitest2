package week6.day1;

public class AxisBank extends BankInfo{
	public  void deposit() {
		System.out.println("Deposited");
	}

	public static void main(String[] args) {
		AxisBank obj1=new AxisBank();
		obj1.savings();
		obj1.fixed();
		obj1.deposit();
	}
}
