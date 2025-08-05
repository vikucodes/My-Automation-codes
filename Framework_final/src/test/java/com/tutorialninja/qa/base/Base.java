package com.tutorialninja.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	WebDriver driver;
	public Properties prop;
	public  Base() {
		
		prop=new Properties();
		File propFile=new File(System.getProperty("user.dir")+"\\src\\main\\java\\tutorial\\ninja\\qa\\config\\Config.properties");
		//FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/Config.properties");

		try {
		FileInputStream fis=new FileInputStream(propFile);
		prop.load(fis);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public WebDriver initializeBrowserAndOpenApplicationUrl(String browser) {
if(browser.equals("chrome")) {
			
			driver =new ChromeDriver();
		}else if(browser.equals("edge")) {
			
			driver=new EdgeDriver();
		}else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
        
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		driver.get(prop.getProperty("url"));
		
		//driver.findElement(By.xpath("//span[text()='My Account']")).click();
		return driver;
		
		
	}

}
