package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Instaa {
	
	WebDriver driver;
	
	@Given("user  Assign url")
	public void user_assign_url() {
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		
	
	}

	@When("user login {string},{string}")
	public void user_login(String username, String password) {
		
		WebElement usern = driver.findElement(By.name("username"));
		usern.sendKeys(username);
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys(password);
		
		

	    
	
	}

	@Then("verify insta login or not")
	public void verify_insta_login_or_not() {
	    WebElement login = driver.findElement(By.xpath("//div[text()='Log In']"));
	    login.click();
	}



}
