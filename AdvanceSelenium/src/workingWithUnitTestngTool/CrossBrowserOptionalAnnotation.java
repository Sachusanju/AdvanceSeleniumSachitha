package workingWithUnitTestngTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class CrossBrowserOptionalAnnotation {
	WebDriver driver;


	@Test
	public void browsers(@Optional("chrome") String browserName, @Optional("https://demowebshop.tricentis.com/login") String url)
	{
		if(browserName.equals("chrome")) {
		 driver = new ChromeDriver();
		}
		
		else if(browserName.endsWith("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		else if(browserName.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		
		else
		{
			Reporter.log("Browser name is not valid");
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.quit();
	}

}
