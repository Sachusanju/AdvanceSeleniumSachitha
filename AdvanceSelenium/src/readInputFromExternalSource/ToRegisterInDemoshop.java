package readInputFromExternalSource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToRegisterInDemoshop {

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
		
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.name("Gender")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(prop.getProperty("firstName"));
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(prop.getProperty("lastName"));
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@id='register-button']")).click();

	}

}
