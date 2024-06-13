package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class FindRideRead {

Properties pro;
	
	//create the constructor
	public FindRideRead() {
	//configure the properties file
		File f=new File("D:\\Selenium WorkSpace\\ShareCar_Project\\PropertiesFile\\FindRide.properties");
		
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
}
