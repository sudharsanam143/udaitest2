package week7.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Examplefortable {

	public static void main(String[] args) throws IOException {
		int count=0;
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> elements = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr//td[5]"));
		for(WebElement obj:elements) {
			String text = obj.getText();
			System.out.println(text);
			count++;
			
		}
		System.out.println(count);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File Obj=new File("./snap/res.png");
		FileUtils.copyFile(source,Obj);
		
	}

}
