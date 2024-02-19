package simpleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//To verify that user is able to enter only numeric values in email textfield
public class TC_FT_Login_004 {

	public static void main(String[] args) {
		String actualHomePageUrl = "https://demowebshop.tricentis.com/";
		String actualLoginPageUrl = "https://demowebshop.tricentis.com/login";
		String actualEmailData = "123456@gmail.com";
		
		//Step-1: Open a browser.
		WebDriver driver =new ChromeDriver();
		System.out.println("User is able to open empty browser");
		driver.manage().window().maximize();
		System.out.println("User is able maxmimize the browser");
		
		//Step-2: Enter the Url
		driver.get("https://demowebshop.tricentis.com/");
		String expectedHomePageUrl = driver.getCurrentUrl();
		if(actualHomePageUrl.equals(expectedHomePageUrl))
		{
			System.out.println("User is able to open DemoWeb shop application");
		}
		else
		{
			System.out.println("User is not able to open DemoWeb shop application");
		}
		
		//Step-3: Click on Login link
		WebElement logInLink = driver.findElement(By.xpath("//a[text()='Log in']"));
		logInLink.click();
		String expectedLoginPageUrl  = driver.getCurrentUrl();
		if(actualLoginPageUrl.equals(expectedLoginPageUrl))
		{
			System.out.println("User is able to click on login link");
		}
		else
		{
			System.out.println("User is not able click on login link");
		}
		
		//Step 4:Enter only numeric value for Email textfield.
		WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='Email']"));
		emailTextBox.sendKeys("123456@gmail.com");
		emailTextBox.sendKeys(Keys.TAB);
		String expectedEmailData = emailTextBox.getAttribute("value");
		System.out.println(expectedEmailData);
		if(actualEmailData.equals(expectedEmailData))
		{
			System.out.println("User is able to enter email data.");
		}
		
		else
		{
			System.out.println("Miss-match in expected and actual email data.");
			
		}
		
		//Step-5:Close the browser
		driver.quit();
		System.out.println("User is able to close demo Web Shop Application");
		

	}

}
