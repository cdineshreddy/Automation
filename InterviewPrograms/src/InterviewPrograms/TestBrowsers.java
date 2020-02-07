package InterviewPrograms;

import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBrowsers {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		 FirefoxDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("http://test:test123@www.engprod-charter.net");
		 //Runtime.getRuntime().exec("G:\\Selenium\\Pop_Up.exe");
		 Thread.sleep(5000);
	}

}
