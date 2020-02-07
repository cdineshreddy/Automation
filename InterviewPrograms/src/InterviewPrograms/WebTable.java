package InterviewPrograms;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WebTable {
	
	
	@Test
	public void getTableLink()
	{

		System.setProperty("webdriver.chrome.driver", "E:\\Browser Drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://freecrm.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().frame("mainpanel");
		WebElement contact=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		WebDriverWait wait =new WebDriverWait(driver,10);
		wait.pollingEvery(5, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.elementToBeClickable(contact));
		//Actions action =new Actions(driver);
		//action.moveToElement(contact).perform();
		contact.click();
		//driver.findElement(By.xpath("//a[normalize-space(text())= 'New Contact']")).click();
		WebElement contacts=driver.findElement(By.xpath("//form[@id='vContactsForm']/table/tbody/tr"));
		List<WebElement> names=contacts.findElements(By.tagName("td"));
		for(WebElement name:names){
			System.out.println(name.getText());
		}
	}

}
