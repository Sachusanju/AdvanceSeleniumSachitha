package workingWithUnitTestngTool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderActiTime 
{
//	@Test(dataProvider = "data")
//	public void actiTime(String user_name, String pwd) {
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://timetracker.ctepl.com/actitime/login.do");
//		driver.findElement(By.name("username")).sendKeys(user_name);
//		driver.findElement(By.name("pwd")).sendKeys(pwd);
//		driver.findElement(By.id("loginButton")).click();
//		
//		
//	}
	
	@Test(dataProvider = "data")
	public void actiTime(String [] login) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://timetracker.ctepl.com/actitime/login.do");
		driver.findElement(By.name("username")).sendKeys(login[0]);
		driver.findElement(By.name("pwd")).sendKeys(login[1]);
		driver.findElement(By.id("loginButton")).click();
		
		
	}
	
	@DataProvider(name="data")
	public String[][] dataSet()
	{
		String[][] data= {{"sanjana","acm"},{"samantha","1234"}};
		return data;
	}
}
