package week8.programs;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = 1;
		for (int i = 1; i <= m; i++) {
			sum = i * n;
			System.out.println(i + "*" + n + "=" + sum);
		}
	}

}
