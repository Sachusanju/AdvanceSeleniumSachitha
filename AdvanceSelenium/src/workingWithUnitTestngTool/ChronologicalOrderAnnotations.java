package workingWithUnitTestngTool;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologicalOrderAnnotations {

	
	@Test
	public void run()
	{
		Reporter.log("I am run",true);
	}
	
	@Test
	public void test()
	{
		Reporter.log("I am test",true);
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("I am before Suite",true);
	}
	
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("I am After Suite",true);
	}
	
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("I am Before Test",true);
	}
	
	@AfterTest
	public void afterTest()
	{
		Reporter.log("I am after Test",true);
	}
	
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("I am Before Class",true);
	}
	
	@AfterClass
	public void afterClass()
	{
		Reporter.log("I am after Class",true);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("I am before method",true);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("I am after method",true);
	}
	
}
