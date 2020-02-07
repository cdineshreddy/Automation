package NewPrograms;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class SampleProgram {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver.get("http://www.google.com");
		String parentWindow=driver.getWindowHandle();
		Set<String>childWindow=driver.getWindowHandles();
		for(String window:childWindow) {
			if(driver.switchTo().window(window).getTitle().equalsIgnoreCase("title")) {
				
			}
			else{
				driver.switchTo().window(parentWindow);
			}
		}
		
	}
	
}