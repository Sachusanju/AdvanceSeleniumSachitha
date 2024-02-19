package testNgDemoWebShop;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import genericLibrary.UtilityMethodsToReadData;

public class BaseClass {

	public WebDriver driver;

	@BeforeSuite
	public void dataBaseStart() {
		Reporter.log("DataBaseconnection is done", true);
		Reporter.log("Extent Report formation", true);
	}

	@AfterSuite
	public void dataBaseStopped() {
		Reporter.log("Database connection is stoped", true);
		Reporter.log("Extent Report formation end", true);
	}

	@BeforeTest
	public void browserSetup() throws IOException {
		driver = new ChromeDriver();
		Reporter.log("User is able to open empty browser", true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Reporter.log("User is able to maximise the browser", true);
		UtilityMethodsToReadData um = new UtilityMethodsToReadData();
		String url = um.readTheDataFromPropertyFile("./testData/data.properties", "url");
		driver.get(url);
	}

	@AfterTest
	public void tearDownBrowser() {
		driver.quit();
		Reporter.log("User is able to quit the demowebShop", true);
	}

	@BeforeMethod
	public void login() throws Exception 
	{
		UtilityMethodsToReadData um = new UtilityMethodsToReadData();
		BasePage basePage = new BasePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		
		basePage.getLogInLink().click();
		String[] loginData = um.readingRowDataFromExcel("E:\\eclipse-workspace\\AdvanceSelenium\\testData\\dataprovider.xlsx", "LoginRow", 0);

		loginPage.getEmailTextBox().sendKeys(loginData[0]);
		loginPage.getPasswordTextBox().sendKeys(loginData[1]);
		loginPage.getRememberMeTextBox().click();
		loginPage.getLoginButton().click();
		Reporter.log("User is able to login", true);
	}

	@AfterMethod
	public void logOut() {
		driver.findElement(By.partialLinkText("Log out")).click();
		Reporter.log("User is able to logout", true);
	}

}
