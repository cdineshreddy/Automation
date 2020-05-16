package InterviewPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindLinks {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
