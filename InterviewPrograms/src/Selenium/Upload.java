package Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("//input[@type='file'][@id='imagesrc']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", button);
		Runtime.getRuntime().exec("D:\\Auto IT\\FileUpload.exe"+" "+"C:\\Users\\dines\\Documents\\RentReceipt.pdf");
		driver.quit();
		
	}

}
