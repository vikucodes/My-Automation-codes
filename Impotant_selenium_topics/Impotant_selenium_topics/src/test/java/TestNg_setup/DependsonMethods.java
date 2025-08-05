package TestNg_setup;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonMethods {

	@Test(priority = 1)

	void openapp() {
		System.out.println("i am opening");
		Assert.assertTrue(true);
	}

	@Test(priority = 2 ,dependsOnMethods= {"openapp"})
	void login() {
		System.out.println("i am login");
     Assert.assertTrue(true);
	}

	@Test(priority = 3 , dependsOnMethods= {"login"})
	void search() {
		System.out.println("i am search");
		 Assert.assertTrue(true);
	}

	@Test(priority = 4 ,dependsOnMethods= {"login"})
	void advsearch() {
		System.out.println("it is advserach");
		 Assert.assertTrue(true);
	}

	@Test(priority = 5 ,dependsOnMethods= {"login"})
	void logout() {

		System.out.println("i am logout");
		 Assert.assertTrue(true);
	}
}
