package InterviewPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DINESH REDDY\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/index.php");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement register=driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]"));
		Actions action=new Actions(driver);
		action.keyDown(Keys.SHIFT).click(register).keyUp(Keys.SHIFT).build().perform();
		List<String> tabs=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.name("firstName")).sendKeys("Dinesh");
		WebElement support=driver.findElement(By.xpath("//a[contains(text(),'SUPPORT')]"));
		action.keyDown(Keys.SHIFT).click(support).keyUp(Keys.SHIFT).build().perform();
		driver.switchTo().window(tabs.get(2));
		String text=driver.findElement(By.xpath("//img[@src='/images/forms/home.gif']")).getText();
		System.out.println(text);
	}

}
