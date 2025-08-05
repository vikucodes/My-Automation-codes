package Tutorial_ninja_project.Framework_final;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tutorialninja.qa.base.Base;

public class Register extends Base {

	WebDriver driver;

	public Register() {
		super();
	}

	@BeforeMethod

	public void setup() {
		driver = initializeBrowserAndOpenApplicationUrl(prop.getProperty("browser"));
		driver.findElement(By.xpath("//span[text()='My Account']")).click();

		driver.findElement(By.linkText("Register")).click();

	}

	@AfterMethod

	public void teardown() {

		driver.quit();
	}

	@Test()

	public void accountregister() {

		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("QA");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("demor12@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("7894561236");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("78945");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("78945");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();

		// Assert.assertTrue(driver.findElement(By.linkText("Edit your account
		// information")).isDisplayed());

	}

}
