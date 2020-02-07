package InterviewPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class ActionsExample {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DINESH REDDY\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.manage().window().setSize(new Dimension(400,400));//to set the
		// bowser width and height
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-form/");
		selectAllCheckBoxes();
		selectDropDownValue("Africa");
	}

		public static void selectAllCheckBoxes() {
		List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement select : checkBox) {
			if (!select.isSelected()) {
				select.click();
			}
		}
	}
		public static String selectDropDownValue(String value){
		
			Select select=new Select(driver.findElement(By.id("continents")));
			select.selectByVisibleText(value);
			return value;
		}
	}
