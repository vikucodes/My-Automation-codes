package TestNG_highlavel;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
	
	@Test
	void abc() {
		System.out.println("this is from c1");
	}
	
	@BeforeTest
void bt() {
	
	
	System.out.println("this is beforeTest method ");
}
}
