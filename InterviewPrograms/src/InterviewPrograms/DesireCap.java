package InterviewPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesireCap {

	public static void main(String[] args) {

		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DINESH REDDY\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(dc);
		driver.get("https://cacert.org/");

	}

}
