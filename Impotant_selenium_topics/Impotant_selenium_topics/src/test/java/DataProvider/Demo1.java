package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo1 {
	WebDriver driver;
	@BeforeClass
	
	void setup() 
	{
	driver=new ChromeDriver();	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	

	}

	@Test(dataProvider="dp")
	void testlogin(String email ,String pwd) throws InterruptedException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.manage().window().maximize();	
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		//input[@type='submit']
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		

		
	}
	@AfterClass
	void teardown() throws InterruptedException
	{
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	@DataProvider(name="dp" ,indices={0 ,1} )
	// we can also apply indexes if only 2 we want to run also we can add {0,1,,3,4}
	
Object [][] loginData()
	{
		
		Object data [][]= {   
				
				{	"abc@gmail.com" ,	"test123"},
				{	"abcd@gmail.com" ,	"test122"},	
				{	"abce@gmail.com" ,	"test133"},
				{	"abcg@gmail.com" ,	"test423"},	
				{	"abch@gmail.com" ,	"test923"}	
		}  ;
		
		
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
