package TestNG_highlavel;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
	@Test
	 void pqr() {
		 
		 System.out.println("this is pqr from c3 ");
	 }
	
	@BeforeSuite
void bs() {
	
	System.out.println("this is after suite method");
}
@AfterSuite()
void as() {
	
	System.out.println("this is after suite method");
}
}
