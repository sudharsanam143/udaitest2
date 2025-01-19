package week3.day3;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchEdge {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://www.facebook.com/login");
		String title = driver.getTitle();
		if (title.contains("facebook")) {
			System.out.println("Title is verified");
		} else {
			System.out.println("Title is not verified");
		}
		
		driver.findElement(By.id("email")).sendKeys("sudharsanam033@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Sudharkeerthi@333");
		
		driver.findElement(By.className("_97w4")).click() ;
	}

}
