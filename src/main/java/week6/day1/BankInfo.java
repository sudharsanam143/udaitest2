package week6.day1;

public class BankInfo {
	public void savings() {
		System.out.println("The account is Savings");
	}
	public  void fixed() {
		System.out.println("The amount is Fixed");
	}
	public void deposit() {
		System.out.println("50000 is deposited");
	}

	public static void main(String[] args) {
		BankInfo obj=new BankInfo();
		obj.savings();
		obj.fixed();
		obj.deposit();
	}

}
