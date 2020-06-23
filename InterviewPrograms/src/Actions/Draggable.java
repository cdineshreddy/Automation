package Actions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");
		
		Actions action = new Actions(driver);
		WebElement frameName = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameName);
		WebElement src = driver.findElement(By.xpath("//text()[contains(.,'Drag me around')]/ancestor::div[1]"));
		action.dragAndDropBy(src, 300, 120).build().perform();
		Thread.sleep(5000);
		driver.quit();
	}

}
