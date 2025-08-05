package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class explicitwait {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("television");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='Pke_EE']"))).submit();
			
		}

		//driver.findElement(By.xpath("//input[@class='Pke_EE']")).click();
	}


