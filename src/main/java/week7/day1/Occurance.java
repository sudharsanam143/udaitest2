package week7.day1;

public class Occurance {

	public static void main(String[] args) {
		String str="Testleaf";
		char [] ch=str.toCharArray();
		int c=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='e') {
				c++;
			}
		}
		System.out.println(c);
	}

}
