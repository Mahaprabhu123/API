package com.baseclass;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	
	 Response response;
	 RequestSpecification reqSpec;
		

	public void addHeaders(Headers headers) {

		reqSpec = RestAssured.given().headers(headers);
	}

	public void basicAuth(String userName, String password) {

		reqSpec = reqSpec.auth().preemptive().basic(userName, password);

	}

	public void addHeader(String Key, String Value) {

		reqSpec = RestAssured.given().header(Key, Value);

	}

	public void addQueryParam(String Key, String Value) {

		reqSpec = reqSpec.queryParam(Key, Value);

	}

	public void addPathParam(String Key, String Value) {

		reqSpec = reqSpec.pathParam(Key, Value);
	}

	public void addBody(String body) {
		reqSpec = reqSpec.body(body);

	}

	public void addBody(Object body) {
		reqSpec = reqSpec.body(body);

	}

	public Response requestType(String type, String endpoint) {

		switch (type)
		{

		case "GET":

			response = reqSpec.get(endpoint);

			break;

		case "POST":

			response = reqSpec.post(endpoint);

			break;

		case "PUT":

			response = reqSpec.put(endpoint);

			break;

		case "DELETE":

			response = reqSpec.delete(endpoint);

			break;

		default:
			break;
		}
		return response;
	}

	public int getStatusCode() {

		int statusCode = response.getStatusCode();
		return statusCode;
	}

	public String getResBodyAsString() {

		String asString = response.asString();
		return asString;
	}

	public String getResBodyAsPrettyString() {

		String asPrettyString = response.asPrettyString();
		return asPrettyString;
	}
}
	
	
	


