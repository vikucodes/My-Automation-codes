package TestNg_setup;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo1 {
	
	
	@BeforeMethod
	void login() {
		
		System.out.println("this is login..");
		
	}
	@Test(priority=1)
	void search() {
		
		System.out.println("This is Search..");
	}
@Test(priority=2)
	void advancedsearch() {
		
		System.out.println("this is advanced serach---");
	}
	@AfterMethod
	void logout() {
		
		System.out.println("this is logout");
	}
}
