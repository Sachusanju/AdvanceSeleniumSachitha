package testNgDemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Demo_004 extends BaseClass
{
	@Test
	public void community_poll()
	{
		WebElement poll_good = driver.findElement(By.xpath("//input[@id='pollanswers-2']"));
		poll_good.click();
		boolean good_selected = poll_good.isSelected();
		if(good_selected)
		{
			Reporter.log("User is able to select poll good",true);
		}
		else
		{
			Reporter.log("User is not able to select poll good",true);
		}
		
		WebElement vote_btn = driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
		boolean vote_btn_value = vote_btn.isEnabled();
		if(vote_btn_value)
		{
			vote_btn.click();
			Reporter.log("User is able to click on Vote button",true);
		}
		else
		{
			Reporter.log("User is not able to click on vote button",true);
		}
	}
}
