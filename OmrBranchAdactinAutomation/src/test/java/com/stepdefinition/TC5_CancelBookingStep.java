package com.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC5_CancelBookingStep {
	
	
	@Given("User should be in the login page of Adactin Hotel webpage")
	public void userShouldBeInTheLoginPageOfAdactinHotelWebpage() {
	
		
	}
	@When("User should  login using {string},{string}")

	public void userShouldLoginUsing(String string, String string2) {
	
		
		

	}
	
	@Then("User should verify after login success message {string}")
	public void userShouldVerifyAfterLoginSuccessMessage(String string) {
	
		
		
		
	}

	@Then("User should search  hotels by selecting all the fields using\"Sydney\",{string},{string}, {string},{string}, {string}, {string} and {string}")
	public void userShouldSearchHotelsBySelectingAllTheFieldsUsingSydneyAnd(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	
		
	}
	@Then("User should verify after Search Hotel  {string}")
	public void userShouldVerifyAfterSearchHotel(String string) {
	
		
		
		
		
	}
	@Then("User should select a hotel name")
	public void userShouldSelectAHotelName() {

		
		
	}
	@Then("User should verify after select hotel name success message {string}")

	public void userShouldVerifyAfterSelectHotelNameSuccessMessage(String string) {
	
		
	}
	@Then("User should Book a Hotel {string},{string},{string}")
	public void userShouldBookAHotel(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {

		
		
		
	}

	@Then("User should verify after booking hotel success message {string} and saved Order id")
	public void userShouldVerifyAfterBookingHotelSuccessMessageAndSavedOrderId(String string) {
	
		
		
	}
	@Then("User should cancel created order id")
	public void userShouldCancelCreatedOrderId() {

		
		

	}
	@Then("User should verify after Cancel order id {string}")
	public void userShouldVerifyAfterCancelOrderId(String string) {

		
		
	}

	}
	@Then("User should cancel existing order id {string}")
	public void userShouldCancelExistingOrderId(String string) {
	    
		
	}
	@Then("User should verify after cancel order id success message {string}")

	public void userShouldVerifyAfterCancelOrderIdSuccessMessage(String string) {
	
		
	}






}
