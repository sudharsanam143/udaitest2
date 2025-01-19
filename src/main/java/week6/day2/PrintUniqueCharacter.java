package week6.day2;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String name = "babu";
		char[] arr = name.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = '0';
					count++;
				}

			}
			if (count > 1) {
				arr[i] = '0';
			}

		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != '0') {
				System.out.println(arr[i]);
			}
		}
	}

}
