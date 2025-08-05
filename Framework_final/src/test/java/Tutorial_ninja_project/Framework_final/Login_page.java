package Tutorial_ninja_project.Framework_final;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.totorialninja.qa.pages.Home;
import com.totorialninja.qa.pages.loginpage;
import com.tutorialninja.qa.base.Base;

public class Login_page extends Base {
	
	public Login_page() {
		super();
	}
	
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		//when opening in  multiple browser
		
		
		
		driver=initializeBrowserAndOpenApplicationUrl(prop.getProperty("browser"));
		Home homepage=new Home(driver);
		homepage.clickOnMyAccount();
		homepage.selectLoginOption();
		
		
	}
	
	@AfterMethod
	
	public void teardown() {
		
		driver.quit();
	}
	
	@Test(priority=1)
	
	public void loginwithvalidcredential() {
		
		loginpage lp=new loginpage(driver);
		lp.logemail(prop.getProperty("validEmail"));
		lp.logpass(prop.getProperty("validPassword"));
		lp.selectorclick();
		
		
		
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		
		
	}
	
	
	@Test(priority=2)
	
	public void loginwithinvaliddata() {
		
     
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("demo1rehi@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("12345647");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).isDisplayed());
		
	
	}

}
