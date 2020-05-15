package com.banking.TestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(baseURL);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	public void captureScreenshot(WebDriver driver, String tname) throws IOException{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
		
	}
	
	public String randomString() {
		String generateString=RandomStringUtils.randomAlphabetic(8);
		return(generateString);
	}
	
	public String randomNumber() {
		String generateNumber=RandomStringUtils.randomNumeric(10);
		return(generateNumber);
	}
}
