package Vikas_abstarctcomponent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vikas_abstarctcomponent {

	WebDriver driver;
	
	public Vikas_abstarctcomponent(WebDriver driver) {
	
		this.driver=driver;
	}
	
	public void WaitForElementToAppear(By FindBy) {
		WebDriverWait wait=new WebDriverWait(driver ,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(FindBy));
		
	}

}
