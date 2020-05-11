package com.banking.TestCases;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.banking.PageObjects.LoginPage;
import com.banking.Utilities.ExcelUtils;

public class LoginTest_002 extends BaseClass{
	
	@Test(dataProvider="LoginData")
	public void loginTestDDT(String uname, String pwd) throws Exception {
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(uname);
		logger.info("Username is provided");
		lp.setPassword(pwd);
		logger.info("Password is Provided");
		lp.clickSubmit();
		Thread.sleep(3000);
		
		if(isAlertPresent()==true) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login Failed");
		}else {
			Assert.assertTrue(true);
			lp.clickLogOut();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			logger.info("Login Successful");
		}
	}
	
	
	public boolean isAlertPresent() {
		try {
		driver.switchTo().alert();
		return true;
		}catch(NoAlertPresentException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	@DataProvider(name="LoginData")
	String[][] getData() throws Exception{
		
		String path=System.getProperty("user.dir")+"/src/test/java/com/banking/TestData/TestData.xls";
		int rowNum=ExcelUtils.getRowCount(path, "Banking");
		int cellNum=ExcelUtils.getCellCount(path, "Banking", 1);
		
		String[][] loginData=new String[rowNum][cellNum];
		for(int i=1;i<rowNum;i++) {
			for(int j=0;j<cellNum;j++) {
				loginData[i-1][j]=ExcelUtils.getData(path, "Banking", i, j);
				
			}
		}
		return loginData;
	}

}
