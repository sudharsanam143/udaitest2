package week4.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Keerthi");
		driver.findElement(By.name("lastname")).sendKeys("S");
		driver.findElement(By.xpath("(//input[@data-type='text'])[3]")).sendKeys("9361347051");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Keerthi@143");
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select obj=new Select(day);
		obj.selectByVisibleText("30");
		
		
		
		
	}

}
