package BaseClasses;

import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.OfferRide;
import PageObjects.OfferrideStep_2;

public class OfferrideStep_2TestCase extends LoginBaseclass {

	
	@Test
	public void offerridestep2() {
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
		
		OfferrideStep_2 or2=new OfferrideStep_2(driver);
		or2.step2();
      or2.setHU(HYD_UPPAL);
       //or2.setdate(date);
       //or2.settime(time);
       or2.setUD(UPPA_DEl);
       or2.setHD(HYD_DEL);
       or2.setduppal(DEL_UPP);
       //or2.setredate(redate);
       //or2.setretime(retime);
       or2.setuppalhy(UPP_HYD);
       or2.setdelhyder(DEL_HYD);
       or2.setdescription(descriptio);
       or2.select();
       or2.publish();
	}

}
