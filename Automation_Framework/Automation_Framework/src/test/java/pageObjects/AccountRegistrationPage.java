package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	
	public AccountRegistrationPage(WebDriver driver){
		
		super(driver);
		    }

		    @FindBy(id = "input-firstname")
		    WebElement firstName;

		    @FindBy(id = "input-lastname")
		    WebElement lastName;

		    @FindBy(id = "input-email")
		    WebElement email;

		    @FindBy(id = "input-telephone")
		    WebElement telephone;

		    @FindBy(id = "input-password")
		    WebElement password;

		    @FindBy(id = "input-confirm")
		    WebElement confirmPassword;

		    @FindBy(name = "agree")
		    WebElement privacyPolicyCheckbox;

		    @FindBy(css = "input.btn.btn-primary")
		    WebElement continueButton;

		    @FindBy(css = "#content h1")
		    WebElement confirmationHeader;

		    public void enterFirstName(String fname) {
		        firstName.sendKeys(fname);
		    }

		    public void enterLastName(String lname) {
		        lastName.sendKeys(lname);
		    }

		    public void enterEmail(String emailText) {
		        email.sendKeys(emailText);
		    }

		    public void enterTelephone(String phone) {
		        telephone.sendKeys(phone);
		    }

		    public void enterPassword(String pass) {
		        password.sendKeys(pass);
		    }

		    public void enterConfirmPassword(String pass) {
		        confirmPassword.sendKeys(pass);
		    }

		    public void acceptPrivacyPolicy() {
		        privacyPolicyCheckbox.click();
		    }

		    public void clickContinue() {
		        continueButton.click();
		    }

		    public String getConfirmationHeader() {
		        return confirmationHeader.getText();
		    }
		

	

}
