package simpleProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//To verify that user is able to login by entering unregistered data to email textfield and valid data to password textfield.
public class TC_IT_Login_002 {

	public static void main(String[] args) {
		String actualHomePageUrl ="https://demowebshop.tricentis.com/";
		String actualLoginPageUrl= "https://demowebshop.tricentis.com/login";
		String actualUserEmail="brsachith@gmail.com";
		
		//Step 1: Open the browser
		WebDriver driver = new ChromeDriver();
		System.out.println("User is able to open the empty browser");
		driver.manage().window().maximize();
		System.out.println("User is able to maximize the browser");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Step 2: Enter the URL
		driver.get("https://demowebshop.tricentis.com/");
		String expectedHomePageUrl=driver.getCurrentUrl();
		
		if(actualHomePageUrl.equalsIgnoreCase(expectedHomePageUrl))
		{
			System.out.println("User is able to open DemowebShop");
		}
		else
		{
			System.out.println("User is not able to open DemowebShop");
		}
		
		//Step 3: click on the Login Link
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		String urlOfTheLogin=driver.getCurrentUrl();
		System.out.println(urlOfTheLogin);
		if(actualLoginPageUrl.equals(urlOfTheLogin))
		{
			System.out.println("User is able to click on Login Link");
		}
		else
		{
			System.out.println("User is not able to click on Login Link");
		}
		
		//Step 4:enter valid data for email Textfield
		WebElement emailTextField=driver.findElement(By.xpath("//input[@id='Email']"));
		emailTextField.sendKeys("brsachith@gmail.com");
		String user_email=emailTextField.getAttribute("value");
		System.out.println("email textField:"+user_email);
		if(actualUserEmail.equals(user_email))
		{
			System.out.println("User is able to enter valid data for email textbox");
		}
		else
		{
			System.out.println("User is not able to send valid data for email textField");
		}

		//Step 5:enter valid data for password textfield
		WebElement password_textfield = driver.findElement(By.xpath("//input[@id='Password']"));
		password_textfield.sendKeys("Sanjana@1");
		System.out.println("User is able to enter password");
		
		
		//Step 6:click on checkbox
		
		WebElement checkBox = driver.findElement(By.id("RememberMe"));
		checkBox.click();
		boolean checkBox_select = checkBox.isSelected();
		//System.out.println("checkBox value:"+checkBox_select);
		if(checkBox_select)
		{
			System.out.println("User is  able to select Remember Checkbox");
		}
		else
		{
			System.out.println("User is not able to select Remember Checkbox");
		}
		
		//Step 7:click on Login button
		WebElement login_btn = driver.findElement(By.xpath("//input[@value='Log in']"));
		login_btn.click();
		String login_acct = driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText();
		System.out.println("Login_acct value:"+login_acct);
		if(actualUserEmail.equals(login_acct))
		{
			System.out.println("User is able to login to their account");
			
			//Step 8: User is able to logout
			WebElement logout_link = driver.findElement(By.xpath("//a[text()='Log out']"));
			logout_link.click();
			String homePage =driver.getCurrentUrl();
			System.out.println(homePage);
			if(actualHomePageUrl.equals(homePage))
			{
				System.out.println("User is able to logout.");
				
			}
			else
			{
				System.out.println("User is not able to logout");
			}
		}
		else
		{
			System.out.println("User is not able to login");
		}
		
		
		//Step 9: User is able to close the browser
		driver.quit();
		System.out.println("User is able to close demo webshop");
	}

}
