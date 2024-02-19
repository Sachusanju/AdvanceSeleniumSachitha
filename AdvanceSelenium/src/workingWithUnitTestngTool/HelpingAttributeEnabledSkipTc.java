package workingWithUnitTestngTool;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HelpingAttributeEnabledSkipTc 
{
	@Test(priority = 3)
	public void register()
	{
		Reporter.log("User is able to Register",true);
	}
	
	@Test(priority = 1)
	public void openbrowser()
	{
		Reporter.log("User is able to open browser",true);
	}
	
	@Test(priority = 2)
	public void url()
	{
		Reporter.log("User is able to enter url",true);
	}
	
	@Test(priority = 4)
	public void login()
	{
		Reporter.log("User is able to login",true);
	}
	
	//to skip test case
	@Test(priority = 5,enabled = false)
	public void logout()
	{
		Reporter.log("User is able to logout",true);
	}
	
	
}
