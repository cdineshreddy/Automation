package com.banking.TestCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.banking.Utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig config=new ReadConfig();
	public String baseURL=config.getApplicationUrl();
	public String username=config.getUsername();
	public String password=config.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br) {

		logger = Logger.getLogger("Banking");
		PropertyConfigurator.configure("log4j.properties");

		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", config.getChromePath());
			driver = new ChromeDriver();
		} else if (br.equals("edge")) {
			System.setProperty("webdriver.edge.driver", config.getEdgePath());
			driver = new EdgeDriver();
		}

	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
