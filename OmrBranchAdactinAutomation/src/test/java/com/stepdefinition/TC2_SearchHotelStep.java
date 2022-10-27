package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_SearchHotelStep extends BaseClass{
	
	PageObjectManager pom = new PageObjectManager();
	
	
	
	@Then("User should search  hotels by selecting all the fields using\"Sydney\",{string},{string}, {string},{string}, {string}, {string} and {string}")
	public void userShouldSearchHotelsBySelectingAllTheFieldsUsingSydneyAnd(String location, String hotels, String 	roomType, String noOfRooms, String checkInDate, String checkOutDate, String adultsPerRoom,String childrenPerRoom ) {

	pom.getSearchHotelPage().searchHotel(location, hotels, roomType, noOfRooms,  checkInDate, checkOutDate, adultsPerRoom,childrenPerRoom);
	
	}
	@Then("User should verify after Search Hotel  {string}")
	public void userShouldVerifyAfterSearchHotelSuccess(String expSelectHotelMsg) {

	WebElement txtSelectHotel = pom.getSelectHotelPage().getTxtSelectHotel();
	String elementGetText = getText(txtSelectHotel);
	boolean contains = elementGetText.contains(expSelectHotelMsg);
	Assert.assertTrue("Verify select hotel ", contains);
	
	
	}
	@Then("User should search hotels by selecting only the mandatory fields using {string}, {string},{string}, \"{int}\\/{int}\\/{int}\"and \"{int} - One\"")
	public void userShouldSearchHotelsBySelectingOnlyTheMandatoryFieldsUsingAndOne(String location, String noOfRooms, String checkInDate, String checkOutDate,String adultsPerRoom) {
		
		pom.getSearchHotelPage().searchHotel(location, noOfRooms, checkInDate, checkOutDate, adultsPerRoom);
	
	
	}
	
		

	@Then("User should verify after date error message after search {string},{string}")
	public void userShouldVerifyAfterDateErrorMessageAfterSearch(String expInDateErrorMsg, String expOutDateErrorMsg) {
			
		WebElement txtCheckinDate = pom.getSearchHotelPage().getTxtCheckinDate();
		String actualCheckInDate = getText(txtCheckinDate);
		boolean equals = actualCheckInDate.contains(expInDateErrorMsg);
		Assert.assertTrue("verify error msg in checkin date", equals);
		
		WebElement txtCheckOutDate = pom.getSearchHotelPage().getTxtCheckinDate();
		String actualCheckOutDate = getText(txtCheckOutDate);
		boolean equals1 = actualCheckOutDate.contains(expOutDateErrorMsg);
		Assert.assertTrue("verify error msg in checkout date", equals1);
	
	
	}


	@Then("User should Search the Hotel without selecting any fields")
	public void userShouldSearchTheHotelWithoutSelectingAnyFields() {
		
		pom.getSearchHotelPage().searchHotel();
	
	
	
	}
	@Then("User should verify a location error message after search {string}")
	public void userShouldVerifyALocationErrorMessageAfterSearch(String errorSelectHotelMsg) {
		
		pom.getSearchHotelPage().
	 
		
		
		

	}






	

}