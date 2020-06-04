package NewPrograms;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MapExample {

	static String gmail="https://www.gmail.com";
	static String facebook="https://www.facebook.com";
	static String hotmail="https://www.hotmail.com";
	
	static HashMap<String, String> loginData() {
		HashMap<String, String> map=new HashMap<String, String>();
		map.put(gmail, "dinesh.cdr@admin");
		map.put(facebook,"test@test");
		map.put(hotmail,"login@login");
		return map;
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(facebook);
		driver.manage().window().maximize();
		String credentials = loginData().get(facebook);
		String login[] = credentials.split("@");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(login[0]);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(login[1]);
		Thread.sleep(5000);
		driver.quit();
	}

}
