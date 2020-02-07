package InterviewPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

public class CalendrerClick {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		departDate("31");

	}

	public static void departDate(String enterDate) {
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		// driver.findElement(By.xpath("//a[@class='nextMonth ']")).click();
		WebElement dateWidget = driver.findElement(By.xpath("//table[@class='calendar']"));
		List<WebElement> alldates = dateWidget.findElements(By.tagName("td"));
		for (WebElement dates : alldates) {
			String date = dates.getText();
			// System.out.println(date);
			if (date.equalsIgnoreCase(enterDate)) {
				dates.click();
				break;
			}

		}

	}
}
