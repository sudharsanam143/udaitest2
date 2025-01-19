package week4.testassignment;

public class Reverse {

	public static void main(String[] args) {
		
		String name ="sudharsanam";
		char[] charArray = name.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
	}
}
  