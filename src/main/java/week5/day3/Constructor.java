package week5.day3;

public class Constructor {
	  public Constructor() {
		  System.out.println(2*3);
	  }
	  
	  public Constructor(String name,int id) {
		  System.out.println("It is parameterized"+" "+name+" "+id);
	  }

	public static void main(String[] args) {
		Constructor ob=new Constructor();
		Constructor obj=new Constructor("Sudharsanam",143);

	}

}
