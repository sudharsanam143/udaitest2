package week2.day2;

public class VariablesExample {
	
	String name = "Sudharsanam AKS";
	public void dailyHabit() {
		name="AKS";
		System.out.println(name);
		
	}
	public int dailyprocess() {
	 int a=10;
		 //name="sabari";
	// a=4;
		//System.out.println(a);
		return a;
	}
	
	
	
	
	public static void main(String[] args) {
		
		VariablesExample obj =new VariablesExample();
		obj.dailyHabit();
		int dailyprocess = obj.dailyprocess();
		//dailyprocess=99;
		System.out.println(dailyprocess);
	
		
	}

}
