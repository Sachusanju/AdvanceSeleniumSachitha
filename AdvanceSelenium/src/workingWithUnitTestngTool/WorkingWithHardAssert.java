package workingWithUnitTestngTool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithHardAssert {
	
	@Test
	public void demoWeb()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("User is able to maximize the browser");
		
		String expectedUrl = "https://demowebshop.tricentis.com/login";
		String expectedEmailId = "brsachitha123@gmail.com";
		
		driver.get("https://demowebshop.tricentis.com/login");
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
		
		Assert.assertEquals(expectedUrl, actualurl, "User is not able to land on login page");
		
		
		WebElement emailId = driver.findElement(By.id("Email"));
		emailId.sendKeys("brsachitha123@gmail.com");
		String actualEmailId = emailId.getAttribute("value");
		System.out.println(actualEmailId);
		Assert.assertEquals(actualEmailId, expectedEmailId,"Email id is not matching ");
		
		
		driver.quit();
	}

}
