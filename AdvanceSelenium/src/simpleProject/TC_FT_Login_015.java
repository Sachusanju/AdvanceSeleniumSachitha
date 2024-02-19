package simpleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//To verify that user entered data in  password textfield is case-sensitive.
public class TC_FT_Login_015 {

	public static void main(String[] args) {

		String actualHomePageUrl = "https://demowebshop.tricentis.com/";
		String actualLoginPageUrl = "https://demowebshop.tricentis.com/login";
		String actualEmailData = "brsachitha123@gmail.com";

		// Step-1: Open a browser.
		WebDriver driver = new ChromeDriver();
		System.out.println("User is able to open empty browser");
		driver.manage().window().maximize();
		System.out.println("User is able maxmimize the browser");

		// Step-2: Enter the Url
		driver.get("https://demowebshop.tricentis.com/");
		String expectedHomePageUrl = driver.getCurrentUrl();
		if (actualHomePageUrl.equals(expectedHomePageUrl)) {

			System.out.println("User is able to open DemoWeb shop application");
		} else {
			System.out.println("User is not able to open DemoWeb shop application");
		}

		// Step-3: Click on Login link
		WebElement logInLink = driver.findElement(By.xpath("//a[text()='Log in']"));
		logInLink.click();
		String expectedLoginPageUrl = driver.getCurrentUrl();
		if (actualLoginPageUrl.equals(expectedLoginPageUrl)) {
			System.out.println("User is able to click on login link");
		} else {
			System.out.println("User is not able click on login link");
		}

		// Step 4:Enter valid email containing special characters '_' to Email
		// textfield.
		WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='Email']"));
		emailTextBox.sendKeys("brsachitha123@gmail.com");
		emailTextBox.sendKeys(Keys.TAB);
		String expectedEmailData = emailTextBox.getAttribute("value");
		System.out.println(expectedEmailData);
		if (actualEmailData.equals(expectedEmailData)) {
			System.out.println("User is able to enter email data.");
		}

		else {
			System.out.println("Miss-match in expected and actual email data.");

		}

		// Step-5:Enter invalid data to Password Text field and click on login button
		WebElement passwordTextField = driver.findElement(By.xpath("//input[@id='Password']"));
		passwordTextField.sendKeys("sAnJaNa@1");
		WebElement login_btn = driver.findElement(By.xpath("//input[@value='Log in']"));
		login_btn.click();
		String login_acct = driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText();
		System.out.println("Login_acct value:" + login_acct);
		if (actualEmailData.equals(login_acct)) {
			System.out.println("User is able to enter password and login to their account.");

		} else {
			System.out.println("User is not able to login their account with invalid password.");
		}

		// Step-6:Close the browser
		driver.quit();
		System.out.println("User is able to close demo Web Shop Application");

	}

}
