package week7.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exampleforwindow {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// driver.findElement(By.xpath("//h5[text()='Find the number of opened tabs']//following::button")).click();
//		Set<String> windowHandles = driver.getWindowHandles();
//		List<String>obj=new ArrayList<String>(windowHandles);
//		driver.switchTo().window(obj.get(1));
//		String title = driver.getTitle();
//		System.out.println(title);
//		Set<String> windowHandles = driver.getWindowHandles();
//		List<String>obj=new ArrayList<String>(windowHandles);
//		driver.switchTo().window(obj.get(1));
//		String title = driver.getTitle();
//		System.out.println(title);
		driver.findElement(By.xpath("//h5[text()='Click and Confirm new Window Opens']//following::button")).click();
		String windowHandle = driver.getWindowHandle();
		driver.switchTo().window(windowHandle);
		String title2 = driver.getTitle();
		System.out.println(title2); 
		
	
	}

}
