package listeners;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println(result.getName()+" test case is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
		System.out.println(result.getName() + " Test Executed success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println(result.getName()+" Test case failure");
		TakesScreenshot ts = (TakesScreenshot)DemoLogin.driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("E:\\eclipse-workspace\\AdvanceSelenium\\errorShots\\webpage.png");
		try {
			FileHandler.copy(from, to);
			System.out.println("Screenshot taken");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}
