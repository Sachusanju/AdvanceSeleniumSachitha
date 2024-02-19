package workingWithUnitTestngTool;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoClickEachOfTheMenuInHeader
{
	@Test
	public void clickOnMenu() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> menu_list = driver.findElements(By.xpath("//input[@type='radio']"));
		for (WebElement e : menu_list) {
			Thread.sleep(3000);
			e.click();
			
			
		}
	}
}
