package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OfferrideStep_2 {

	WebDriver driver;
	public OfferrideStep_2(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//small[@id='tab_2']")
	WebElement btnStep2;
	
	@FindBy(xpath="//*[@id=\"ride-form-2\"]/div[1]/div[1]/div[4]/div/input")
	WebElement HY_UP_Price ;
	
	@FindBy(xpath="//*[@id=\"dates10102\"]")
	WebElement date;
	
	@FindBy(xpath="//*[@id=\"times10102\"]")
	WebElement time;
	
	@FindBy(xpath="//*[@id=\"ride-form-2\"]/div[1]/div[2]/div[4]/div/input")
	WebElement UP_Dh_Price ;
	
	@FindBy(xpath="//*[@id=\"ride-form-2\"]/div[1]/div[3]/div[4]/div/input")
	WebElement HY_DH_Price ;
	
	@FindBy(xpath="//*[@id=\"ride-form-2\"]/div[2]/div[1]/div[4]/div/input")
	WebElement dh_up_Price ;
	
	@FindBy(xpath="//*[@id=\"round_dates10104\"]")
	WebElement redate;
	
	@FindBy(xpath="//*[@id=\"round_times10104\"]")
	WebElement retime;
	
	@FindBy(xpath="//*[@id=\"ride-form-2\"]/div[2]/div[2]/div[4]/div/input")
	WebElement up_hy_Price ;
	
	@FindBy(xpath="//*[@id=\"ride-form-2\"]/div[2]/div[3]/div[4]/div/input")
	WebElement Dh_hy_Price ;
	
	
	@FindBy(xpath="//textarea[@id='rideDescription']")
	WebElement Description ;
	
	
	@FindBy(xpath="//div[@class=\"form-group cf\"]/ul/li[1]/div/label")
	WebElement SeatTypeCheckbox;
	
	@FindBy(xpath="//button[@id='publish']")
	WebElement btnpublish ;
	
    public void step2() {
		
	btnStep2.click();
	}
    
	public void setHU(String hpupprice) {
		HY_UP_Price.clear();
		HY_UP_Price.sendKeys(hpupprice);
	}
	public void setdate(String DATE) {
		date.sendKeys(DATE);
	}
	public void settime(String TIME) {
		time.sendKeys(TIME);
	}
	
	public void setUD(String updhprice) {
		UP_Dh_Price.clear();
		UP_Dh_Price.sendKeys(updhprice);
	}
	
	public void setHD(String hdprice) {
		HY_DH_Price.clear();
		HY_DH_Price.sendKeys(hdprice);
	}
	
	public void setduppal(String duppalprice) {
		dh_up_Price.clear();
		dh_up_Price.sendKeys(duppalprice);
		
	}
	
	public void setredate(String REDATE) {
		redate.sendKeys(REDATE);
	}
	public void setretime(String RETIME) {
		retime.sendKeys(RETIME);
	}
	public void setuppalhy(String uppalhyprice) {
		up_hy_Price.clear();
		up_hy_Price.sendKeys(uppalhyprice);
	}
	public void setdelhyder(String delhyderprice) {
		Dh_hy_Price.clear();
		Dh_hy_Price.sendKeys(delhyderprice);
	}
	
	public void setdescription(String description) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", Description);
		Description.sendKeys(description);
	}
	
	public void select() {
		
		SeatTypeCheckbox.click();
	}
	
	public void publish() {
		btnpublish.click();
	}
}
