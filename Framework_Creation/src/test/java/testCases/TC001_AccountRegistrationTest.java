package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccounRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {
		
@Test
public void verify_account_registration() {
	
	logger.info("***** TC001_AccountRegistrationTest ***");
	// everything is fine but there is no file creating in log folder so we have to add 
	//file log4j2 from website 
	//means see from other tutor
	
	try
	{
	HomePage hp=new HomePage(driver);
	hp.clickMyAccount();
	
	logger.info("clicked my account");
	hp.clickRegister();
	
	logger.info("clicked on register link..");
	

	AccounRegistrationPage ap=new AccounRegistrationPage(driver);
	
	logger.info("providing customer details...");
	ap.setfirstname("johnw");
	ap.setlastname("David1");
	ap.setmail("abcdef@gmail.com");
	ap.setphone("456789113365");
	ap.setcpassword("123456");
	ap.setcpassword("123456");
	ap.ticked();
	ap.done();
	}
	catch(Exception e) 
	{
	logger.error("test failed....");
	logger.debug("debug logs");
}
	logger.info("***** finished TC001_AccountRegistrationTest ***");
}

}