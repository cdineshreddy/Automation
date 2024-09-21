package JavaPrograms;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	 static String year = "2020";
	 static String month = "August,";
	 static String day = "19";

	static By mmXpath = By.xpath("/html[1]/body[1]/div[2]/div[1]/nav[1]/div[2]");
	static By yyXpath = By.xpath("/html[1]/body[1]/div[2]/div[1]/nav[1]/div[2]/i");
	static By next = By.xpath("//div[1]//nav[1]//div[3]//*[local-name()='svg']");
	static By date = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[contains(text()," + day + ")]");

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.net/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//input[@id='checkin']")).click();
		Thread.sleep(3000);
		while (true) {
			String mm = driver.findElement(mmXpath).getText();
			String yy = driver.findElement(yyXpath).getText();
			if (mm.contains(month) && yy.contains(year)) {
				break;
			} else {
				driver.findElement(next).click();
			}
		}
		driver.findElement(date).click();
		Thread.sleep(5000);
		driver.close();
	}

}
