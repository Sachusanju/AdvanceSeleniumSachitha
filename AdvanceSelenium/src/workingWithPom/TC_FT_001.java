package workingWithPom;

import org.testng.annotations.Test;

public class TC_FT_001 extends BaseClass
{
	@Test
	public void clickOnBooksMenu()
	{
		BasePage basePage = new BasePage(driver);
		basePage.getHeaderMenuBOOKS().click();
	}
	
	
}
