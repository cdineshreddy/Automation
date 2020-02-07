package MercuryTours.MercuryTours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public WebDriver driver=null;
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using = "//a[text()='REGISTER']")
	public WebElement registerLink;
	
	@FindBy(name="firstName")
	public WebElement firstName;
	
	@FindBy(name="lastName")
	public WebElement lastName;
	
	@FindBy(name="phone")
	public WebElement phone;
	
	@FindBy(name="address1")
	public WebElement address;
	
	@FindBy(name="city")
	public WebElement city;
	
	@FindBy(name="state")
	public WebElement state;
	
	@FindBy(name="postalCode")
	public WebElement postalCode;
	
	@FindBy(name="country")
	public WebElement country;
	
	@FindBy(name="email")
	public WebElement username;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(name="confirmPassword")
	public WebElement confirmPassword;
	
	
	
	

}
