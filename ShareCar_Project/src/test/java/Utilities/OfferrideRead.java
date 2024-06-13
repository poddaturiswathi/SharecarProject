package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class OfferrideRead {

Properties pro;
	
	//create the constructor
	public OfferrideRead() {
	//configure the properties file
		File f=new File("D:\\Selenium WorkSpace\\ShareCar_Project\\PropertiesFile\\offerridestep1.properties");
		
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
	
		public String getstartloc() {
			String startloc=pro.getProperty("Startlocation");
			return startloc;
		}
		
		public String getdestloc() {
			String destloc=pro.getProperty("DestinationLocation");
			return destloc;
		}
		public String getpickup() {
			String pickupp=pro.getProperty("PickUpPoint");
			return pickupp;
		}
		public String getOnDate() {
			String OnwaDate=pro.getProperty("OnWARDDATE");
			return OnwaDate;
		}
		public String getOnTime() {
			String OnwaTime=pro.getProperty("OnWARDTIME");
			return OnwaTime;
		}
		public String getReturnDa() {
			String Returnda=pro.getProperty("Returndate");
			return Returnda;
		}
		public String getReturnti() {
			String Returntime=pro.getProperty("ReturnTime");
			return Returntime;
		}
}
