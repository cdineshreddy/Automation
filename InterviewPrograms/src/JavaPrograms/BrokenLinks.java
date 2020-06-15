package JavaPrograms;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLinks {

	public static void verifyLink(URL url) throws Exception {

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setConnectTimeout(2000);
		connection.connect();
		int response = connection.getResponseCode();
		if (response == 200) {
			System.out.println(url + ": is valid");
		}else {
			System.out.println(url + ": is invalid");
		}

	}

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("return document.readyState").toString().equals("complete");
		System.out.println("The page is loaded successfully");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links available: " + links.size());
		for (WebElement link : links) {
			verifyLink(new URL(link.getAttribute("href")));

		}

		driver.quit();
	}

}
