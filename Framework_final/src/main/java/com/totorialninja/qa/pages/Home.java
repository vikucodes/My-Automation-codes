package com.totorialninja.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	WebDriver driver;
	
	//Object
	@FindBy(xpath="//span[text()='My Account']")
    private	WebElement myAccountDropMenu;
	
	@FindBy(linkText="Login")
	private WebElement loginOption;
	
	public Home(WebDriver driver) {
		this.driver=driver;	
		
		PageFactory.initElements(driver ,this);

}
	
	//action 
	public void clickOnMyAccount() {
		myAccountDropMenu.click();
	}
	
	public void selectLoginOption() {
		loginOption.click();
	}
}