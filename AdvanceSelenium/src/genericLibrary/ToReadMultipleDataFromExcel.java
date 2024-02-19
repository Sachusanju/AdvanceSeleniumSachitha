package genericLibrary;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToReadMultipleDataFromExcel {

	@Test(dataProvider = "data")
	public void login(String un, String pwd) throws IOException
	{
		WebDriver driver = new ChromeDriver();
		UtilityMethodsToReadExcelPropData um = new UtilityMethodsToReadExcelPropData();
		String url = um.readTheDataFromPropertyFile("./testData/data.properties", "url");
		driver.get(url);
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.quit();
		
	}
	
	@DataProvider(name = "data")
	public String[][] dataSupply() throws IOException
	{
		return UtilityMethodsToReadExcelPropData.readingDataFromMultipleRowColumn("E:\\eclipse-workspace\\AdvanceSelenium\\testData\\dataprovider.xlsx", "LoginMultiple");
	}
}
