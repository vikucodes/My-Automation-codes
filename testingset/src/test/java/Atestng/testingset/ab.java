package Atestng.testingset;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ab {

	
	@BeforeMethod
	public void runmefirst()
	{
		System.out.println("i am champion");
	}
	
	
	@Test
	public void dothis() {
		System.out.println("ji vikas");
	}
}
