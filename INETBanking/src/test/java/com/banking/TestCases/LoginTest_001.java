package com.banking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.banking.PageObjects.LoginPage;
import com.banking.Utilities.CommonUtils;

public class LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws Exception {
	
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		logger.info("Configured Username");
		lp.setPassword(password);
		logger.info("Configured Password");
		lp.clickSubmit();	
		
		if (driver.getTitle().contains("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
			CommonUtils.verifyLinks();
		} else {
			captureScreenshot(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login Test Failed");
		}

	}

}
