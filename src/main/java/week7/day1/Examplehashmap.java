package week7.day1;

import java.util.*;
import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

public class Examplehashmap {

	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();
		Map<String,Boolean> removeDuplicate=new HashMap<String,Boolean>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<6;i++) {
			removeDuplicate.put(sc.next(), true);
		}
		
		removeDuplicate.putIfAbsent("suriya", false);
		
		System.out.println(removeDuplicate);
	}
}
