package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
		@FindBy (xpath="//input[@id='input-email']")
		WebElement txtemail_address;
		
		@FindBy (xpath="//input[@id='input-password']")
		WebElement txtlogin_password;
		
		@FindBy (xpath="//input[@value='Login']")
		WebElement btnLogin;
		
		public void setEmail(String email)
		{
			txtemail_address.sendKeys(email);	
	}
		public void setpass(String pass) {
			txtlogin_password.sendKeys(pass);
		}
		public void clickLogin() {
			txtlogin_password.click();
		}

}
