package InterviewPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DownloadFile {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DINESH REDDY\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/yahoo.html");
		WebElement button=driver.findElement(By.id("messenger-download"));
		String srcLoc=button.getAttribute("href");
		String wget_cmd="cmd /c G:\\Selenium\\Wget\\wget.exe -P G: --no-check-certificate " + srcLoc;
		try{
			Process exec=Runtime.getRuntime().exec(wget_cmd);
			int exitVal=exec.waitFor();
			System.out.println("Exit Value :"+exitVal);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		driver.close();
	}

}
