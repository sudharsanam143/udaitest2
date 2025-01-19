package revise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookr {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://in.bookmyshow.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("Salem");
		driver.findElement(By.xpath("//strong[text()='Salem']")).click();
		driver.findElement(By.xpath("//a[text()='Movies']")).click();
		driver.findElement(By.xpath("//div[text()='Sign in']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Continue with mobile number']")).sendKeys("9361347051");
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
	}

}

