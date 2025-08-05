package mavenclass.firstclass;

import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firsttestcases {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup()	;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/");
	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		
	File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		FileUtils.copyFile(src, new File("E:\\Screenshot\\photo.jpeg"));
		
		driver.quit();
	}
}