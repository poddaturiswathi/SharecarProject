package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Find_Ride {
	WebDriver driver;
	public Find_Ride(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);	
	}
	
	
}
