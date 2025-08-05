package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class asssertclass {
	WebDriver driver;
 @BeforeClass
 void setup() {
 driver=new ChromeDriver();
 driver.get("https://www.flipkart.com/");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
}
 @Test
 
 void checklogo() {
	 WebElement Logo=driver.findElement(By.xpath("//img[@title='Flipkart']"));
	 
	 Assert.assertEquals("Flipkart", "Flipkart");
 }
 @AfterClass
  void teardown() {
	 driver.quit();
 }
}