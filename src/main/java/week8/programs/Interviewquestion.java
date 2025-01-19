package week8.programs;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interviewquestion {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		List<WebElement> elements = driver.findElements(By.tagName("a"));
		int c = 0;
		for (int i = 0; i < elements.size(); i++) {

			System.out.println(elements.get(i).getText());
			c++;
		}
		System.out.println(c);
	}

}
