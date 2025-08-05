package TestNg_setup;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsDemo2 {
	
	
	@BeforeClass
	void login() {
		
		System.out.println("this is login..");
		
	}
	@Test(priority=1)
	void search() {
		
		System.out.println("This is Search..");
	}
	
	@Test(priority=2)
	void advsearch() {
		
		System.out.println("this is advancedsearch");
	}
	
	@AfterClass
	void logout() {
		
		System.out.println("this is logout");
	}
}
