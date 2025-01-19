package week3.day1;

public class Stringpalindrome {

	public static void main(String[] args) {
		String str="madam";
 	 String rev="";
 	 for(int i=0;i<str.length();i++) {
 		 rev=str.charAt(i)+rev;
 	 }
// 	 if(rev.equalsIgnoreCase(str)){
// 		 System.out.println("Palindrome");
// 	 }
// 	 else {
// 		 System.out.println("Not Palindrome");
// 	 }
		System.out.println(rev) ;
	}

}
