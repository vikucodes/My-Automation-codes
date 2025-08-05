package RestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;
public class getAndPostclass {
@Test
	public void testGet() {
		baseURI="https://reqres.in/api/"; //copy complete url and remove till api and remaining paste on given
		
		given().get("users?page=2").
		then().statusCode(200).
		body("data[4].first_name",equalTo("George")).
		body("data.first_name",hasItems("George" ,"Rachel"));
	}

@Test

public void testPost() {
	Map<String ,Object> map=new HashMap<>();
	//for getting String in Json we have to add dependency json simple
	map.put("name" ,"vikas");
	map.put("job", "engineer");
	
	JSONObject request=new JSONObject(map);
	//JSONObject request=new JSONObject();
	//request.put("name" , "vikas");
	//request.put("job" , "engineer");
	//System.out.println(request);
	System.out.println(request.toJSONString());
	
	baseURI="https://reqres.in/api/";
	
	given().
	header("ContentType","application/json").
	contentType(ContentType.JSON).
	accept(ContentType.JSON).
	body(request.toJSONString()).
	when()
	.post("/users")
	.then().statusCode(201)
	.log().all();
	
	
}
	
}
