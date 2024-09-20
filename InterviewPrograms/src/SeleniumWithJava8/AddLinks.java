package SeleniumWithJava8;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.freshworks.com/");
		driver.manage().window().maximize();
		
		List<String> list = new ArrayList<String>();
		List<WebElement> links = driver.findElements(By.cssSelector("ul.footer-nav li"));
		links.stream().forEach(link->list.add(link.getText()));
		list.forEach(System.out::println);
		driver.quit();
	}

}
