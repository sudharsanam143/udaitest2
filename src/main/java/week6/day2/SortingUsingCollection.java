package week6.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		List<String> variable = new ArrayList<String>();
		variable.add("HCL");
		variable.add("Wipro");
		variable.add("Aspire Systems");
		variable.add("CTS");
		Collections.sort(variable);
		System.out.println(variable.reversed());
	}

}
