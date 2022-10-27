package com.objectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class SampleRun {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		
	//1.Mention path of the json file	
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\ApiReqRes\\src\\test\\resources\\ArrayList.json");
	
		
	//2. Create object for Object Mapper
		
		ObjectMapper mapper = new ObjectMapper();
	//3.pass the json file to fetch values fron json
		
		Root root =  mapper.readValue(file,Root.class);
	
		int page = root.getPage();
		System.out.println(page);
		
		int per_page = root.getPer_page();
		System.out.println(per_page);
		
		int total = root.getTotal();
		System.out.println(total);
		
		int total_pages = root.getTotal_pages();
		System.out.println(total_pages);
		
		ArrayList<Datum> data = root.getData();
		for (Datum d : data) {
			System.out.println(d.getId());
			System.out.println(d.getFirst_name());
			System.out.println(d.getLast_name());
			System.out.println(d.getEmail());
			System.out.println(d.getAvatar());
			
		}
		
		Support support = root.getSupport();
		System.out.println(support.getUrl());
		System.out.println(support.getText());
		
		
	}

}
