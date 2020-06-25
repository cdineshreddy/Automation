package SeleniumWithJava8;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Good PopUp #2']")).click();
		Thread.sleep(3000);
		switchWindow(driver,"PopupTest Thursday June, 25 2020");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
	
	public static String switchWindow(WebDriver driver, String title)  {
		
									return driver.getWindowHandles()
														.stream()
														.map(childWindow->driver.switchTo().window(childWindow).getTitle())
														.filter(ele->ele.contains(title))
														.findFirst()
														.orElseThrow(()->{
															throw new NoSuchWindowException("No window available");
														});
												
	}

}
