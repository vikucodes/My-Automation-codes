package testCases;


import org.testng.Assert;

import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {

	@Test
	public void verify_account_registration() {

		
		logger.info("****Starting TC001_AccountRegistrationTest**** ");
		try {
		HomePage hp = new HomePage(driver);
		hp.clickMyaccount();
		logger.info("clicked on Register Link");
		hp.clickRegister();
logger.info("**providing details***");
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		regpage.enterFirstName(randomeString().toUpperCase());
		regpage.enterLastName(randomeString().toUpperCase());
		regpage.enterEmail(randomeString() + "gmail.com");
		regpage.enterTelephone(randomeNumber());
		regpage.enterPassword("CDF123");
		regpage.enterConfirmPassword("CDF123");

		regpage.acceptPrivacyPolicy();
		regpage.clickContinue();
        logger.info("Validating confirmation msg");
		String confmsg = regpage.getConfirmationHeader();
		Assert.assertEquals(confmsg, "Register Account");
	
	}
		
		catch(Exception e) {
			logger.info("Test Failed");
			logger.debug("Debug Logs");
			Assert.fail();
		}
	logger.info("***Test completed TC001_AccountRegistrationTest****");
}
}