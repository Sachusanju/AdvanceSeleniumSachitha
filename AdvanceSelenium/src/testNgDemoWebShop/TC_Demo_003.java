package testNgDemoWebShop;

import java.io.IOException;

import org.testng.annotations.Test;

public class TC_Demo_003 extends BaseClass
{
	@Test
	
	public void newsletter() throws IOException
	{
		BasePage basePage = new BasePage(driver);
		UtilityMethodsToReadData um = new UtilityMethodsToReadData();
		
		String email = um.readingDataExcelSingleValue("E:\\eclipse-workspace\\AdvanceSelenium\\testData\\dataprovider.xlsx", "SingleRow", 0, 0);
		basePage.getNewsLetterEmail().sendKeys(email);
		
		basePage.getSubscribeButton().click();
		
	}
}
