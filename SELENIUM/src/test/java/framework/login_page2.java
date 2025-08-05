package framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class login_page2 {
	
	WebDriver driver;
	
	//constructor
	
	login_page2(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,this);			
	}
	//locators using page factory
	@FindBy(xpath="//input[@placeholder='Username']") 
	WebElement txt_username;
	
	//another way to represnt
	
	//@FindBy(how=How.XPATH ,using="element")
	
	@FindBy(xpath="//input[@type='password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login")
	WebElement btn_login;
	
	//find list of all element
	
	@FindBy(tagName="a")
	List<WebElement> linls;
	
	//Action 
	
	public void setupUsername(String user) {
		
		txt_username.sendKeys(user);	
	}
	
public void setpass(String pwd) {
	txt_password.sendKeys(pwd);
}

public void clicllogin() {
	btn_login.click();
}
}
