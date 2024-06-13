package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class OfferridereadStep_2 {
Properties pro;
	
	//create the constructor
	public OfferridereadStep_2() {
	//configure the properties file
		File f=new File("D:\\Selenium WorkSpace\\ShareCar_Project\\PropertiesFile\\OfferrideraedStep-2.properties");
		
		//Converting file into the reading mode

		try 
		{
			FileInputStream fis=new FileInputStream(f);
			pro=new Properties();
			pro.load(fis);
		
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public String getHUP() {
		String HUPrice=pro.getProperty("HYD_UPP_Price");
		return HUPrice;
	}
	
	/*public String getdate() {
		String da=pro.getProperty("Date");
		return da;
	}
	public String gettime() {
		String ti=pro.getProperty("Time");
		return ti;
	}*/
	public String getUPD() {
		String UPDrice=pro.getProperty("UPP_Del_Price");
		return UPDrice;
	}
	public String getHDP() {
		String HDPrice=pro.getProperty("HYD_Del_Price");
		return HDPrice;
	}
	public String getdup() {
		String dhupPrice=pro.getProperty("dh_uppal_Price");
		return dhupPrice;
	}
	/*public String getRdate() {
		String rda=pro.getProperty("ReturnDate");
		return rda;
	}
	public String getrtime() {
		String rti=pro.getProperty("ReturnTime");
		return rti;
	}*/
	public String getuph() {
		String uphPrice=pro.getProperty("upp_hyd_Price");
		return uphPrice;
	}
	public String getdh() {
		String dhPrice=pro.getProperty("Dh_hyd_Price");
		return dhPrice;
	}
	public String getdes() {
		String descr=pro.getProperty("Description");
		return descr;
	}
	
	
}
