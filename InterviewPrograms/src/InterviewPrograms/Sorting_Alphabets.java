package InterviewPrograms;


import java.util.Arrays;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sorting_Alphabets {

	public static void main(String[] args) {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		Select country = new Select(driver.findElement(By.name("country")));
		List<WebElement> name = country.getOptions();
		
		String s[]=new String[name.size()];
		int i=0;
		for (WebElement option : name) {
			s[i++]=option.getText();
		}
		
		Arrays.sort(s);
		for(int j=0;j<s.length;j++) {
			System.out.println(s[j]);
		}
		
	}
	
}
