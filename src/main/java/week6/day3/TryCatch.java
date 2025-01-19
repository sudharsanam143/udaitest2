package week6.day3;

public class TryCatch {
      private String name;
      
	public static void main(String[] args) {
		TryCatch obj=new TryCatch();
		obj.set("sappa");
        System.out.println(obj.get());
		}
	public void set(String newName)
	{
        this.name=newName;
	}
	public String get()
	{
		return name;
	}

}
