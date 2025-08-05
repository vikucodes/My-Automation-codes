package Listener;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listener.MyListeners.class) //this is another way to use listener in class
public class Demo1 {
 WebDriver driver;
	
	@BeforeClass
	
	void setup() {
		
		 driver=new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
	}
	@Test(priority=1)
	void testlogo() throws InterruptedException {
		
		Thread.sleep(3000);
	boolean status=	driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	
	Assert.assertEquals(status, true);
	System.out.println("logo displayed----"+status);
		
	}
	/*@Test(priority=2)
void testAppUrl() {
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
}*/
	
	@Test(priority=2)
	void testAppUrl() {
		
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority=3 ,dependsOnMethods= {"testAppUrl"})
	
	void testHomePageTitle()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
void tearDown() {
	
	driver.quit();
}
}


