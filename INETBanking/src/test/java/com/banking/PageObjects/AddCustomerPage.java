package com.banking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.banking.Utilities.CommonUtils;

public class AddCustomerPage extends CommonUtils{
	
	WebDriver driver;
	public AddCustomerPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(linkText="New Customer")
	@CacheLookup
	private WebElement linkNewCustomer;
	
	@FindBy(name="name")
	private WebElement customerName;
	
	@FindBy(name="rad1")
	private WebElement gender;
	
	@FindBy(name="dob")
	private WebElement birthDate;
	
	@FindBy(name="addr")
	private WebElement address;
	
	@FindBy(name="city")
	private WebElement cityName;
	
	@FindBy(name="state")
	private WebElement stateName;
	
	@FindBy(name="pinno")
	private WebElement pincode;
	
	@FindBy(name="telephoneno")
	private WebElement mobileNumber;
	
	@FindBy(name="emailid")
	private WebElement emailId;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(name="sub")
	private WebElement submit;
	
	public void clickAddCustomer() {
		elementVisble(linkNewCustomer, driver, 30);
		linkNewCustomer.click();
	}
	
	public void custName(String name) {
		customerName.sendKeys(name);
	}
	
	public void customerGender(String cgender) {
		elementVisble(gender, driver, 30);
		gender.click();
	}
	
	public void customerDOB(String mm,String dd, String yy) {

		birthDate.sendKeys(mm);
		birthDate.sendKeys(dd);	
		birthDate.sendKeys(yy);
	}
	
	public void custAddress(String add) {
		elementVisble(address, driver, 30);
		address.sendKeys(add);
	}
	
	public void custCity(String city) {
		cityName.sendKeys(city);
	}
	
	public void custState(String state) {
		stateName.sendKeys(state);
	}
	
	public void custPincode(String pin) {
		pincode.sendKeys(pin);
	}
	
	public void custMobile(String number) {
		mobileNumber.sendKeys(number);
	}
	
	public void custMail(String mail) {
		emailId.sendKeys(mail);
	}
	
	public void custPwd(String pass) {
		pwd.sendKeys(pass);
	}
	
	public void clickSubmit() {
		submit.click();
	}
}
