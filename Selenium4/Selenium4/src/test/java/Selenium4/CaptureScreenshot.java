package Selenium4;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshot {
	
	@Test
	public void screenshotTest() throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.xpath("//div[@class='menu_login_container rfloat _ohf']"));
		File file=logo.getScreenshotAs(OutputType.FILE);
		String destFile=System.getProperty("user.dir")+"/Screenshots/logo.png";
		FileUtils.copyFile(file, new File(destFile));
		driver.quit();
	}

}
