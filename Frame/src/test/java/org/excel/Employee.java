package org.excel;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Employee {
	public static void main(String[] args) throws IOException{
		Employee employee = new Employee();
		employee.hotelBooking();
		
		
	}

	public void hotelBooking() throws IOException {
		BaseClass baseclass = new BaseClass();
		
		baseclass.getDriver();
		baseclass.enterURL("https://adactinhotelapp.com/");
		baseclass.maximizewindow();
	WebElement txtuser = baseclass.findLocatorById("username");
	String name = baseclass.readValueFromExcel("Maha", 1, 0);
	baseclass.elementSenkeys(txtuser, name);
	
	WebElement txtpass = baseclass.findLocatorById("password");
	String password = baseclass.readValueFromExcel("Maha", 1, 1);
	baseclass.elementSenkeys(txtpass, password);
	
	WebElement btnclick = baseclass.findLocatorById("login");
	baseclass.elementClick(btnclick);
	WebElement location = baseclass.findLocatorById("location");
	String loc = baseclass.readValueFromExcel("Maha", 1, 2);

baseclass.elementSenkeys(location, loc);
	WebElement hotels = baseclass.findLocatorById("hotels");

	String hot = baseclass.readValueFromExcel("Maha", 1, 3);

	baseclass.elementSenkeys(hotels, hot);

	WebElement RoomType = baseclass.findLocatorById("room_type");

	String roomtype = baseclass.readValueFromExcel("Maha", 1, 4);

	baseclass.elementSenkeys(RoomType, roomtype);

	WebElement RoomNos = baseclass.findLocatorById("room_nos");

	String roomnos = baseclass.readValueFromExcel("Maha", 1, 5);

	baseclass.elementSenkeys(RoomNos, roomnos);

	WebElement CheckIn = baseclass.findLocatorById("datepick_in");

	String checkindate = baseclass.readValueFromExcel("Maha", 1, 6);

	baseclass.elementSenkeys(CheckIn, checkindate);

	WebElement CheckOut = baseclass.findLocatorById("datepick_out");

	String checkout = baseclass.readValueFromExcel("Maha", 1, 7);

	baseclass.elementSenkeys(CheckOut, checkout);

	WebElement Adults = baseclass.findLocatorById("adult_room");

	String adults = baseclass.readValueFromExcel("Maha", 1, 8);

	baseclass.elementSenkeys(Adults, adults);

	WebElement Child = baseclass.findLocatorById("child_room");

	String child = baseclass.readValueFromExcel("Maha", 1, 9);

	baseclass.elementSenkeys(Child, child);

	WebElement Search = baseclass.findLocatorById("Submit");

	baseclass.elementClick(Search);

	WebElement selecthotel = baseclass.findLocatorById("radiobutton_0");
	baseclass.elementClick(selecthotel);
	
	WebElement clickcontinue = baseclass.findLocatorById("continue");
	baseclass.elementClick(clickcontinue);
	
		
		
		
		
		
		
		
		
		
	}

}
