package week7.day1;

import java.util.*;

public class removeduplicatenumber {

	public static void main(String[] args) {

		//int array[] = { 1, 3, 3, 3, 3, 5, 6, 6, 7, 7, 7 };
		String array[]= {"sudhar","sabari","sudhar","suriya","suriya","sudhar","sabari","prasanth","prasanth"};

//		int count = 0;
//		for (int j = 0; j < array.length; j++) {
//			for (int k = j + 1; k < array.length; k++) {
//				if (array[j] == array[k]) {
//					count++;
//				}
//			}
//			if (count == 1)
//				System.out.println(array[j]);
//			count = 0;
//		}
		Set<String> no=new HashSet<String>();
		for(int i=0;i<array.length;i++)
		no.add(array[i]);
		System.out.println(no);
		
	}

}
