package SeleniumWithJava8;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		list.forEach(name->System.out.println(name.getText()));
		
		List<String> name = list.stream().
												filter(ele->!ele.getText().equals("")).
												map(ele->ele.getText()).
												collect(Collectors.toList());
		name.forEach(ele->System.out.println(ele));
		
		String firstText = list.stream().filter(ele->!ele.getText().equals("")).findFirst().get().getText();
		System.out.println("First link on the google home page: "+firstText);
		
		List<String> names = list.stream().filter(ele->!ele.getText().isEmpty()).
																filter(ele->!ele.getText().matches("['?']")).
																map(ele->ele.getText().trim()).
																collect(Collectors.toList());
				names.forEach(ele->System.out.println(ele));
		
		driver.quit();

	}

}
