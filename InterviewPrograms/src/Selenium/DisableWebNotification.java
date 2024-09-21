package Selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableWebNotification {

	static ChromeDriver driver;

	static void displayPopup() {

		try {
			WebElement popUp = driver.findElement(By.xpath("(//div[@id='modal-close'])[2]"));
			if (popUp.isDisplayed()) {
				driver.findElement(By.xpath("(//div[@id='modal-close'])[2]")).click();
				System.out.println("Pop up window got closed");
			}
		} catch (Exception e) {
			System.out.println("No pop up is displayed");
		}

	}

	static void images() {

		int imageCount = driver.findElements(By.xpath("//div[@class='BigBanner']/ul[2]/li")).size();
		for (int i = 1; i <= imageCount; i++) {
			WebElement image = driver.findElement(By.xpath("//div[@class='BigBanner']/ul[2]/li[" + i + "]//img"));
			System.out.println(image.getAttribute("alt"));
		}

	}

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.driver.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.get("https://www.icicibank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		displayPopup();
		System.out.println("Fetching all the image details from ICICI bank home page");
		images();

		Thread.sleep(5000);
		driver.quit();

	}

}
