package workingWithUnitTestngTool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WorkingWithSoftAssert {
	
	@Test
	public void demoWeb()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("User is able to maximize the browser");
		SoftAssert softAssert = new SoftAssert();
		
		String expectedUrl = "https://demowebshop.tricentis.com/login";
		String expectedEmailId = "brsachitha123@gmail.com";
		String expectedpwd = "Sanjana@1";
		boolean expectedloginButton = true;
		
		driver.get("https://demowebshop.tricentis.com/login");
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
		
		softAssert.assertEquals(actualurl, expectedUrl, "It is not login page");
		
		WebElement emailId = driver.findElement(By.id("Email"));
		emailId.sendKeys("brsachitha123@gmail.com");
		String actualEmailId = emailId.getAttribute("value");
		System.out.println(actualEmailId);
		softAssert.assertEquals(actualEmailId, expectedEmailId,"Email id is not matching ");
		
		WebElement pwd = driver.findElement(By.id("Email"));
		pwd.sendKeys("brsachitha123@gmail.com");
		String actualpwd = pwd.getAttribute("value");
		System.out.println(actualpwd);
		softAssert.assertEquals(expectedpwd, actualpwd,"password is not matching ");
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@value='Log in']"));
		loginbutton.click();
		boolean actualloginbtn = loginbutton.isSelected();
		System.out.println(actualloginbtn);
		softAssert.assertEquals(expectedloginButton, actualloginbtn,"User is not able to click on login button");
		driver.quit();
		softAssert.assertAll();
	}

}
