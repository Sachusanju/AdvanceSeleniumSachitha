package workingWithPom;

import org.testng.annotations.Test;

public class AvoidStaleReferenceElementException extends BaseClass{
	
	@Test
	public void testCase()
	{
		BasePage basePage = new BasePage(driver);
		basePage.getSearchTextBox().sendKeys("computer");
		basePage.getSearchButton().click();
		driver.navigate().refresh();
		basePage.getSearchTextBox().sendKeys("book");
	}
}
