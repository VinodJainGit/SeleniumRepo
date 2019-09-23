package apitesting;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class createRecord 
{
	@Test
	public void create() 
	{
       SoftAssert asser= new SoftAssert();
		
		//Step 1 Create new Record
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/create";
		RequestSpecification request = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "mahesh");
		requestParams.put("salary", "450000");
		requestParams.put("age", "28");
		request.header("Content-Type", "application/json");
		request.body(requestParams.toJSONString());
		Response response = request.request(Method.POST);
		int statusCode = response.getStatusCode();
        asser.assertEquals(statusCode, 200);
		
		
		System.out.println(statusCode);
		System.out.println(response.asString());
		JsonPath jsonPathEvaluator = response.jsonPath();
		String id = jsonPathEvaluator.get("id");
	
		
		
	}
	

}
