package workingWithUnitTestngTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WorkingWithCrossBrowserTesting
{
	WebDriver driver;
	
	
	@Parameters("browserName")
	@Test
	public void browser(String browserName)
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
		
		else if(browserName.equals("ie"))
		{
			driver = new InternetExplorerDriver();
		}
		
		else
		{
			Reporter.log("Browser name is not valid");
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.quit();
	}
}
