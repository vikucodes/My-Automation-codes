package vikas_Framework.Ecommerce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StandAloneTest {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/client");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("sanju@contact.com");
		
		driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("Glassdoor@2025");
		
		driver.findElement(By.xpath("//input[@id='login']")).click();
		}

}
