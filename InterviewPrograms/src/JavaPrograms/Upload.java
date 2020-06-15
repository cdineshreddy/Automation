package JavaPrograms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload {

	public static void main(String[] args) throws Exception {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_fileupload_get");
		Thread.sleep(10000);
		
		WebElement iframeelement=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframeelement);
		
		WebElement element=driver.findElement(By.xpath(".//*[@id='myFile']"));
		element.click();
		Runtime.getRuntime().exec("D:\\Learning Selenium\\TestData\\FileUpload.exe");
	}

}
