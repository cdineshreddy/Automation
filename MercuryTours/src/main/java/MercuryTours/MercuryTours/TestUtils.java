package MercuryTours.MercuryTours;


import java.util.Random;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;

public class TestUtils extends BaseClass {
	
    static String randomString(int count) {
		
		String testString="abcdefghijklmnopqrstuvwxyz";
		StringBuilder builder=new StringBuilder();
		while(count!=0) {
			int character=(int)(Math.random()*testString.length());
			builder.append(testString.charAt(character));
		}
		return builder.toString();		
	}
	
	static String randomNumber(int length) {
		
		Random random=new Random();
		String number="1234567890";
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<number.length();i++) {
			int no=random.nextInt(number.length());
			builder.append(number.charAt(no));
		}
		return builder.toString();
	}
	
	static String uniqueNumber() {
		return randomNumber(10);
	}

	static boolean validatePageUrl(WebDriver driver,String expectedUrl) throws Exception {
		
		try {
			if(driver.getCurrentUrl().contains(expectedUrl)) {
				logger.log(Status.INFO, "Navigated to the Expected Page");
			}else {
				logger.log(Status.ERROR, "Navigated to the different Page");
				throw new Exception();
			}
			
		}
		catch(Exception e) {
			logger.log(Status.ERROR,"Unable to validate the Page URL");
			CommonUtils.captureScreenShot(driver);
			logger.log(Status.ERROR, e.getMessage());
			logger.log(Status.ERROR, e.getCause().toString());
			throw new Exception();			
		}
		return true;
		
	}
}
