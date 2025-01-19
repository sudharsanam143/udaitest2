package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leaftap {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Democsr");
     	driver.findElement(By.id("password")).sendKeys("crmsfa"); 
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.linkText("Leads")).click(); 
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement source = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		Select drop=new Select(source);
		drop.selectByIndex(4);  
//		drop.selectByVisibleText("Employee");
//		drop
		
	}

}
