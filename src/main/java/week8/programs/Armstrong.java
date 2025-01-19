package week8.programs;

public class Armstrong {

	public static void main(String[] args) {
		int num = 1635;
		int digit=findDigit(num);
		int count=0;
		int temp=num;
		int sum=0;
		
		while(temp>0) {
			sum+=pow(temp%10, digit);
			temp/=10;	
		}
		if(sum==num) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not");
		}
		
	}
	public static int findDigit(int n) {
		int count=0;
		while(n>0) {
			int rem=n%10;
			count++;
			n/=10;
		}
		return count;
	}
	
	public static int pow(int base, int power) {
		int mul=1;
		for(int i=0;i<power;i++) {
			mul*=base;
		}
		return mul;
	}

}
