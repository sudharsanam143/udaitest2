package week5.day1;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amzon {

	public  void runAmazon() {
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);
		List<WebElement> mobiles = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for(int i=0;i<mobiles.size();i++) {
			String amount = mobiles.get(i).getText();
			System.out.println(amount);
			
			
//			File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
//			File dst=new File("./testing");
//			FileUtils.copyFile(screenshots, dst);

			
			
		}
		 
	}

}
