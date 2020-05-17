package com.banking.Utilities;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.banking.TestCases.BaseClass;

public class CommonUtils extends BaseClass{
	
	
	public static void elementVisble(WebElement element,WebDriver driver, int time) {
		WebDriverWait wait=new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(element));
		System.out.println(element+" is availalble");
	}
	
	//This method is used to select the Drop down values
	public static void dropDownSelect(WebElement element,String text,int index,boolean selectByVisibleText, boolean selectByIndex, boolean selectByValue) throws Exception {
	try {
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(element));
		Select dd=new Select(element);
		if(selectByVisibleText==true) {
			dd.selectByVisibleText(text);
			logger.info("Drop down value is selected");
		}else if(selectByIndex==true) {
			dd.selectByIndex(index);
			logger.info("Drop down value is selected");
		}else if(selectByValue==true){
			dd.selectByValue(text);
			logger.info("Drop down value is selected");
		}
		}catch(Exception e) {
			captureScreenshot(driver, "dropDownSelect");
			logger.error("Unable to select the option from dropdown");
			logger.info(e.getMessage());
		}
	}
	
	//This method is used to verify the Broken links in a page
	public static void verifyLinks() throws Exception {
		try {

			List<WebElement> elements = driver.findElements(By.tagName("a"));
			System.out.println("Number of links available: " + elements.size());
			for (int i=0;i<elements.size();i++) {
				WebElement links = elements.get(i);
				String url=links.getAttribute("href");
				URL link = new URL(url);
				HttpURLConnection connection = (HttpURLConnection) link.openConnection();
				connection.setConnectTimeout(2000);
				connection.connect();
				int response = connection.getResponseCode();
				if (response == 200) {
					logger.info(link + ": is valid");
				} else {
					logger.info(link + ": is invalid");
				}

			}
		} catch (Exception e) {
			captureScreenshot(driver, "verifyLinks");
			logger.error("Unable to verfiy the links", e);
		}

	}
}
