package Selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDimension {
	
	@Test
	public void getLocation() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.name("email"));
		System.out.println("Height: "+logo.getRect().getHeight());
		System.out.println("Width: "+logo.getRect().getWidth());
		System.out.println("X Cordinate: "+logo.getRect().getX());
		System.out.println("Y Cordinate: "+logo.getRect().getY());
		driver.quit();
	}

}
