package testCases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass{
	
	@Test(groups= {"sanity"})
	
	public void verifyLogin() {
		
		logger.info("***Starting TC002_LoginTest***");
		try {
			
		
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setEmail(p.getProperty("email"));
		lp.setpass(p.getProperty("password"));
		
		lp.clickLogin();
		
		//myAccount
		
		MyAccountPage ma=new MyAccountPage(driver);
		
	boolean targetpage=	ma.myAccountisExist();
	
	//Assert.assertEquals(targetpage, true);
	Assert.assertTrue(targetpage);
		}
		catch (Exception e) {
			
			Assert.fail();
		}
		
	}

}
