package week7.day1;

public class Sabari {

	public static void main(String[] args) {
		String str[] = { "sabari", "sudhar", "raja", "sudhar", "prasanth", "sabari", "sabari" };

		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i] .equals(str[j]) ) {
					str[j] = "";
				}
			}
		}
		for (int i = 0; i < str.length; i++) {
			if (str[i] != "") {
				System.out.println(str[i]);
			}
		}

	}

}
