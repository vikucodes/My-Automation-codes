package Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement dropdownele=	driver.findElement(By.xpath("//select[@id='country']]"));
	dropdownele.click();
	Select dropdown=new Select(dropdownele);
	dropdown.selectByVisibleText("China");
	//dropdown.deselectByValue("China");
	//
	 List <WebElement>options=dropdown.getOptions();
	 Thread.sleep(3000);
	 System.out.println(options.size());
	 
	Thread.sleep(2000);
      driver.quit();
	
	
	

	}

}
