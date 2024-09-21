package Selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AuthenticationHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		int linkCount = driver.findElements(By.xpath("//a")).size();
		System.out.println(linkCount);

	}

}
