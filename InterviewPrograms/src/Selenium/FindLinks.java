package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindLinks {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		List<WebElement> finalList=new ArrayList<WebElement>();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement link:links)
		{
			//System.out.println(link.getText().toString());
			if(link.getAttribute("href")!=null)
			{
				finalList.add(link);
				
			}
		}
		for(WebElement finalLink:finalList)
		System.out.println(finalLink.getText().toString());
	}

}
