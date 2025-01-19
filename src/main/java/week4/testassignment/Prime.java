package week4.testassignment;

public class Prime {

	public static void main(String[] args) {
		int a=1;
		int b=10;
		int temp=0;
		for(int i=a;i<=b;i++) {
			for(int j=2;j<i;j++) {
			if(i%j==0) {
				temp=0;
				break;
			}
			else {
				temp=1;
			}
		}
		if(temp==1) {
			System.out.println(i);
		}
//		else {
//			System.out.println("Not Prime");
//		}
	}
	}
}
