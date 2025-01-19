package week6.day1;

public class Reverseevenindex {

	public static void main(String[] args) {
		String test = "I am a software tester";
//		String arr[] = test.split(" ");
//		for (int i = 0; i < arr.length; i++) {
//			String var = "";
//			if (i % 2 != 0) {
//				for (int j = arr[i].length() - 1; j >= 0; j--) {
//					var = var + arr[i].charAt(j);
//				}
//				arr[i] = var;
//
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//		}
		String arr[]=test.split(" ");
		for(int i=0;i<arr.length;i++) {
			String var="";
			if(i%2!=0) {
				for(int j=arr[i].length()-1;j>=0;j--) {
					var=var+arr[i].charAt(j);
				}
				arr[i]=var;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

}
