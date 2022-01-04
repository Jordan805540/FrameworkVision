package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class LoginTest extends Listeners {
	
	
		
		@Test(priority = 1)
		public void loginToApp()
		{
			test.info("Entering credentials");
			lp.loginWithCredentials();
			
			test.info("Credentials entered");
			
			lp.enterpin();
			
			test.info("Pin entered");
			
		}
		
		
		
		@Test(priority = 2)
		public void validatePage()
		{
			boolean returnedvalue = lp.verifyUrl();
			System.out.println("returned value is "+returnedvalue);
			
			Assert.assertTrue(returnedvalue);
		}

	}
	


