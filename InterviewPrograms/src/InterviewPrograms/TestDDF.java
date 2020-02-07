package InterviewPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class TestDDF {
	
	static WebDriver driver;
	
	@BeforeMethod
	public void openBrowser()
	{
		driver=new FirefoxDriver();
		System.setProperty("wedriver.gecko.driver", "G:\\Selenium\\Downloads\\geckodriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
	}
	
	@Test(dataProvider="testdata")
	public void TestFirefox(String uname, String password)
	{
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
		String expTitle="Facebook";
		String actTitle=driver.getTitle();
		//Assert.assertEquals(expTitle, actTitle);
		if(expTitle.equalsIgnoreCase(actTitle))
		{
			System.out.println("Username" +uname+ "and Password "+password +"is pass");
		}
		else
		{
			System.out.println("Username" +uname+ "and Password "+password +"is fail");
		}
			
	}
	@DataProvider(name="testdata")
	public Object[][] TestDataFeed()
	{
		Object [][] facebookdata=new Object[2][2];
		facebookdata[0][0]="dinesh@gmail.com";
		facebookdata[0][1]="Password1";
		
		facebookdata[1][0]="Selenium@gmail.com";
		facebookdata[1][1]="Password2";
		
		return facebookdata;
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
