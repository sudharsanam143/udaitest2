package week3.day1;

import java.util.Arrays;

public class Missingnumber {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6,7,8};
		Arrays.sort(arr);
		for(int i=0;i<=6;i++) {
			if(i+1!=arr[i]) {
				System.out.println(i+1);
				break;
			}
		}

	}

}

//console
//4