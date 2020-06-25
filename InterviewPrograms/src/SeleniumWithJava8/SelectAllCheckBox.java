package SeleniumWithJava8;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckBox {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		List<WebElement> boxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		boxes.stream().forEach(box->box.click());
		Thread.sleep(5000);
		driver.quit();
	}

}
