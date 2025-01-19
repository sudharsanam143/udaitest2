package week7.day1;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tata {

	public static void main(String[] args) {
//		ChromeOptions opt =new ChromeOptions();
//		opt.addArguments("--disable-notifications");
		ChromeDriver driver =new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("wzrk-confirm")).click();
		WebElement brand = driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions act=new Actions(driver);
		act.moveToElement(brand).perform();
		WebElement watch = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		act.moveToElement(watch).perform();
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		WebElement drop = driver.findElement(By.xpath("//select[@label='Popularity']"));
		Select down = new Select(drop);
		down.selectByIndex(3);
		driver.findElement(By.xpath("//div[text()='Men']")).click();
		
	}

}
