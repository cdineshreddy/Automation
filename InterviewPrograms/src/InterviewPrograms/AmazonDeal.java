package InterviewPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AmazonDeal {
	
	@Test
	public void main() {
		
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[2]")).click();		
	String dealcount = driver.findElement(By.xpath(".//*[@id='dealTotalPages']")).getText();
	System.out.println("Total deals are "+dealcount);
	Integer dealno=new Integer(dealcount);
	for(int i=0;i<=dealno-1;i++)
	{
		String text[]=new String[dealno];
		text[i] = driver.findElement(By.xpath(".//*[@id='dealTitleLink']")).getText();
		String price=driver.findElement(By.xpath(".//*[@id='dealPriceBlock']")).getText();
		System.out.println(text[i]);
		System.out.println("Offer Price is "+price);
		driver.findElement(By.xpath(".//*[@id='rightShovelBg']")).click();
	}
	driver.close();
	
	}
}
