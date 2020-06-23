package Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException{
		
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
			
			Actions action = new Actions(driver);
			WebElement src = driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"));
			WebElement target = driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));
			//action.dragAndDrop(src, target).build().perform();
			action.clickAndHold(src)
					   .moveToElement(target)
					   .pause(Duration.ofSeconds(2))//it will wait for two seconds
					   .release()
					   .build()
					   .perform();
			
			Thread.sleep(5000);
			driver.close();
			
	}

}
