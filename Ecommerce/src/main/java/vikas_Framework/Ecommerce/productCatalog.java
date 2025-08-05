package vikas_Framework.Ecommerce;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Vikas_abstarctcomponent.Vikas_abstarctcomponent;

public class productCatalog extends Vikas_abstarctcomponent {
    WebDriver driver;

    // Constructor to initialize the page elements
    public productCatalog(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Using @FindBy annotation to locate all product elements
    @FindBy(css = ".mb-3")
    List<WebElement> products;

    // Defining the locator explicitly using By
    By productsBy = By.cssSelector(".mb-3");
    By addToCart=By.cssSelector(".card-body button:last-of-type");
    By toastMessage=By.cssSelector("#toast-container");
    // Method to get the list of products after ensuring the element is visible
    public List<WebElement> getProductList() {
        WaitForElementToAppear(productsBy); // Make sure element is visible before proceeding
        return products;
    }
    
    public WebElement getProductByName(String productName) {
    	WebElement prod= getProductList().stream().filter(product->
    	product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
    	return prod;
    	
    }
    
    public void addProductToCart(String productName) {
    	WebElement prod=getProductByName(productName);
    	prod.findElement(addToCart).click();
    	WaitForElementToAppear(toastMessage);
    }
}
