package week6.day2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {

		int data[] = { 3, 2, 11, 4, 6, 7 };
		Arrays.sort(data);
		int number = data.length;
		System.out.println(data[number - 2]);

	}

}
