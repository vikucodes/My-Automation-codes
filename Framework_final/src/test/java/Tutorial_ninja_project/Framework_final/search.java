package Tutorial_ninja_project.Framework_final;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tutorialninja.qa.base.Base;

public class search extends Base {
	
	WebDriver driver;
	public search() {
		super();
	}
	@BeforeMethod
	
	public void setup() {
	
		driver=initializeBrowserAndOpenApplicationUrl(prop.getProperty("browser"));
		
		
		
	}
	
	@AfterMethod
	
	public void TearDown() {
		driver.quit();
	}
	
	@Test(priority=1)
	public void verifysearchWithValidProduct() {
		
	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("HP");
	
	driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
	
	Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
	}
@Test(priority=2)

public void invalidproduct() {
driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Honda");
	
	driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
	

	WebElement actualresult= driver.findElement(By.xpath("//p[contains(text(),'There is no product that matches the search criter')]"));
	
	Assert.assertEquals(actualresult, "There is no product that matches the search criteria.","No product in serach result is not displayed ");
		//check in next tym without sending anything in search box	
}
}
