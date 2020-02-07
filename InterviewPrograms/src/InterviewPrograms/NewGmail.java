package InterviewPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewGmail {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@id='link-signup']/a")).click();
		driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")).click();
		driver.findElement(By.xpath(".//*[@id=':9']/div")).click();
		driver.findElement(By.xpath("//div[@id='Gender']/div")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Male')]")).click();
		driver.findElement(By.xpath(".//*[@id='phone-form-element']/table/tbody/tr/th/div")).click();
		driver.findElement(By.xpath(".//*[@id=':7q']/div/div/span[1]")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		String s= driver.findElement(By.xpath(".//*[@id='RecoveryPhoneNumber']")).getText();
		System.out.println(s);
		driver.close();
	}

}
