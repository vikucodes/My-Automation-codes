package RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
//by using static no required restassurd 

import io.restassured.response.Response;

import org.testng.annotations.Test;

public class fiirstclass {
	
	@Test
	
	public void test_1() {
		
		Response response=get("https://reqres.in/api/users?page=2");
				
			
		System.out.println(response.getStatusLine());
		
		System.out.println(response.getTime());
		
		System.out.println(response.getContentType());
		
		System.out.println(response.getHeader("Content type"));
		
		System.out.println(response.getStatusLine());
		
		int statusCode=response.getStatusCode();
		
		Assert.assertEquals(statusCode,200);
	}

	
@Test


public void test_2() {
	baseURI="https://reqres.in/";
	given().get("https://reqres.in/api/users?page=2")
	.then().statusCode(200);
	//.body("data[1].id",equalTo(8));   need to check
}
}
