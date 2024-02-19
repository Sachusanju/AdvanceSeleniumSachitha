package testNgDemoWebShop;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_Demo_005 extends BaseClass
{
	@Test
	public void clickEveryOptionOfHeaderMenu()
	{
		List<WebElement> menu_list= driver.findElements(By.xpath("//div[@class='header-menu']/child::ul[1]/child::li/child::a"));
		int menu_size = menu_list.size();
		System.out.println("size of menu "+menu_size);
		
		for(int i=0;i<menu_size;i++)
		{
			menu_list.get(i).click();
			
			driver.navigate().back();
			String menu_name = menu_list.get(i).getText();
			System.out.println("User is able to click on "+menu_name);
			
		}
		
//		for (WebElement e : menu_list) 
//		{
//			e.click();
//			String menu_name = driver.findElement(By.xpath("//div[@class='header-menu']/child::ul[1]/child::li/child::a")).getText();
//			System.out.println("User is able to click on "+menu_name);
//			driver.navigate().back();
//			
//		}
	}
}
