import java.util.Scanner;
public class TrafficLight {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
                  if(a.equals("Red"))
                  {
                	  System.out.println("Stop");
                  }
                  else if(a.equals("Yellow"))
                  {
                	  System.out.println("Get Ready");
                  }
                  else {
                	  System.out.println("Go");
                  }
	}

}
