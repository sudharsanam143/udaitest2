package week5.day3;

public class ThisKeyword {
	
	String name="Sudharsanam";
	int id=143;
	long ph=9361347051l;
	float salary=3333.00f;
	
	
	public void details(String name,int id,long ph,float salary) {
		
		this.name=name;
		this.id=id;
		this.ph=ph;
		this.salary=salary;
		System.out.println(name+"\n"+id+"\n"+ph+"\n"+salary);

	}
	
//	public void data() {
//		name="sabari";
//		System.out.println(name);
//	}

	public static void main(String[] args) {
		ThisKeyword obj=new ThisKeyword();
		//  obj.data();
		obj.details("keerthi", 333,8838881539l , 6666.00f);
	}

}
