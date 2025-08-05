package Atestng.testingset;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class Demoone {
	
	@AfterTest()
	public void demo()
	{
		System.out.println("lol");
	}
	@Test
	
	public void demo1()
	{
		System.out.println("Hello");
		
	}
	@AfterSuite
	public void demosuit() {
		System.out.println("this is m");
	}

	@Test
	public void demo2()
	{
		System.out.println("class");
	}
	@BeforeTest
	public void demo3()
	{
		System.out.println("skip");
	}
	
	@BeforeSuite
	
	public void demo4() {
		System.out.println("king");
	}
	

}


