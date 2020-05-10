package com.banking.Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class Reporting extends TestListenerAdapter{
	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
	
	public void onStart(ITestContext textContext) {
		String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repName="Test-Report-"+timeStamp+".html";
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/"+repName);
		htmlReporter.loadXMLConfig(System.getProperty("user.dir")+ "/extent-config.xml");
		
		extent =new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host name", "localhost");
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("user", "Dinesh");
		
		htmlReporter.config().setDocumentTitle("Banking Project");//title of the report
		htmlReporter.config().setReportName("Functional Test Report");//name of the report
		htmlReporter.config().setTheme(Theme.DARK);
		
	}
	
	public void onTestSuccess(ITestResult tr) {
		logger=extent.createTest(tr.getName());//create new entry in the report
		logger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));//send the passed information
		
	}
	
	public void onTestFailure(ITestResult tr) {
		logger =extent.createTest(tr.getName());
		logger.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
		String screenshotpath=System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png";
		File f=new File(screenshotpath);
		if(f.exists()) {
			try {
				logger.fail("Screenshot is below: "+logger.addScreenCaptureFromPath(screenshotpath));
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public void onTestSkipped(ITestResult tr) {
		logger=extent.createTest(tr.getName());//create new entry in the report
		logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
	}
	
	public void onFinish(ITestContext textContext) {
		extent.flush();
	}

}
