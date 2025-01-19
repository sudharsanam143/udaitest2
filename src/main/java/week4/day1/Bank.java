package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("https://uibank.uipath.com/welcome");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register For Account")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Sudharsanam033@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sudhar@143");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Sudharsanam");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("S");
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("Alan"); 
		driver.findElement(By.xpath("//select[@id='sex']")).sendKeys("Male");
		driver.findElement(By.xpath("//select[@id='employmentStatus']")).sendKeys("Unemployed");
		driver.findElement(By.xpath("//select[@id='title']")).sendKeys("mr");
		driver.findElement(By.xpath("//select[@id='maritalStatus']")).sendKeys("Single");
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("06/03/2003");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Keerthi");
		driver.findElement(By.xpath("//input[@id='numberOfDependents']")).sendKeys("3");
		String title = driver.getTitle();
		if (title.contains("UiBank")) {
			System.out.println("Title is Verified");
		} else {
			System.out.println("Title is not Verified");
		}
	}

}
