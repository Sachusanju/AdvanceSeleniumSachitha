package workingWithUnitTestngTool;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider1 
{
	@DataProvider(name="testData")
	public String[][] getData()
	{
		String[][] data= new String[2][5];
		
		data[0][0] = "Samanyu";
		data[0][1] = "Raman";
		data[0][2] = "123456";
		data[0][3] = "123456";
		data[0][4] = "brsachitha1223@gmail.com";
		
		data[1][0] = "samudran";
		data[1][1] = "Rajan";
		data[1][2] = "123456";
		data[1][3] = "123456";
		data[1][4] = "brsachitha7233@gmail.com";

 		
		return data;	
	}
	
	@Test(dataProvider = "testData")
	public void dataDemo(String [] registerData)
	{
		System.out.println(registerData[0]);
		System.out.println(registerData[1]);
		System.out.println(registerData[2]);
		System.out.println(registerData[3]);
		System.out.println(registerData[4]);
	}
}
