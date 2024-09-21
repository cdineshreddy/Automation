package Actions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		Actions action = new Actions(driver);
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		action.sendKeys(Keys.TAB)
				   .pause(Duration.ofSeconds(2))
				  .sendKeys("WebDriver")
				  .sendKeys(Keys.TAB)
				  .pause(Duration.ofSeconds(2))
				  .sendKeys("576567565")
				  .sendKeys(Keys.ENTER)
				  .build().perform();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
