package com.banking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.banking.PageObjects.LoginPage;

public class LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() {
		driver.get(baseURL);
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
		} else {
			Assert.assertTrue(false);
			logger.info("Login Test Failed");
		}

	}

}
