package genericLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToReadDataFromRow 
{
	@Test
	public void loginDemoWebShop() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		UtilityMethodsToReadData um = new UtilityMethodsToReadData();
		String url = um.readTheDataFromPropertyFile("./testData/data.properties", "url");
		driver.get(url);
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		String[] loginData = um.readingRowDataFromExcel("E:\\eclipse-workspace\\AdvanceSelenium\\testData\\dataprovider.xlsx", "LoginRow", 0);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(loginData[0]);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(loginData[1]);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
	}
}
