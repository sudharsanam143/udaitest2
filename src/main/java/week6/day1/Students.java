package week6.day1;

public class Students {
	public void getStudentInfo() {
		System.out.println(140 + 3);
	}

	public void getStudentInfo(int a) {
		System.out.println(a + 1);
	}

	public void getStudentInfo(String name, double s) {
		System.out.println(name + s);
	}

	public void getStudentInfo(int a, float f) {
		System.out.println(a + f);
	}

	public void getStudentInfo(String name, short a) {
		System.out.println(name + a);
	}

	public static void main(String[] args) {
		Students obj=new Students();
		obj.getStudentInfo();
		obj.getStudentInfo(142);
		obj.getStudentInfo("Sudharsanam", 143);
		obj.getStudentInfo(143, 23456.000f);
		obj.getStudentInfo("keerthi", 33);

	}

}
