package daily_practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1_windowhandling_and_date_picker {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		/*driver.findElement(By.linkText("merrymoonmary")).click();
		
		Set<String> ids=driver.getWindowHandles();
		
		Iterator <String> it= ids.iterator();
		
		String parentid=it.next();
		String childid=it.next();
		
		System.out.println(parentid);
		
		driver.switchTo().window(childid);
		*/
		
	WebElement date_picker=	driver.findElement(By.id("datepicker"));
	
	date_picker.click();
	
	date_picker.sendKeys("05/14/2025");
	

	
	}

}
