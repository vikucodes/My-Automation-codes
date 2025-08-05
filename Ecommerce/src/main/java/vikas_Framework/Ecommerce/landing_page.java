package vikas_Framework.Ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Vikas_abstarctcomponent.Vikas_abstarctcomponent;

public class landing_page extends Vikas_abstarctcomponent {
	WebDriver driver;
	
	public landing_page(WebDriver driver ) {
		
		super(driver);
		
		this.driver=driver;
		
		PageFactory.initElements(driver , this);
	}
	@FindBy(xpath="//input[@id='userEmail']")
	WebElement useremail;
	
	@FindBy(xpath="//input[@id='userPassword']")
	WebElement userpassword;
	
	@FindBy(xpath="//input[@id='login']")
	WebElement submit ;
	
	
	public void loginapplication(String email ,String password ) 
	{
	
		useremail.sendKeys(email);
		
		userpassword.sendKeys(password);
		
		submit.click();

		
	}
	
	public void start () {
		
	
    driver.get("https://rahulshettyacademy.com/client");
}
}