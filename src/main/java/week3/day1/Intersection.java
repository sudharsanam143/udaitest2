package week3.day1;

public class Intersection {

	public static void main(String[] args) {
		int a[] = { 3, 2, 11, 4, 6, 7 };
		int arr[] = { 1, 2, 8, 4, 9, 7 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (a[i] == arr[j]) {
					System.out.println(a[i]);
				}
			} 
		}

	}

}
