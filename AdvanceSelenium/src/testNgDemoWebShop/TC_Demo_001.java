package testNgDemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Demo_001 extends BaseClass{
	public String actualWishlistText="Wishlist";
	
	@Test
	public void userIsAbleToClickonWishList()
	{
		driver.findElement(By.xpath("//a[text()='Wishlist']")).click();
		WebElement wishlistPage = driver.findElement(By.xpath("//h1[contains(text(),'Wishlist')]"));
		String wishlistText = wishlistPage.getText();
		if(wishlistText.contains(actualWishlistText))
		{
			Reporter.log("User is able to click on WishList link",true);
			
		}
		else
		{
			Reporter.log("User is not able to click on wishlist link",true);
		}
	}
	
	
	

}
