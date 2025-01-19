package week6.day1;

public class Automation extends MultipleLangauge implements Language, Testtool {
	@Override
	public void ruby() {
		System.out.println("Welcome Ruby");
	}

	@Override
	public void java() {
		System.out.println("Welcome Java");
	}

	@Override
	public void selenium() {
		System.out.println("Welcome Selenium");
	}

	public static void main(String[] args) {
		Automation obj = new Automation();
		obj.ruby();
		obj.java();
		obj.selenium();
		obj.python();
	}

}
