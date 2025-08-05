package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
	
	public MyAccountPage(WebDriver driver)
	{
	
	
	super(driver );

}
@FindBy(xpath="//h2[@text()='My Account']") //my account page heading
WebElement msgHeading;

public boolean myAccountisExist() {
	
	try {
	
	return msgHeading.isDisplayed();
	
	}
	catch(Exception e) {
		return false;
	}
}
}
