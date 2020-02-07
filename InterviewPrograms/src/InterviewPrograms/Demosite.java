package InterviewPrograms;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demosite {
	
	WebDriver driver;
	Alert alert;
	String Window=null;;
	
	@BeforeMethod
	public void IntiateBrowser()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://executeautomation.com/demosite/Login.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
	@Test
	public void verifyLoginPage()
	{
		driver.findElement(By.name("UserName")).sendKeys("Test");
		driver.findElement(By.name("Password")).sendKeys("Test123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String userform=driver.findElement(By.xpath("//h2[contains(text(),'User Form')]")).getText();
		Assert.assertEquals(userform, "User Form");
		System.out.println("Successfully Login verified");
	}
	
	@Test(enabled=false)
	public void getCountryNames() throws Throwable
	{
		driver.findElement(By.name("UserName")).sendKeys("Test");
		driver.findElement(By.name("Password")).sendKeys("Test123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'HtmlPopup')]")).click();
		Thread.sleep(5000);
		String parent_window=driver.getWindowHandle();
		Set<String> child_window=driver.getWindowHandles();
		Iterator<String> iterator=child_window.iterator();
		while(iterator.hasNext())
		{
			Window=iterator.next();
		}

		driver.switchTo().window(Window);
		System.out.println(Window);
		driver.manage().window().maximize();
		Select countryName=new Select(driver.findElement(By.name("Country")));
		List<WebElement> allOptions=countryName.getOptions();
				for(WebElement s:allOptions)
				{
					System.out.println(s.getText());
				}
		driver.close();
		
	
		
		driver.switchTo().window(parent_window);
		driver.findElement(By.xpath("//span[contains(text(),'Drag and Drop')]")).click();
		Thread.sleep(5000);
	}
	
	@Test(enabled=false)
	public void verifyCheckboxes() throws Throwable
	{
		driver.findElement(By.name("UserName")).sendKeys("Test");
		driver.findElement(By.name("Password")).sendKeys("Test123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		boolean checkHindi=driver.findElement(By.name("Hindi")).isSelected();
		if(checkHindi)
		{
			System.out.println("Check box is already selected");
		}
		else
		{
			Thread.sleep(5000);
			driver.findElement(By.name("Hindi")).click();
		}
	}
	
	@Test(dependsOnMethods="verifyLoginPage")
	public void verifyAlert() throws Throwable
	{
		driver.findElement(By.name("UserName")).sendKeys("Test");
		driver.findElement(By.name("Password")).sendKeys("Test123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.name("generate")).click();
		Thread.sleep(5000);
		alert=driver.switchTo().alert();
		alert.dismiss();
		alert.getText();
				
	}

}
