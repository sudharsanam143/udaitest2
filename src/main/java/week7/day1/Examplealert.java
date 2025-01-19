package week7.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Examplealert {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(" //h5[text()=' Alert (Simple Dialog)']//following::span")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.findElement(By.xpath("//h5[text()=' Alert (Confirm Dialog)']//following::button")).click();
		Alert alert2 = driver.switchTo().alert();
		String text = alert2.getText();
		System.out.println(text);
		alert.accept();
//		driver.findElement(By.xpath("//h5[text()='Sweet Modal Dialog']//following::button")).click();
//		driver.findElement(By.xpath("(//a[@aria-label='Close'])[2]")).click();
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']//following::button")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("sudharsanam");
		alert3.accept();
		WebElement element = driver.findElement(By.xpath("//span[text()='User entered name as: sudharsanam']"));
		String text2 = element.getText();
		System.out.println(text2);
		driver.findElement(By.xpath("//h5[text()='Sweet Alert (Confirmation)']//following::button")).click();
		Alert alert4 = driver.switchTo().alert();
		alert4.accept();
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		Alert alert5 = driver.switchTo().alert();
		alert5.dismiss();
		
//		sample s=new sample();
//		sample s1=new sample();
//		sample s2=new sample();
//		System.out.println(s.count);
//	}
//
//}
//
//class sample{
//	public static     int count=0;
//	public sample(){
//		count++;
//	}
	
}
}
