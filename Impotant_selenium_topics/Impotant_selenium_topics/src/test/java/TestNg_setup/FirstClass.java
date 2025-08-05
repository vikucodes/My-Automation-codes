package TestNg_setup;

import org.testng.annotations.Test;

/*1.open app
 2.login
 3. log out
 */

public class FirstClass {
	@Test(priority=1)
	void open() {
		
		System.out.println("application open.....");
		
	}
	@Test(priority=2)
 void login() {
	System.out.println("application login----"); 
 }
 @Test(priority=3)
 void logout() {
	 System.out.println("application logout");
 }
}
