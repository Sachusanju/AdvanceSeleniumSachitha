package readInputFromExternalSource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenDemoWebshop {

	public static void main(String[] args) throws IOException 
	{
		//Step:1 create obj fro File
				File file = new File("./testData/data.properties");
				
				//Step:2 Create obj for Fis
				FileInputStream fis = new FileInputStream(file);
				
				//Step:3 create obj for properties
				Properties prop = new Properties();
				prop.load(fis);
				
				WebDriver driver = new ChromeDriver();
				//driver.get accepts string so 
				driver.get(prop.getProperty("url"));
				
				driver.findElement(By.linkText("Log in")).click();
				driver.findElement(By.id("Email")).sendKeys(prop.getProperty("email"));
				driver.findElement(By.className("password")).sendKeys(prop.getProperty("password"));
				driver.findElement(By.className("login-button")).click();

	}

}
