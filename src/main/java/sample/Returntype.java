package sample;

public class Returntype {
	public int teaching() {
		int a=1;
		System.out.println(a);
		return a;
		
	}
	public void walking() {
		String str="testleaf";
		System.out.println(str);
	}

	public static void main(String[] args) {

		Returntype re=new Returntype();
		int teaching = re.teaching();
		teaching=4;
		System.out.println(teaching);
		teaching=9999;
		System.out.println(teaching);
		re.walking();
	}

}
