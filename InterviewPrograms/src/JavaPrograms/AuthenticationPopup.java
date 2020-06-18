package JavaPrograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class AuthenticationPopup {

	@Test(description = "Aproach 1")
	public void test1() {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		Assert.assertEquals(driver.getPageSource().contains("Congratulations!"), true);
		driver.close();
	}
	
	@Test
	public void test2() {
		throw new SkipException("Skipng this test");
	}

}
