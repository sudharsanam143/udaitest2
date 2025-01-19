package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LaunchBrowser {
	
	
	public void launchBrwser() throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		if (title.contains("Leaftaps")) {
			System.out.println("Title is verified");	  
		}
		else {
			System.out.println("Title is not Verified");
		}
		
     	driver.findElement(By.id("username")).sendKeys("Democsr");
     	Thread.sleep(3000);
     	driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.linkText("Leads")).click(); 
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ZOHO");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sudharsanam");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8838881539");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sudharsanams143@gmail.com");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Erode");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Pallipalayam");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Veppadai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("637303");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("06/03/2003");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("143");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Tamilnadu");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Keerthi");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Sabari");
		driver.findElement(By.className("smallSubmit")).click();
		String title2 = driver.getTitle();
		if(title2.contains("View Lead")) {
			System.out.println("Title is Verified");
		}
		else {
			System.out.println("Title is not Verified");
		}

}
	}

