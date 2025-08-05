package com.totorialninja.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerpage {
//its my duty to create 
	
	WebDriver driver;
	
	@FindBy(id="input-firstname")
	WebElement first_name;
	
	@FindBy (id="input-lastname")
	WebElement last_name;
	
	@FindBy (id="input-email")
	WebElement email;
	
	@FindBy (id="input-telephone")
	WebElement telephone;
	
	@FindBy (id="input-password")
	WebElement password;
	
	@FindBy (id="input-confirm")
	WebElement Confirm_password;
	
	@FindBy (xpath="//input[@type='checkbox']")
	WebElement check_box;
	
	
	public registerpage(WebDriver driver) {
		
	
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
		
	}	
	
	public void fname(String name) {
		first_name.sendKeys("name");
		
	}
	
	public void lname(String name) {
		last_name.sendKeys("name");
	}
	
	public void umail(String mail) {
		email.sendKeys("mail");
	}
	
	public void utelephone(String tel) {
		
		telephone.sendKeys("tel");
	}
	public void User_pass(String upass) {
		password.sendKeys("upass");
	}
	
	public void cpass(String ucpass) {
		Confirm_password.sendKeys("ucpass");
	}
	
	public void select() {
		check_box.click();
	}
}
