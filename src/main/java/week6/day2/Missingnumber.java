package week6.day2;

import java.util.Arrays;

public class Missingnumber {

	public static void main(String[] args) {
		
		int[] data = {1,3,2,4,7,5};
		Arrays.sort(data);
		// 1 2 3 4 5 7
		for(int i=0;i<data.length;i++) {
			if(i+1!=data[i]) {
				System.out.println(i+1);
				break;
			}
		}
		
	}

}
