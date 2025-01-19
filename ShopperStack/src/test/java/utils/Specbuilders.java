package utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specbuilders
{

	public static RequestSpecification reqSpec()
	{
		RequestSpecBuilder req=new RequestSpecBuilder();
		RequestSpecification request = req.setBaseUri(PropertyFile.readData("base_url"))
		.setContentType(ContentType.JSON).build();
		return request;
	}	
	public static ResponseSpecification resSpec(int statuscode)
	{
		ResponseSpecBuilder res=new ResponseSpecBuilder();
		ResponseSpecification response = res
		.expectStatusCode(statuscode).expectContentType(ContentType.JSON).build();
		return response;
	}

}
