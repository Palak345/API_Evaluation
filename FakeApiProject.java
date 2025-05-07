package restProject;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;
import static io. restassured.RestAssured.*;

public class FakeApiProject {
 @Test
 public void testGetActivity() {
	  given().when().get("https://fakerestapi.azurewebsites.net/api/v1/Activities/1").then().statusCode(200).body("id",equalTo(1));
 }
 
 @Test
 public void testPostActivity() {
	 JSONObject js = new JSONObject();
	 js.put("id", 0);
	 js.put("title", "string");
	 js.put("dueDate", "2025-05-07T06:58:27.243Z");
	 js.put("completed", true);

	 given().contentType(ContentType.JSON).body(js.toJSONString()).when().post("https://fakerestapi.azurewebsites.net/api/v1/Activities").then().statusCode(200).body("title", equalTo("string"));
 }
 
@Test
 public void testPutActivity() {
	 JSONObject js = new JSONObject();
	 js.put("id", 0);
	 js.put("title", "integer");
	 js.put("dueDate", "2025-05-07T06:00:10.049Z");
	 js.put("completed", true);

	 given().contentType(ContentType.JSON).body(js.toJSONString()).when().put("https://fakerestapi.azurewebsites.net/api/v1/Activities/1").then().statusCode(200).body("title", equalTo("integer"));
 }
 @Test
 public void testDeleteActivity() {
	  given().when().delete("https://fakerestapi.azurewebsites.net/api/v1/Activities/1").then().statusCode(200).log().all();
 }
 
 
 // BOOKS 
 
 @Test
 public void testGetBooks() {
	  given().when().get("https://fakerestapi.azurewebsites.net/api/v1/Books").then().statusCode(200).log().all();
 }
 
 @Test
 public void testPostBooks() {
	 JSONObject js = new JSONObject();
	 js.put("id", 0);
	 js.put("title", "string");
	 js.put("description", "string");
	 js.put("pageCount", 0);
	 js.put("excerpt", "string");
	 js.put("publishDate", "2025-05-07T06:54:21.937Z");

	 given().contentType(ContentType.JSON).body(js.toJSONString()).when().post("https://fakerestapi.azurewebsites.net/api/v1/Books").then().statusCode(200).body("title", equalTo("string"));
 }
 
 @Test
 public void testPutBooks() {
	 JSONObject js = new JSONObject();
	 js.put("id", 0);
	 js.put("title", "string");
	 js.put("description", "string");
	 js.put("pageCount", 2);
	 js.put("excerpt", "string");
	 js.put("publishDate", "2025-05-07T08:00:10.060Z");

	 given().contentType(ContentType.JSON).body(js.toJSONString()).when().put("https://fakerestapi.azurewebsites.net/api/v1/Books/1").then().statusCode(200).body("title", equalTo("string"));
 }
 @Test
 public void testDeleteBooks() {
	  given().when().delete("https://fakerestapi.azurewebsites.net/api/v1/Books/1").then().statusCode(200).log().all();
}
 
 // COVERPHOTOS
 
 @Test
 public void testGetCoverPhotos() {
	  given().when().get("https://fakerestapi.azurewebsites.net/api/v1/CoverPhotos").then().statusCode(200).log().all();
 }
 
 @Test
 public void testPostCoverPhotos() {
	 JSONObject js = new JSONObject();
	 js.put("id", 0);
	 js.put("idBook", 0);
	 js.put("url", "string");

	 given().contentType(ContentType.JSON).body(js.toJSONString()).when().post("https://fakerestapi.azurewebsites.net/api/v1/CoverPhotos").then().statusCode(200).body("url", equalTo("string"));
 }
 
 @Test
 public void testPutCoverPhotos() {
	 JSONObject js = new JSONObject();
	 js.put("id", 0);
	 js.put("idBook", 2);
	 js.put("url", "string");
	 
	 given().contentType(ContentType.JSON).body(js.toJSONString()).when().put("https://fakerestapi.azurewebsites.net/api/v1/CoverPhotos/1").then().statusCode(200).body("url", equalTo("string"));
 }
 @Test
 public void testDeleteCoverPhotos() {
	  given().when().delete("https://fakerestapi.azurewebsites.net/api/v1/CoverPhotos/1").then().statusCode(200).log().all();
}
 
 // USERS
 
 @Test
 public void testGetUser() {
	  given().when().get("https://fakerestapi.azurewebsites.net/api/v1/Users").then().statusCode(200).log().all();
 }
 
 @Test
 public void testPostUsers() {
	 JSONObject js = new JSONObject();
	 js.put("id", 0);
	 js.put("userName", "string");
	 js.put("password", "string");

	 given().contentType(ContentType.JSON).body(js.toJSONString()).when().post("https://fakerestapi.azurewebsites.net/api/v1/Users").then().statusCode(200).body("userName", equalTo("string"));
 }
 
 @Test
 public void testPutUsers() {
	 JSONObject js = new JSONObject();
	 js.put("id", 0);
	 js.put("userName", "integer");
	 js.put("password", "string");
	 
	 given().contentType(ContentType.JSON).body(js.toJSONString()).when().put("https://fakerestapi.azurewebsites.net/api/v1/Users/1").then().statusCode(200).body("password", equalTo("string"));
 }
 @Test
 public void testDeleteUsers() {
	  given().when().delete("https://fakerestapi.azurewebsites.net/api/v1/Users/1").then().statusCode(200).log().all();
}
 
 //AUTHOR
 
 @Test
 public void testGetAuthor() {
	  given().when().get("https://fakerestapi.azurewebsites.net/api/v1/Authors").then().statusCode(200).log().all();
 }
 
 @Test
 public void testPostAuthors() {
	 JSONObject js = new JSONObject();
	 js.put("id", 0);
	 js.put("idBook", 0);
	 js.put("firstName", "string");
	 js.put("lastName", "string");

	 given().contentType(ContentType.JSON).body(js.toJSONString()).when().post("https://fakerestapi.azurewebsites.net/api/v1/Authors").then().statusCode(200).body("firstName", equalTo("string"));
 }
 
 @Test
 public void testPutAuthors() {
	 JSONObject js = new JSONObject();
	 js.put("id", 0);
	 js.put("idBook", 0);
	 js.put("firstName", "integer");
	 js.put("lastName", "string");
	 
	 given().contentType(ContentType.JSON).body(js.toJSONString()).when().put("https://fakerestapi.azurewebsites.net/api/v1/Authors/1").then().statusCode(200).body("lastName", equalTo("string"));
 }
 @Test
 public void testDeleteAuthors() {
	  given().when().delete("https://fakerestapi.azurewebsites.net/api/v1/Authors/1").then().statusCode(200).log().all();
}
 
}
 