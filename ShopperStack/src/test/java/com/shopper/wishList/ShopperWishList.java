package com.shopper.wishList;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import utils.Specbuilders;

import static io.restassured.RestAssured.given;

public class ShopperWishList 
{
	String base_url="https://www.shoppersstack.com/shopping";
	String token=null;
	@Test (priority = 1,enabled = true)
	void test()
	{
		RestAssured.baseURI=base_url;
		RequestSpecification request = RestAssured.given();
		
		request.header("Content-Type","application/json");
		
		Response res = request.body("/ShopperStack/Payload/LoginPayLoad.json").post("/users/login");
		
		System.out.println(res.statusLine());
		
		String jsonStringRes = res.getBody().asPrettyString();
		System.out.println(jsonStringRes);
		
//		JsonPath j=new JsonPath(jsonStringRes.toString());
//		
//		token = j.get("data.jwtToken");
//		
//		System.out.println(res.getContentType().toString());
		//token = JsonPath.from(jsonStringRes).get("");
	
	}
	@Test (priority = 2,enabled = false)
	void getShooper()
	{
		 Response response = given().spec(Specbuilders.reqSpec()).
		//req.headers("Authorization","Bearer "+token);
		
		//req.contentType(ContentType.JSON);
		///headers("Authorization","Bearer "+token)
		when().get("/products/alpha")
		.then().log().all().spec(Specbuilders.resSpec(200)).extract().response();
		
		System.out.println(response.statusLine());
		 response.prettyPrint();
		 
		 
		 
//		Response respose_of_all_product = request.get();
//		respose_of_all_product.prettyPrint();
		
		//Response res = request.request(Method.GET,"/products/alpha");
		
//		System.out.println(respose_of_all_product.getStatusCode());
//		System.out.println(respose_of_all_product.getStatusLine());
		
		//respose_of_all_product.prettyPrint();

	}
	
//	@Test void tata()
//	{
//		System.out.println("hi");
//	}
//	RestAssured.basePath=base_url;
//	RequestSpecification request = RestAssured.given();
//	//req.headers("Authorization","Bearer "+token);
//	
//	//req.contentType(ContentType.JSON);
//	request.headers("Authorization","Bearer "+token);
//	request.contentType(ContentType.JSON);
//	
//	Response respose_of_all_product = request.get("/products/alpha");
//	respose_of_all_product.prettyPrint();
//	
//	//Response res = request.request(Method.GET,"/products/alpha");
//	
//	System.out.println(respose_of_all_product.getStatusCode());
//	System.out.println(respose_of_all_product.getStatusLine());
	

}
