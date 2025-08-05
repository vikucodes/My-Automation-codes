package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Brokenlinks {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Errorcode 500")).click();
		
	Thread.sleep(3000);
	
	Assert.assertTrue(true);
	
WebElement ele=	driver.findElement(By.xpath("//h2[normalize-space()='500 - Internal server error.']"));
	

System.out.println(ele.getText());

	}

}
