package genericLibrary;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToReadDataFromPropFileUsingUtilityMethod {

		@Test
		public void launchBrowser() throws IOException
		{
			WebDriver driver = new ChromeDriver();
			UtilityMethodsToReadData um = new UtilityMethodsToReadData();
			String url = um.readTheDataFromPropertyFile("./testData/data.properties", "url");
			driver.get(url);
			
		}
}
