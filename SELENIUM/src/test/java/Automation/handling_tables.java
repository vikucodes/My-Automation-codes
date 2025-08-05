package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_tables {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	WebElement value=	driver.findElement(By.xpath("//tbody/tr[4]/td[3]"));
	
	System.out.println(value.getText());
	
	driver.quit();

	}

}
