package workingWithUnitTestngTool;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadingTheDataFromExcelUsingDataProvider {
	
	@DataProvider
	public String[][] user_reg_data() throws Exception, IOException
	{
		File file = new File("E:\\eclipse-workspace\\AdvanceSelenium\\testData\\testData1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook ref = WorkbookFactory.create(fis);
		int numOfRows = ref.getSheet("Register").getPhysicalNumberOfRows();
		System.out.println("number of rows"+numOfRows);
		int numOfCol = ref.getSheet("Register").getRow(0).getPhysicalNumberOfCells();
		System.out.println("Number of columns"+numOfCol);
		
		String[][] data = new String[numOfRows][numOfCol];
		for(int i=0;i<numOfRows;i++)
		{
			for(int j=0;j<numOfCol;j++)
			{
				data[i][j] = ref.getSheet("Register").getRow(i).getCell(j).toString();
			}
		}
		
		return data;
	}
	
	@Test(dataProvider = "user_reg_data")
	public void registerUser(String[] dataToReg) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		if(dataToReg[0].equalsIgnoreCase("female"))
		{
			driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		}
		else
		{
			driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		}
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(dataToReg[1]);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(dataToReg[2]);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(dataToReg[3]);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(dataToReg[4]);
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(dataToReg[5]);
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		driver.quit();
	}
	
	
}
