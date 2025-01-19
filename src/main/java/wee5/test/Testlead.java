package wee5.test;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testlead {
    @Test
	public  void runlead() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("(//div[@class='station-body col'])[3]")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("(//div[@class='station-body col'])[2]")).click();
		driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
		WebElement element = driver.findElement(By.xpath("//h5[@class='title']"));
		String bus = element.getText();
		System.out.println(bus);
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Sleeper']"));
		WebElement element3 = driver.findElement(By.xpath("//div[@class='text-grey']"));
		String availableseat = element3.getText();
		System.out.println(availableseat);
		driver.executeScript("arguments[0].click()",element2);
		driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='4UA']")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		WebElement element4 = driver.findElement(By.xpath("//div[@class='seat-fare col auto']"));
		String amount = element4.getText();
		System.out.println(amount);
		WebElement element5 = driver.findElement(By.xpath("//div[@class='selected-seat col auto']"));
		String seat = element5.getText();
		System.out.println(seat);
		
		
		
	
	}

}
