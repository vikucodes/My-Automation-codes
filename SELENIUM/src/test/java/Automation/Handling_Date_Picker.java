package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Date_Picker {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
        
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	WebElement date=	driver.findElement(By.xpath("//input[@id='datepicker']"));
		
		//WebElement datePicker = driver.findElement(By.id("dateInput"));
		date.sendKeys("02/11/2025");
        
		date.click();
	//	driver.close();
		
		
	}

}
