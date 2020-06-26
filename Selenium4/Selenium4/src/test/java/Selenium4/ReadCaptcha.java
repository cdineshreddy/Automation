package Selenium4;

import java.io.File;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

public class ReadCaptcha {

	public static void main(String[] args) throws Exception {
			
			Runtime.getRuntime().exec("taskkill /im chromedriver.exe /f");
			WebDriverManager.chromedriver().setup();
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.get("https://www.irctc.co.in/nget/train-search");
			driver.manage().window().maximize();
			
			try{
			WebElement alert = driver.findElement(By.xpath("//button[text()='Ok']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", alert);
			alert.click();
			}catch(NoSuchElementException e){
				System.out.println("No alert is displayed");
			}
			
			driver.findElement(By.xpath("//a[contains(text(),'LOGIN')]")).click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("nlpLoader")));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@src,'image/png')]")));
			File src = driver.findElement(By.xpath("//img[contains(@src,'image/png')]")).getScreenshotAs(OutputType.FILE);
			String path = System.getProperty("user.dir")+"/Screenshots/captcha.png";
			FileHandler.copy(src, new File(path));
			ITesseract image = new Tesseract();
			String imageText = image.doOCR(new File(path));
			//System.out.println("Text available in the Captcha is: "+imageText);
			String finalText = imageText.split("below")[1].replaceAll("[^a-zA-Z0-9]", "");
			driver.findElement(By.id("nlpAnswer")).sendKeys(finalText);
			Thread.sleep(5000);
			driver.quit();
	}

}
