package workingWithUnitTestngTool;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataproviderDemoReg {
	FileInputStream fis;

	@Test(dataProvider = "UserReg")
	public void demoReg(String[] register) {
		WebDriver driver = new ChromeDriver();

		try {
			fis = new FileInputStream("E:\\eclipse-workspace\\AdvanceSelenium\\testData\\data.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.get(prop.getProperty("url"));

		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(register[0]);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(register[1]);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(register[2]);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(register[3]);
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(register[4]);
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
	}

	@DataProvider(name = "UserReg")

	public String[][] getData() 
	{
		String[][] data = new String[2][5];

		data[0][0] = "xyz";
		data[0][1] = "last";
		data[0][2] = "xyz1223@gmail.com";
		data[0][3] = "123456";
		data[0][4] = "123456";

		data[1][0] = "abc";
		data[1][1] = "san";
		data[1][2] = "abc7233@gmail.com";
		data[1][3] = "123456";
		data[1][4] = "123456";

		return data;

	}
}
