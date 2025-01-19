package week7.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exampleforframe {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='default.xhtml']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='page.xhtml']"));
		driver.switchTo().frame(frame2);
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@src='framebutton.xhtml']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		WebElement frame4 = driver.findElement(By.xpath("//iframe[@src='nested.xhtml']"));
		driver.switchTo().frame(frame4);
		WebElement text2 = driver.findElement(By.id("Click"));
		String text3 = text2.getText();
		System.out.println(text3);
		if(text3.contains("Count")) {
			System.out.println("verified");
		}
		else {
			System.out.println("Not Verified");
		}
		
		
		File source = text2.getScreenshotAs(OutputType.FILE);
		File Obj=new File("./snap/ig.png");
		FileUtils.copyFile(source,Obj);
	}

}
