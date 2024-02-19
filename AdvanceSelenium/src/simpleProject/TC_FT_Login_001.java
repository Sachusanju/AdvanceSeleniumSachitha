package simpleProject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//To verify that email text field is present on the login page.
public class TC_FT_Login_001 {

	public static void main(String[] args) 
	{
		String actualHomePageUrl = "https://demowebshop.tricentis.com/";
		String actualLoginPageUrl = "https://demowebshop.tricentis.com/login";
		
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
		
		//Step 4: Click on email Text Box
		WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='Email']"));
		emailTextBox.click();
		boolean emailSelected = emailTextBox.isDisplayed();
		if(emailSelected)
		{
			System.out.println("Email Text Box is present in login Page.");
		}
		else
		{
			System.out.println("Email Text Box is not present in login Page");
		}
		
		//Step-5:Close the browser
		driver.quit();
		System.out.println("User is able to close demo Web Shop Application");
		
	}

}
