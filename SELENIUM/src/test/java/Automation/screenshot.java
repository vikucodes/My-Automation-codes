package Automation;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.shopclues.com/");
		driver.manage().window().maximize();
//		//Take full screenshots
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File Sourcefile =ts.getScreenshotAs(OutputType.FILE);
//		File targetfile=new File(System.getProperty("user.dir") +"\\Screenshots\\fullpage.png");
//		Sourcefile.renameTo(targetfile);
//		driver.quit();
		
		//For Specific area
		
//		driver.findElement(By.xpath("//a[normalize-space()='MEN']")).click();
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
//		File targetfile=new File(System.getProperty("user.dir")+"\\Screenshots\\Specificarea.png");
//	    sourcefile.renameTo(targetfile);
		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
//		File targetfile=new File(System.getProperty("user.dir")+"\\Screenshots\\random.png");
//		sourcefile.renameTo(targetfile);
		
		TakesScreenshot ts1=(TakesScreenshot)driver;
		
		 File sourceFile=ts1.getScreenshotAs(OutputType.FILE);
		 
		File TargetFile=new File(System.getProperty("user.dir")+"\\Screenshots\\newpage.png");
		sourceFile.renameTo(TargetFile);
		
		driver.quit();
		
	}

}
