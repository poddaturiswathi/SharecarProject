package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadingData {
Properties pro;
	
	//create the constructor
	public ReadingData() {
	//configure the properties file
		File f=new File("D:\\Selenium WorkSpace\\ShareCar_Project\\PropertiesFile\\sharecarlogin.properties");
		
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
	
		public String getSharecarUrl() {
			String sharecarURL=pro.getProperty("url");
			return sharecarURL;
		}
		
		public String getemail() {
			String sharecaremail=pro.getProperty("email1");
			return sharecaremail;
		}
		public String getpassword() {
			String sharecarpass=pro.getProperty("password1");
			return sharecarpass;
		}
}
