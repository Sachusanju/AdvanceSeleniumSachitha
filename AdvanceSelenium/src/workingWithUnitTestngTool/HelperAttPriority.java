package workingWithUnitTestngTool;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HelperAttPriority 
{
	final int a = 1;
	@Test(priority = a)
	public void register()
	{
		//System.out.println("User is able to register");
		Reporter.log("User is able to register",true);
	}
	
	@Test(priority = 2)
	public void login()
	{
		//System.out.println("User is able to login");
		Reporter.log("User is able to login",true);
	}
	
	@Test(priority = 3)
	public void search()
	{
		//System.out.println("User is able to search product");
		Reporter.log("User is able to search product",true);
	}
	
	@Test(priority = 4)
	public void wishlist()
	{
		//System.out.println("User is able to add product");
		Reporter.log("User is able to add product to wishlist",true);
	}
	
	@Test(priority = 5)
	public void cart()
	{
		//System.out.println("User is able to add product");
		Reporter.log("User is able to add product",true);
	}
	
	@Test(priority = 6)
	public void logout()
	{
		//System.out.println("User is able to add product");
		Reporter.log("User is able to logout",true);
	}
}
