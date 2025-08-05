package pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LOgInTest {
	
	WebDriver driver;
	
	@BeforeClass
	
	void setup()
	{
		
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
	}
	
	@Test
	 void loginTest() {
		LogInPage lp=new LogInPage(driver);
		lp.setUserName("Admin");
		lp.setUserpass("admin123");
		lp.clicklogin();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	
	void tearDown() throws InterruptedException
{
	Thread.sleep(3000);	
 driver.quit();
}
}
