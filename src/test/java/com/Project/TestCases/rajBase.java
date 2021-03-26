package com.Project.TestCases;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.Name.Utility.ReadConfig;

public class rajBase {
	
//                    	.\ is represents project home directory
	
	//----using properties file we can access
	
	//1st we are create one propertess file and then we can 
	//create one utilityss classs then that classs we create object to base classs
	
	/*ReadConfig rc=new ReadConfig();
	
	public String baseURL=rc.getApplicationUrl();
	public String userName=rc.Getusername();
	public String password=rc.Getpassword();
	public static WebDriver driver;
		

 
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",rc.getDriver());
		driver=new ChromeDriver();
	}
*/
// -------------using global variable we can access---------------	
	public String baseURL="http://demo.guru99.com/v4/index.php";
	public String userName="mngr316131";
	public String password="pupavUs";
	public static WebDriver driver;
	//public static Logger Logger;
	
	//@Parameters("broser")
	@BeforeClass
	public void setup() {
		
		
			/*public void setup(String br) {
				if(br.equals("chromePath")) {
			*/
		
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");	
		driver=new ChromeDriver();
				
		//Logger=Logger.getLogger("testingMaven");
	//	}
	//	else if(br.equals("firefox")) {
			
		//written code
		
		}
		
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}

