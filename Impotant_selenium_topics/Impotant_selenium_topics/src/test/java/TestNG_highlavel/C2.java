package TestNG_highlavel;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C2 {
	@Test
	void xyx() {
		System.out.println("this is from c2");
	}
	
	@AfterTest
void at() {
	
	
	System.out.println("this is beforeTest method ");
}
}


