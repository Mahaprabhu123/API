package com.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep extends BaseClass{
	
	PageObjectManager pom = new PageObjectManager();
	
	@Given("User should be in login page of Adactin Hotel webpage")
	public void userShouldBeInLoginPageOfAdactinHotelWebpage() throws FileNotFoundException, IOException {
	
		getDriver(getPropertyFileValue("browserName"));
		enterURL(getPropertyFileValue("url"));
		maximizewindow();
		
	
	
	}
	
	
	@When("User should  login using {string},{string}")
	public void userShouldLoginUsing(String username, String password) {
	
		pom.getLoginpage().login(username, password);
	
	
	}
	
	
		
	@When("User should  login using {string},{string} with Enter Key")
	public void userShouldLoginUsingWithEnterKey(String username, String password) throws AWTException {
		
		pom.getLoginpage().loginWithEnterKey(username, password);
		
		
	}
	
	
	
	
	@Then("User should verify after login with invalid credentials error message contains {string}")
	public void userShouldVerifyAfterLoginWithInvalidCredentialsErrorMessageContains(String expLoginErrorMsg,String password) {
		WebElement textErrorLogin = pom.getLoginpage().getTextErrorLogin();
		
		String actErrorLoginMsg = getText(textErrorLogin);
		boolean b = actErrorLoginMsg.contains(expLoginErrorMsg);
		Assert.assertEquals("Verify after login error msg", b);
	
	
	}





	}
