package workingWithUnitTestngTool;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataprovider 
{
	@DataProvider(name="testData")
	public String[][] getData()
	{
		String[][] data= new String[2][5];
		
		data[0][0] = "Sachitha";
		data[0][1] = "Raju";
		data[0][2] = "123456";
		data[0][3] = "123456";
		data[0][4] = "brsachitha123@gmail.com";
		
		data[1][0] = "samudran";
		data[1][1] = "Rajan";
		data[1][2] = "123456";
		data[1][3] = "123456";
		data[1][4] = "brsachitha7233@gmail.com";

 		
		return data;	
	}
	
	@Test(dataProvider = "testData")
	public void dataDemo(String first_name, String last_name,String password, String confirm_password, String email)
	{
		System.out.println(first_name);
		System.out.println(last_name);
		System.out.println(password);
		System.out.println(confirm_password);
		System.out.println(email);
	}
}
