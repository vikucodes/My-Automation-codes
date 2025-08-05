package Grouping;

import org.testng.annotations.Test;

public class LoginTest {

	@Test(priority=1 ,groups= {"sanity"})
	void loginByEmail()
	{
		System.out.println("This is login By email");
	}
	@Test(priority=2 ,groups= {"sanity"})
	void loginByFacebook()
	{
		System.out.println("This is login By facebook");
	}
	@Test(priority=3 ,groups= {"sanity"})
	void loginByTwitter()
	{
		System.out.println("This is login By twitter");
	}
}
