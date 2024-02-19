package testNgDemoWebShop;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Demo_002 extends BaseClass{
	
	@Test
	public void userIsAbleToClickonShoppingCart()
	{
		BasePage basepage = new BasePage(driver);
		basepage.getShoppingCartLink().click();
		Reporter.log("User is able to click on Shopping Cart",true);
	}

}
