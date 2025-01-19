package week6.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "Paypal India";
		char[] ch = str.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ' && charSet.add(ch[i]));
		}
		System.out.println(charSet);
	}

}
