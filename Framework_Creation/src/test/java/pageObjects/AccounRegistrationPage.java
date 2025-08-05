package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccounRegistrationPage extends BasePage{
	

	public AccounRegistrationPage(WebDriver driver) {
		super(driver);
		}
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtfirstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtlastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txtphone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtcpassword;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement select;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement click_operation;
	
	public void setfirstname(String fname) {
		txtlastname.sendKeys(fname);
	}
	public void setlastname(String lname) {
		txtfirstname.sendKeys(lname);
	}
	public void setmail(String umail) {
		txtemail.sendKeys(umail);
	}
	public void setphone(String phn) {
		txtphone.sendKeys(phn);
    }
	
	public void setpassword(String pass) {
		txtpassword.sendKeys(pass);
		
	}
	public void setcpassword(String pass) {
		txtcpassword.sendKeys(pass);
	
	}
	public void ticked() {
	select.click();
}
	public void done() {
		click_operation.click();
	}
}
