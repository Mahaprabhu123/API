package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class CommonStep extends BaseClass {
	
	PageObjectManager pom = new PageObjectManager();
	
	@Then("User should verify after login success message\"HelloGreens8767!\"")
	public void userShouldVerifyAfterLoginSuccessMessageHelloGreens8767(String expLoginErrorMsg) {

		WebElement txtWelcomeMsg = pom.getSearchHotelPage().getTxtWelcomeMsg();
		String actLoginMsg = elementGetAttributeValue(txtWelcomeMsg);
		
		Assert.assertEquals("verify after login success msg",expLoginErrorMsg,actLoginMsg);
		
		
	}


}
