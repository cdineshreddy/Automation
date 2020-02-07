package MercuryTours.MercuryTours;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.Status;

public class SignInPage extends BaseClass{
	
	WebDriver driver=null;
	
	public SignInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="userName")
	public WebElement uname;
	
	@FindBy(name="password")
	public WebElement pass;
	
	@FindBy(name="login")
	public WebElement submitBtn;
	
	@FindBy(how=How.XPATH, using="//a[text()='SIGN-OFF']")
	public WebElement signOffLink;
	
	
	public void signIn() throws Exception {
	
		try {
			
			WebDriverWait wait=new WebDriverWait(driver,60);
			wait.until(ExpectedConditions.visibilityOf(uname));
			logger.log(Status.INFO, "Configuring the Username");
			uname.sendKeys(username);
			logger.log(Status.INFO, "Configuring the Password");
			pass.sendKeys(password);
			logger.log(Status.INFO, "Clicking on the Submit button");
			submitBtn.click();
			wait.until(ExpectedConditions.visibilityOf(signOffLink));
			TestUtils.validatePageUrl(driver, "http://newtours.demoaut.com/mercuryreservation.php");			
			
		}
		catch(Exception e){
			logger.log(Status.ERROR, "Unable to Login to the Page");
			CommonUtils.captureScreenShot(driver);
			System.out.println(e.getMessage());
			System.out.println(e.getCause().toString());
			throw new Exception();
					
		}
		
	}
	
	public void signOut() throws Exception {
		
		try {
			signOffLink.click();
			logger.log(Status.INFO, "Clicked on the Sign Off link");
			TestUtils.validatePageUrl(driver, "http://newtours.demoaut.com/mercurysignon.php");
			logger.log(Status.INFO, "Successfully logged out of the Application");			
		}
		catch(Exception e) {
			logger.log(Status.ERROR, "Unable to Sign out of the Application");
			CommonUtils.captureScreenShot(driver);
			throw new Exception();
		}
	}

}
