package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
WebDriver driver;

//constructor

LogInPage (WebDriver driver){
	
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
 	
}

//LOcator
@FindBy(xpath="//input[@placeholder='Username']")
WebElement user_login;

@FindBy(xpath="//input[@placeholder='Password']")
WebElement user_loginpass;

@FindBy(xpath="//button[@type='submit']")
WebElement clickable;

//Action

public void setUserName(String user) {
	user_login.sendKeys(user);
}
public void setUserpass(String userpass) {
	user_loginpass.sendKeys(userpass);
	
	
	
}
public void clicklogin()
{
	clickable.click();
	
	}}
