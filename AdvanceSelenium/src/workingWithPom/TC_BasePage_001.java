package workingWithPom;

import org.testng.annotations.Test;

public class TC_BasePage_001 extends BaseClass {
	@Test
	public void searchAnItem()
	{
		BasePage basePage = new BasePage(driver);
		basePage.getSearchTextBox().sendKeys("computer");
		basePage.getSearchButton().click();
	}
}
