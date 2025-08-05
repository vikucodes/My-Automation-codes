package Automation;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindows {

	public static void main(String[] args) throws InterruptedException {
		
	/*	WebDriver driver=new ChromeDriver();//ctrl+shift+o(for auto import)
		  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@title='Login']"));
		
		Thread.sleep(5000);
		
		Set<String> wind=driver.getWindowHandles();
		
		System.out.println(wind);
		
		Iterator<String> iterator=wind.iterator();
		
		String parentwindow=iterator.next();
		
		System.out.println(parentwindow);
		
		String childwindow=iterator.next();
		
		System.out.println(childwindow);
		
		driver.switchTo().window(childwindow);
		
	driver.findElement(By.xpath("//input[@type='text'][@class='r4vIwl BV+Dqf']")).sendKeys("7987568101");
		driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).click();
		
		driver.switchTo().window(parentwindow);*/
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        
        Set<String> windowid=driver.getWindowHandles();
        
        Iterator<String> it=windowid.iterator();
        
        String parenid=it.next();
        String childid=it.next();
        
        System.out.println("parent id : " +parenid);
        System.out.println("child id :" + childid);
        
      //  driver.switchTo().window(childid);
        
        driver.switchTo().window(parenid);
        
        System.out.println(driver.getTitle());
        
        
}
}