package week7.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentinalert {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.cheapoair.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//a[@aria-label='clear field'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("chennai");
		driver.findElement(By.xpath("//span[text()='Chennai']")).click();
		driver.findElement(By.xpath("(//a[@aria-label='clear field'])[2]")).click();
		driver.findElement(By.xpath("//div[text()='Hyderabad']")).click();
		driver.findElement(By.xpath("(//a[text()='19'])[2]")).click();
		//driver.findElement(By.xpath("//a[@aria-label='close calendar']")).click();
		//driver.findElement(By.xpath("//div[@class='col-6 calendarReturn']")).click();
		driver.findElement(By.xpath("//a[@aria-label='31 December 2024']")).click();
		driver.findElement(By.xpath("(//a[text()=' Close'])[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Traveler']")).click();
	}

}
