package FileDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadUsingFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		FirefoxProfile profile = new FirefoxProfile();
		//https://www.sitepoint.com/mime-types-complete-list/
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain");
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);
		WebDriver driver =new FirefoxDriver(option);
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("textbox")).sendKeys("Testing...........");
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click();
		driver.quit();
		
	}

}
