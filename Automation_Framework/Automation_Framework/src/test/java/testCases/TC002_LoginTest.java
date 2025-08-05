package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass{
	
	@Test
	public void verify_login()
	
	{
		
		logger.info("***Staring TC002_LoginTest***");
		
		try {
			
		
		
		HomePage hp=new HomePage(driver);
		hp.clickMyaccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword("pass");
		lp.clickLogin();
		
		MyAccountPage mp=new MyAccountPage(driver);
		boolean targerPage=mp.isMyAccountPageExist();
		
		Assert.assertEquals(targerPage, true ,"Login Failed");
		
		}catch(Exception e) {
			
			Assert.fail();
		
		
		
	}
		logger.info("**Test Finished**");
}
}