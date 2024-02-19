package workingWithUnitTestngTool;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basic //test case id
{
	@Test//core annotations
	public void demo()//test case
	{
		//Step1:
		
		//Step2:
		System.out.println("Hello testNg");
		Reporter.log("Hello testng",true);
	}
	
	@Test
	public void login()
	{
		System.out.println("User is able to login");
		Reporter.log("User is able to login",true);
	}
	
	@Test
	public void register()
	{
		System.out.println("User is able to register");
		Reporter.log("User is able to register",true);
	}
	
	@Test
	public void cart()
	{
		System.out.println("User is able to add product");
		Reporter.log("User is able to add product",true);
	}
}
