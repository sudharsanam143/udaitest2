package week2.day2;

public class Primenumber {

	public static void main(String[] args) {

//		int n=4;
//		boolean flag = false;
//		for(int i=2;i<=n/2;i++) {
//			if(n%i==0) {
//				flag = true;;
//				break;
//			}
//		}
//		if(flag) {
//			System.out.println("Not Prime");
//		}
//		else {
//			System.out.println("Prime");
//		}
		int n=17 ;
		boolean f=false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				f=true;
				break;
			}
		}
		if(f) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}
		
	}

}
