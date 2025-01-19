package week6.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//h5[text()=' Alert (Simple Dialog)']//following::span")).click();
		Alert click = driver.switchTo().alert();
		System.out.println(click.getText());
		click.accept();
		driver.findElement(By.xpath("//h5[text()=' Alert (Confirm Dialog)']//following::span")).click();
		System.out.println(click.getText());
		click.accept();
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']//following::span")).click();
		click.sendKeys("Sudharsanam");
		click.accept();
		WebElement alert = driver.findElement(By.xpath("//span[text()='User entered name as: Sudharsanam']"));
		String text = alert.getText();
		System.out.println(text);

	}

}
