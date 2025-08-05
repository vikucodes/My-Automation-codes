package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_page {
	
	WebDriver driver;
	
	//constructor
	
	login_page(WebDriver driver){
		
		this.driver=driver;
			
	}
	//locators without page factory
	
	By txt_username_loc=By.xpath("//input[@placeholder='Username']");
	By txt_password_loc=By.xpath("//input[@type='password']");
	By btn_login_loc=By.xpath("//button[normalize-space()='Login']");
	
	//Action 
	
	public void setupUsername(String user) {
		
		driver.findElement(txt_username_loc).sendKeys(user);
	}
	
public void setpass(String pwd) {
	
	driver.findElement(txt_password_loc).sendKeys(pwd);
}

public void clicllogin() {
	
	driver.findElement(btn_login_loc).click();
}
}
