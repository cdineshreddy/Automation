package MercuryTours.MercuryTours;

import java.util.concurrent.TimeUnit;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {

	static WebDriver driver = null;
	static ExtentTest logger;
	ExtentReports report = new ExtentReports();
	static String username;
	static String password;

	@BeforeClass
	public void setUp() throws Exception {

		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/ExtentReport.html");
		report.attachReporter(reporter);
		logger = report.createTest("New Tours Demo Validation");
		logger.log(Status.INFO, "Launching the URL");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(CommonUtils.readProperty("Url"));
		username = CommonUtils.readProperty("username");
		password = CommonUtils.readProperty("password");

	}

	@AfterClass
	public void closeBrowser() throws Exception {

		driver.close();
		report.flush();

		System.out.println("Sending an Email...............");
		MultiPartEmail email = new MultiPartEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("dinesh.chinakampalle@gmail.com", "9738703108"));
		email.setSSLOnConnect(true);
		email.setFrom("dinesh.chinakampalle@gmail.com", "Dinesh Reddy");
		email.setSubject("Automation Report");
		email.setMsg("Please look into the attached Extent Report");
		email.addTo("dineshreddy.c@hotmail.com");
		EmailAttachment attachment = new EmailAttachment();
		attachment.setPath("./Reports/ExtentReport.html");
		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		attachment.setDescription("Execution Report");
		attachment.setName("Automation");
		email.attach(attachment);
		email.send();

	}

}
