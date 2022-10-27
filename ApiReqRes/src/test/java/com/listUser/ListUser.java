package com.listUser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ListUser {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		//1.mention the path of json file
				FileReader fileReader = new FileReader("C:\\Users\\Admin\\eclipse-workspace\\ApiReqRes\\src\\test\\resources\\ListUser.json");
				
				//2.Create a Object for JSONParser class
				
				JSONParser jsonParser= new JSONParser();
			   //3.Pass the json file to fetch values
				Object parse = jsonParser.parse(fileReader);
				
				//convert to json object
				JSONObject jsonObject=(JSONObject)parse;
				
				Object object = jsonObject.get("page");
				System.out.println(object);
				Object object1 = jsonObject.get("per_page");
				System.out.println(object1);
				
				Object object2 = jsonObject.get("total");
				System.out.println(object2);
				
				Object object3 = jsonObject.get("total_pages");
				System.out.println(object3);
				
				Object object4 = jsonObject.get("data");
				
				JSONArray array=(JSONArray)object4;
				

				for (int i = 0; i < array.size(); i++) {
					Object objec = array.get(i);
					
					
				JSONObject jsonObject2=(JSONObject)objec;
				Object object5 = jsonObject2.get("id");
				System.out.println(object5);
				
				Object object6 = jsonObject2.get("avatar");
				System.out.println(object6);
				Object object7 = jsonObject2.get("first_name");
				System.out.println(object7);
				
				Object object8 = jsonObject2.get("last_name");
				System.out.println(object8);
				
				Object object9 = jsonObject2.get("email");
				System.out.println(object9);
				}
				Object object10 = jsonObject.get("support");
				JSONObject jsonObject3=(JSONObject)object10;
				Object object11 = jsonObject3.get("text");
				System.out.println(object11);
				
				Object object12 = jsonObject3.get("url");
				System.out.println(object12);
				
				
				
				
				
	}

}
