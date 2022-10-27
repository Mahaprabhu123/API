package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class AdactinVerify {
	WebDriver driver;
	@Given("user is on the adactin page")
	public void user_is_on_the_adactin_page() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://adactinhotelapp.com/");

		driver.manage().window().maximize();

		
		
	}
	
	@When("user should perform login {string},{string}")
	public void user_should_perform_login(String name, String pass) {
		
	 driver.findElement(By.id("username")).sendKeys(name);
	 driver.findElement(By.id("password")).sendKeys(pass);
	 driver.findElement(By.id("login")).click();
		
		
		
	}
	
	
	@Then("user should verify after login success msg\"HelloGreens8767!\"")
	public void user_should_verify_after_login_success_msg_hello_greens8767() {
		
		WebElement verify = driver.findElement(By.id("username_show"));
		String attribute = verify.getAttribute("value");
		System.out.println(attribute);
		
	}
	
	@Given("user is on the Adactin login page")
	public void user_is_on_the_adactin_login_page() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://adactinhotelapp.com/");

		driver.manage().window().maximize();

	}
	@When("user should perform login {string},{string} with EnterKey")
	public void user_should_perform_login_with_enter_key(String name, String pass) {
	   driver.findElement(By.id("username")).sendKeys(name);
	   driver.findElement(By.id("password")).sendKeys(pass);
	   driver.findElement(By.id("login")).click();
	
	
	}
	@Then("user should verify after login success message {string}")
	public void user_should_verify_after_login_success_message(String string) {
		WebElement verify = driver.findElement(By.id("username_show"));
		String attribute = verify.getAttribute("value");
		System.out.println(attribute);
	

	
	}


@Then("user should verify after login with Invalid Credential error msg contains {string}")
public void user_should_verify_after_login_with_invalid_credential_error_msg_contains(String string) {
    
	WebElement expiredpass = driver.findElement(By.xpath("//div[@class='auth_error']"));
	String attribute = expiredpass.getAttribute("value");
	System.out.println(attribute);
	
}






}
