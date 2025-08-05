package Automation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_Action_Class {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	//WebElement controlA=	driver.findElement(By.xpath("//input[@id='field1']"));
 
	Actions act=new Actions(driver);
	
	/*act.moveToElement(controlA).click().perform();
	
	act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
	
	Thread.sleep(2000);
	
	String g=controlA.getText();
	System.out.println(g);
	
	
	Thread.sleep(5000);*/
	
	//open a link in new tab
	
	WebElement newTab=driver.findElement(By.xpath("//button[normalize-space()='New Tab']"));
	
	act.keyDown(Keys.CONTROL).click(newTab).keyUp(Keys.CONTROL).perform();
	
	Thread.sleep(2000);
	
	List<String> ids=new ArrayList<String>(driver.getWindowHandles());
	
	
	driver.switchTo().window(ids.get(1));
	
	//driver.quit();
		

	}

}
