/*
	 * Write Script Using Hybrid Framework

https://products.ncryptedprojects.com/sharecaar/profile/213
Username: niteesh@w3softech.com
Password: w3softech



Login - Sharecaar
https://products.ncryptedprojects.com*/

package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);	
	}

	//Identify the Elements
	@FindBy(id="email")
	WebElement txtemail;
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(id="sbtLogin")
	WebElement btnlogin;
	
	//Create the Actions
	
	public void setEmail(String email) {
		txtemail.sendKeys(email);
	}
	
	public void setPassword(String pass) {
		txtpassword.sendKeys(pass);
	}
	public void login() {
		btnlogin.click();
	}
	
	
	


	
	



	 
}
