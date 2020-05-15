package com.banking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.banking.PageObjects.AddCustomerPage;
import com.banking.PageObjects.LoginPage;

public class AddCustomer_003 extends BaseClass{
	
	@Test
	public void addNewCustomer() throws Exception{
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		logger.info("Username is configured");
		lp.setPassword(password);
		logger.info("Password is Configured");
		lp.clickSubmit();
		logger.info("Click on the submit button");
		
		Thread.sleep(5000);
		AddCustomerPage cp=new AddCustomerPage(driver);
		cp.clickAddCustomer();
		logger.info("Click on the Add Customer link");
		cp.custName("Dinesh");
		logger.info("Configured the Customer Name");
		cp.customerGender("male");
		cp.customerDOB("19", "10", "1985");
		logger.info("Configured the Date of Birth");
		Thread.sleep(3000);
		cp.custAddress("Bangalore");
		logger.info("Configured the Address");
		cp.custCity("Bangalore");
		logger.info("Configured the City Name");
		cp.custState("Karnataka");
		logger.info("Configured the State Name");
		cp.custPincode("560037");
		logger.info("Configured the Pincode");
		cp.custMobile(randomNumber());
		logger.info("Configured the Mobile Number");
		cp.custMail(randomString()+"@gmail.com");
		logger.info("Configured the Mail id");
		cp.custPwd("abcdef");
		logger.info("Configured the Password");
		cp.clickSubmit();
		logger.info("Click on the Submit button");
		
		Thread.sleep(3000);
		boolean result=driver.getPageSource().contains("Customer Registered Successfully!!!");
		if(result==true) {
			Assert.assertTrue(true);
			logger.info("Customer Registration completed");
		}
		else {
			captureScreenshot(driver, "addNewCustomer");
			Assert.assertTrue(false);
			logger.warn("Customer Registration failed");;
		}
	}

}
