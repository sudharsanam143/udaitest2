package week6.day2;

public class Palindrome {

	public static void main(String[] args) {

		String name = "madam";
		String rev = "";
		for (int i = 0; i < name.length(); i++) {
			rev = name.charAt(i) + rev;
		}
//		if (rev.equals(name)) {
//			System.out.println("palindrome");
//		} else {
//			System.out.println("Not Palindrome");
//		}
		System.out.println(rev);
	}

}
