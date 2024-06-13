package BaseClasses;

import org.testng.annotations.Test;

import PageObjects.LoginPage;


public class LoginTestClass extends LoginBaseclass {


	@Test
	public void loginTest() {
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(pwd);
		lp.login();
		
	}
}
