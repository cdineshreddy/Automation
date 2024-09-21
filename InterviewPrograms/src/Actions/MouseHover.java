package Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.mercurytravels.co.in/");
		
		Actions action = new Actions(driver);
		driver.findElement(By.xpath("//a[text()='No, thanks']	")).click();
		WebElement name = driver.findElement(By.xpath("(//text()[contains(.,'Foreign Exchange')]/ancestor::a)[2]"));
		action.moveToElement(name).perform();
		List<WebElement> values = driver.findElements(By.xpath("//div[@id='bs-example-navbar-collapse-1']/ul/li[8]/ul/li"));
		for(WebElement value: values){
			if(value.getText().equals("Sell Forex")){
				value.click();
				break;
			}
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
