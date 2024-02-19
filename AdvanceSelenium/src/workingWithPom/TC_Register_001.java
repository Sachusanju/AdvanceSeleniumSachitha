package workingWithPom;

import org.testng.annotations.Test;

public class TC_Register_001 extends BaseClass {
	
	@Test
	public void register() {
		RegisterPage registerPage = new RegisterPage(driver);
		//assertion and report log
		registerPage.getRegisterLink().click();
		registerPage.getFemaleRadioBotton().click();
		registerPage.getFirstNameTextBox().sendKeys("Sam");
		registerPage.getLasttNameTextBox().sendKeys("vam");
		registerPage.getEmailTextBox().sendKeys("samvam12@gmail.com");
		registerPage.getPasswordTextBox().sendKeys("123456");
		registerPage.getConfirmPasswordTextBox().sendKeys("123456");
	
		
	}

}
