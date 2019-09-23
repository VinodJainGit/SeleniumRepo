package apitesting;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

public class verifyRecord 
{

	@Test
	public void verify()
	{
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employee/"+id;
		RequestSpecification request = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
		response = request.request(Method.GET);
		statusCode = response.getStatusCode();
		
		//Validate my response code
		asser.assertEquals(response.statusCode(), 400);
		System.out.println(statusCode);
		System.out.println(response.asString());
		
	}

}
