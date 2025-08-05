package com.totorialninja.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement loginEmail;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement loginPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginClick;
	
	public loginpage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void logemail(String email) {
		loginEmail.sendKeys(email);
	}
public void logpass(String Pass) {
	loginPassword.sendKeys(Pass);
}

public void selectorclick() {
	loginClick.click();

}
}