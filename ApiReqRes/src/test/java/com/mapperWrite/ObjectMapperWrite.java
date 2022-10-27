package com.mapperWrite;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperWrite {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		//1.path for json file
		
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\ApiReqRes\\src\\test\\resources\\ObjMapWrite.json");
		
		//2.create object for object mapper
		
		ObjectMapper mapper = new ObjectMapper();
		
		//3.Assign values
		
		
		ArrayList<Datum> data = new ArrayList<Datum>();
		
		Datum datum = new Datum(7, "michael.lawson@reqres.in", "Michael", "Lawson", "https://reqres.in/img/faces/7-image.jpg");
		
		Datum datum1 = new Datum(8, "lindsay.ferguson@reqres.in", "Lindsay", "Ferguson", "https://reqres.in/img/faces/8-image.jpg");
		
		Datum datum2 = new Datum(9, "tobias.funke@reqres.in", "Tobias", "Funke", "https://reqres.in/img/faces/9-image.jpg");
		
		Datum datum3 = new Datum(10, "byron.fields@reqres.in", "Byron", "Fields", "https://reqres.in/img/faces/10-image.jpg");
		
		Datum datum4 = new Datum(11, "george.edwards@reqres.in", "George", "Edwards", "https://reqres.in/img/faces/11-image.jpg");
		
		Datum datum5 = new Datum(12, "rachel.howell@reqres.in", "Rachel", "Howell", "https://reqres.in/img/faces/12-image.jpg");
		

		data.add(datum);
		data.add(datum1);
		data.add(datum2);
		data.add(datum3);
		data.add(datum4);
		data.add(datum5);
		
		Support support = new Support("https://reqres.in/#support-heading", "To keep ReqRes free, contributions towards server costs are appreciated!");
		
		RootWrite rootWrite = new RootWrite(2, 6, 12, 2, data, support);
		
		mapper.writeValue(file, rootWrite);
		
	}

}
