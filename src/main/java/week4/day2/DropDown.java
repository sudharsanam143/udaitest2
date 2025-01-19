package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		//driver.findElement(By.xpath("/i[@class='pi pi-server layout-menuitem")).click();
		WebElement Dropdown = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select object=new Select(Dropdown);
		object.selectByIndex(1);
		driver.findElement(By.xpath("//label[@id='j_idt87:country_label']")).click();
		driver.findElement(By.xpath("//li[@id='j_idt87:country_3']")).click();
		WebElement element = driver.findElement(By.xpath("//label[@id='j_idt87:city_label']"));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		WebElement element2 = driver.findElement(By.xpath("//li[@id='j_idt87:city_1']"));
		wait.until(ExpectedConditions.elementToBeClickable(element2));
		element2.click();
		driver.findElement(By.xpath("//input[@id='j_idt87:auto-complete_input']")).sendKeys("Selenium");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@data-item-label='Selenium WebDriver']")).click();
		//Thread.sleep(1000);  
		driver.findElement(By.xpath("//input[@id='j_idt87:auto-complete_input']")).sendKeys("play");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@data-item-label='Playwright']")).click();
		driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']")).click();
		driver.findElement(By.xpath("//li[@data-label='English']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		driver.findElement(By.xpath("//li[@data-label='Three']")).click();
		
	
	}

}
