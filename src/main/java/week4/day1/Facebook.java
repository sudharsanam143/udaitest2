package week4.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https.//facebook .com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']"));
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("S");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sudharsanam033@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Sudhar@143");
		String title = driver.getTitle();
		if(title.contains("Facebook")) {
			System.out.println("Title is Verified");
			
		}
		else {
			System.out.println("Title is not Verified");
		}
		

	}

}
