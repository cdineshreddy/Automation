package MercuryTours.MercuryTours;

import org.testng.annotations.Test;

public class LoginValidation extends BaseClass{
	
	@Test(priority=1)
	public void validateSignIn() throws Exception {
		
		SignInPage signIn=new SignInPage(driver);
		signIn.signIn();
		signIn.signOut();
		
	}
	
	
	
}
