package BaseClasses;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Utilities.OfferrideRead;
import Utilities.OfferridereadStep_2;
import Utilities.ReadingData;


public class LoginBaseclass {

	public static WebDriver driver;

	ReadingData rd=new ReadingData();
	public String appurl=rd.getSharecarUrl();
	public String email=rd.getemail();
	public String pwd=rd.getpassword();
	
	OfferrideRead od=new OfferrideRead();
	public String stlocation=od.getstartloc();
	public String destlocation=od.getdestloc();
	public String picklocation=od.getpickup();
	public String ONWARDDATE=od.getOnDate();
	public String ONWARDTIME=od.getOnTime();
	public String RETURNDATE=od.getReturnDa();
	public String RETURNTIME=od.getReturnti();
	

	OfferridereadStep_2 od2=new OfferridereadStep_2();
	public String HYD_UPPAL=od2.getHUP();
	//public String date=od2.getdate();
	//public String time=od2.gettime();
	public String UPPA_DEl=od2.getUPD();
	public String HYD_DEL=od2.getHDP();
	public String DEL_UPP=od2.getdup();
	//public String redate=od2.getRdate();
	//public String retime=od2.getrtime();
	public String UPP_HYD=od2.getuph();
	public String DEL_HYD=od2.getdh();
	public String descriptio=od2.getdes();
	
	
	
	 public static Logger log;

	   @BeforeClass
		@Parameters("browsers")
		public void OpenApplication(String br) {
			
			if(br.equals("chrome"))
			{
			driver=new ChromeDriver();
			}
			else if(br.equals("edge")){
				driver=new EdgeDriver();

			}
			else if(br.equals("firefox")){
				driver=new FirefoxDriver();

			}
			
			driver.get(appurl);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			//./Project Home directory
			//log=Logger.getLogger("AdactinProject_Hybrid_DataDriven");
			//PropertyConfigurator.configure("./log4j.properties");


	}
}
