package workingWithUnitTestngTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkingWithDependsOnGroup 
{
	@Test(groups = "cabs")
	public void ola()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.olacabs.com/");
		driver.quit();
	}
	
	@Test(groups = "cabs")
	public void uber()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.uber.com/in/en/");
		driver.quit();
	}
	
	@Test(groups = "cabs")
	public void rapido()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rapido.bike/");
		driver.quit();
	}
	
	
}
