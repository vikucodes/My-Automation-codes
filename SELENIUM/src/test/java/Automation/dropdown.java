package Automation;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
	WebElement dropdownele=	driver.findElement(By.xpath("//select[@id='country']"));
	Select dropdownCountry=new Select(dropdownele);
	
	dropdownCountry.selectByValue("india");
	
	
	//Capture the Options from Dropdown
	java.util.List<WebElement> options=dropdownCountry.getOptions();
	System.out.println(options.size());//10
	
	//printing options
	for(int i=0;i<options.size();i++) {
		System.out.println(options.get(i).getText());
	}
	  
	//select/check single value
	//driver.findElement(By.xpath("//label[@for='days']"));
	//driver.findElement(By.xpath("//div//input[@id='sunday']")).click();
	//click multiple checkboxes
	
	java.util.List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	for(int i=0;i<checkboxes.size();i++) {
		checkboxes.get(i).click();

	}
	
	//driver.quit();
	

	}

}
