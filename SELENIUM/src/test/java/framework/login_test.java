package framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class login_test {
	
	WebDriver driver;
	@BeforeClass
	void setup() {
		driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	@Test
	void testLogin() {
		login_page2 lb=new login_page2(driver);
		
		lb.setupUsername("Admin");
	    lb.setpass("admin123");
	    lb.clicllogin();
		
	    Assert.assertEquals(driver.getTitle(), "orangeHRM");
}
	@AfterClass
	
	void tearDown() {
		
		driver.quit();
	}
}