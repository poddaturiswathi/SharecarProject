package PageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OfferRide {
	
	WebDriver driver;
	public OfferRide(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//a[text()='Offer Ride']")
	WebElement btnofferride;
	
	@FindBy(xpath="//input[@id='from_location']")
	WebElement txtstrtlocation;


	@FindBy(xpath="//input[@id='to_location']")
	WebElement txtdestinationlocation;


	@FindBy(xpath="//a[@id='add_pickup_point']")
	WebElement btnaddpickuppoint;
	
	@FindBy(xpath="//input[@id='pickup_point_4']")
	WebElement txtpickuppoint;

	@FindBy(xpath="//input[@id='onward_date']")
	WebElement txtonwarddate;
	
	@FindBy(xpath="//input[@id='onward_time']")
	WebElement txtonwardtime;
	
	@FindBy(xpath="//input[@id='return_date']")
	WebElement txtreturndate;
	
	@FindBy(xpath="//input[@id='return_time']")
	WebElement txtreturntime;
	
	@FindBy(xpath="//a[@id='next_btn']")
	WebElement btnsave;
	
	
	public void offerride() {
		btnofferride.click();
	}
	
	public void setstrtloc(String strtloc) {
		txtstrtlocation.sendKeys(strtloc);
	}
	
	public void setdestiloc(String destiloc) {
		txtdestinationlocation.sendKeys(destiloc);
	}
	public void addpickuppoint() {
		btnaddpickuppoint.click();
	}
	public void setpickup(String pickuppoint) {
		txtpickuppoint.sendKeys(pickuppoint);
	}
	public void setonwardDate(String OnWarddate) {
		txtonwarddate.sendKeys(OnWarddate);
	}
	
	public void setonwardtime(String OnWardtime) {
		txtonwardtime.sendKeys(OnWardtime);
	}
	
	public void setreturndate(String ReturnDate) {
		txtreturndate.sendKeys(ReturnDate);
	}
	
	public void setreturntime(String Returntime) {
		txtreturntime.sendKeys(Returntime);
	}
	
	public void savebutton() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", btnsave);
		btnsave.click();
	}
}
