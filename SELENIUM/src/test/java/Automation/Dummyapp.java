package Automation;


import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dummyapp {
WebDriver driver;
	@Test(priority=0)
	public void serachfiled() {
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement sea= driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		
//		WebDriver wait=new WebDriver(driver,20);
//		WebElement Element=wait.until(Expected Conditions.VisibilityofElementLocated(By.class()));
//		Element.click();
//		wait.
		//Actions act=new Actions(driver);
		
		//act.sendKeys("laptop").build().perform();
sea.sendKeys("shoes nike");

sea.submit();
	}

 @Test (priority=1)
 
 
	 public void data() throws InterruptedException {
   driver=new ChromeDriver();
  driver.get("https://www.flipkart.com/");
  Thread.sleep(5000);
	System.out.print(driver.findElement(By.xpath("//img[@title='Flipkart']")).getAttribute("title"));
	 
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
	}
 
 @BeforeTest
 public void name() {
	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	
 }
}
