package week3.day1;

import java.util.Arrays;

public class Missing {

	public static void main(String[] args) {
		int a[]= {52,54,56,60,62,64};
		//int arr[]=51;
		int arr=52;
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			if(a[i]==arr) {
				arr=arr+2;
			}
			else {
			System.out.println(arr);
			break;
			}
		}
	}

}
