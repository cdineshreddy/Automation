package InterviewPrograms;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindows {
	
	 WebDriver driver;
	
	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[contains(text(),'Open New Tabbed Windows')]")).click();
		driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
		Thread.sleep(5000);
		Set<String> childWindow = driver.getWindowHandles();
		for (String window : childWindow) {
			String win = driver.switchTo().window(window).getTitle();
			System.out.println(win);

		}
		driver.quit();
	}
}
	
