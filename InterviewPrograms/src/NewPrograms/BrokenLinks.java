package NewPrograms;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class BrokenLinks {

	public static void verifyLink(URL url) throws Exception {

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setConnectTimeout(2000);
		connection.connect();
		String response = connection.getResponseMessage();
		if (connection.getResponseCode() == 200) {
			System.out.println(url + ": " + response);
		}

	}

	public static void main(String[] args) throws Exception {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-infobars");
		System.setProperty("webdriver.chrome.driver", "E:\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com");
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("return document.readyState").toString().equals("complete");
		System.out.println("The page is loaded successfully");
		
		List<String> finalList = new ArrayList<String>();
		List<WebElement> element = driver.findElements(By.tagName("a"));
		for (WebElement link : element) {
			String url = link.getText();
			verifyLink(new URL(link.getAttribute("href")));
			if (url != null) {
				finalList.add(url);
			}
		}
		Iterator<String> itr = finalList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		driver.quit();
	}

}
