package sample;

public class Return {

	public String cashWithDrawal() {

		// int amount = 12000;
		String name = "vinoth";
		System.out.println(name);

		return name;
	}

	public void deposit() {

		int cash = 500;

		System.out.println(cash);
	}

	public static void main(String[] args) {
		Return obj = new Return();

		String abc = obj.cashWithDrawal();

		abc = "Sanjay";
		System.out.println(abc);

		abc = "Vetri";
		System.out.println(abc);

		abc = "tutyui";
		System.out.println(abc);

		// String cashWithDrawal = obj.cashWithDrawal();

		// System.out.println(var);

		obj.deposit();

	}
}
