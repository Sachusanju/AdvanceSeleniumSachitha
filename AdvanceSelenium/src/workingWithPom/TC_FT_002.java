package workingWithPom;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_FT_002 extends BaseClass{
	
	@Test
	public void clickEveryOptionOfHeaderMenu()
	{
		BasePage basePage = new BasePage(driver);
		
		System.out.println("size of menu "+basePage.getHeaderMenu().size());
		
		for (WebElement e : basePage.getHeaderMenu()) 
			{
				e.click();
				//String menu_name = e.getText();
				//System.out.println("User is able to click on "+menu_name);
				driver.navigate().refresh();
				
			}
		
	}

}
