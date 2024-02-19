package genericLibrary;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToReadSingleDatafromExcel {
	
	@Test
	public void loginUsingExcel() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		UtilityMethodsToReadData um = new UtilityMethodsToReadData();
		String url = um.readTheDataFromPropertyFile("./testData/data.properties", "url");
		driver.get(url);
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		String email = um.readingDataExcelSingleValue("E:\\eclipse-workspace\\AdvanceSelenium\\testData\\dataprovider.xlsx", "SingleRow", 0, 0);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		String pwd = um.readingDataExcelSingleValue("E:\\eclipse-workspace\\AdvanceSelenium\\testData\\dataprovider.xlsx", "SingleRow", 0, 1);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.quit();
	}

}
