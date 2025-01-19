package week4.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftaps {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Democsr");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
     	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("+91");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8838881539");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		WebElement lead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[3]/a"));
		String text = lead.getText();
		Thread.sleep(1000);
		lead.click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("leadId");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		WebElement delete = driver.findElement(By.xpath("//div[text()='No records to display']"));
		String verify = delete.getText();

		if (verify.equals("No records to display")) {
			System.out.println("Lead is Deleted");
		} else {
			System.out.println("Lead is not deleted");
		}
		}

}
