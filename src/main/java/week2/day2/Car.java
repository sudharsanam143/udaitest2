package week2.day2;

public class Car {
	

	public void movingFast() {
		System.out.println("Public access modifier");
	}
	private void movingSlow() {
		System.out.println("Private AKS");
	}
	protected void closingWindows() {
		System.out.println("Protected");
	}
	
	public static void main(String[] args) {
		Car obj = new Car();
		//obj.movingFast();
		//obj.movingSlow();
		obj.closingWindows();
	}

}
