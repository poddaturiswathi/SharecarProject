package BaseClasses;

import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.OfferRide;

public class OfferrideTestcase extends LoginBaseclass {
	
	@Test
	public void offerridestep1() {
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(pwd);
		lp.login();
		OfferRide or=new OfferRide(driver);
		or.offerride();
		or.setstrtloc(stlocation);
		or.setdestiloc(destlocation);
		or.addpickuppoint();
		or.setpickup(picklocation);
		or.setonwardDate(ONWARDDATE);
		or.setonwardtime(ONWARDTIME);
		or.setreturndate(RETURNDATE);
		or.setreturntime(RETURNTIME);
		or.savebutton();
	}

}
