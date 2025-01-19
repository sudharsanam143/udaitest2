package week4.testassignment;

public class Duplicate {

	public static void main(String[] args) {
		String name="Testleaf";
		char[] ch = name.toCharArray();
		int c=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='e') {
			c++;
			}
		
	}
		System.out.println(c);
			
	}
}
		
		
//		String name="Sudharsanam";
//		char[]str=name.toCharArray();
//		int c=0;
//		for(int i=0;i<str.length;i++) {
//			if(str[i]=='a') {
//				c++;
//			}
//		}
//		System.out.println(c);
//	}
//		String name="Sudharsanam";
//		char ch[]=name.toCharArray();
//		for(int i=ch.length-1;i>=0;i--) {
//			System.out.print(ch[i]);
//		}
//
//}



