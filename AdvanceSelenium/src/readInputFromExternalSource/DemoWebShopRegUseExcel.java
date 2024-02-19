package readInputFromExternalSource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopRegUseExcel {

	public static void main(String[] args) throws IOException {
		//Step 1: Create object for File
				File file = new File("./testData/testData1.xlsx");
				
				//Step2: Create object for file input stream
				FileInputStream fis = new FileInputStream(file);
				
				//To create direct object for workBook(it will take care about excel extension)
				Workbook work_book = WorkbookFactory.create(fis);
				
				WebDriver driver = new ChromeDriver();
				
				String url = work_book.getSheet("data").getRow(1).getCell(0).getStringCellValue();
				System.out.println(url);
				
				String first_name = work_book.getSheet("Register").getRow(0).getCell(1).getStringCellValue();
				System.out.println(first_name);
				
				String last_name = work_book.getSheet("Register").getRow(1).getCell(1).getStringCellValue();
				System.out.println(last_name);
				
				String email = work_book.getSheet("Register").getRow(2).getCell(1).getStringCellValue();
				System.out.println(email);
				
				String password = work_book.getSheet("Register").getRow(3).getCell(1).getStringCellValue();
				System.out.println(password);
				
				driver.get(url);
				driver.findElement(By.className("ico-register")).click();
				driver.findElement(By.xpath("//input[@id='gender-female']")).click();
				driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(first_name);
				driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(last_name);
				driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
				driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
				driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(password);
				driver.findElement(By.xpath("//input[@id='register-button']")).click();
			}

}
