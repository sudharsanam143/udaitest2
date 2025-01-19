package week2.day2;

public class Fibanocci {

	public static void main(String[] args) {
//		int first=0;
//		int second=1;
//		int n=5 ;
//		System.out.print(first+" "+second+" ");
//		for(int i=0;i<n;i++) {
//			int res=first+second;
//			System.out.print(res+" ");
//			first=second;
//			second=res;
//		}
		int f=0;
		int s=1;
		int n=5;
		System.out.println(f+" "+s);
		for(int i=0;i<n;i++) {
			int r=f+s;
			System.out.println(r);
			f=s;
		s=r;
		}
		

	}

	
}
