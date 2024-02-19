package workingWithUnitTestngTool;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HelpAttrdependsOnMethods 
{
	@Test
	public void register() 
	{
		Reporter.log("User is able to register",true);
	}
	
	@Test(dependsOnMethods = "register")
	public void login() 
	{
		Reporter.log("User is able to login",true);
	}
	
	@Test(dependsOnMethods = "cart")
	public void logout() 
	{
		Reporter.log("User is able to logout",true);
	}
	
	@Test(dependsOnMethods = "login")
	public void search() 
	{
		Reporter.log("User is able to search",true);
	}
	
	@Test(dependsOnMethods = "search")
	public void cart() 
	{
		Reporter.log("User is able to add product to cart",true);
	}
}
