package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author Admin
 * @Description mention FileInputStream 
 * @Date 16-10-22 
 * 
 */
public class A {
	public static void main(String[] args) throws IOException {
		
		//1.Mention path of fileinputstream
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\OmrBranchAdactinAutomation\\config\\config.properties");
		
		//2.create object for properties
		Properties properties= new Properties();
		//3. pass the property file location to fetch
		properties.load(fileInputStream);
		Object object = properties.get("username");
		Object object2 = properties.get("password");
		String value =(String)object;
		System.out.println(value);
		
	}

}
