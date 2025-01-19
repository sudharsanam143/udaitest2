package week7.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class mobilenumber {

	public static void main(String[] args) {
		String s="917339591003";
		if(s.length()==12 && s.charAt(0)=='9' && s.charAt(1)=='1') {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		//System.out.println((s.length()==12 && s.indexOf("91")==0)?"True":"False");
	}

}
