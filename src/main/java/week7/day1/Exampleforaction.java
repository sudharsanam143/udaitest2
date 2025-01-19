package week7.day1;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Exampleforaction {

	public static void main(String[] args) {
		
//		ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.navigate().refresh();
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Two Wheelers']"));
		Actions obj=new Actions(driver);
		obj.moveToElement(element2).perform();
		driver.findElement(By.xpath("//a[text()='Electric Vehicles']")).click();
		WebElement scroll = driver.findElement(By.xpath("//div[text()='CONSUMER POLICY']"));
//		WebElement element = driver.findElement(By.xpath("//div[text()='Top Deals On TVs & Appliances']"));
//		obj.scrollToElement(element).perform();
//		
		
		obj.scrollToElement(scroll).perform();
	}

}
