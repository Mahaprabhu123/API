package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_1Loginstep {
	
	
	WebDriver driver;

	@Given("User is on the Adactinhotel page")
	public void user_is_on_the_adactinhotel_page() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://adactinhotelapp.com/");

		driver.manage().window().maximize();

	}

	@When("User should enter {string} and {string}")
	public void user_should_enter_and(String name, String pass) {

		driver.findElement(By.id("username")).sendKeys(name);

		driver.findElement(By.id("password")).sendKeys(pass);

	}

	@When("USer should click the login button")
	public void u_ser_should_click_the_login_button() {

		driver.findElement(By.id("login")).click();

	}

	@When("User should search the hotels {string}, {string},{string}, {string},{string}, {string}, {string} and {string}")
	public void user_should_search_the_hotels_and(String location, String hotels, String roomtype, String Noofrooms,
			String checkindate, String checkoutdate, String adultsperroom, String childrenperroom) throws InterruptedException {

		WebElement locat = driver.findElement(By.id("location"));

		Select select = new Select(locat);

		select.selectByVisibleText(location);
		
		WebElement hotel = driver.findElement(By.id("hotels"));

		Select select1 = new Select(hotel);
		
		select1.selectByVisibleText(hotels);
		
		WebElement typeofroom = driver.findElement(By.id("room_type"));

		Select select2 = new Select(typeofroom);

		select2.selectByVisibleText(roomtype);
		

		WebElement roomcount = driver.findElement(By.id("room_nos"));

		Select select3 = new Select(roomcount);

		select3.selectByVisibleText(Noofrooms);
		

		driver.findElement(By.id("datepick_in")).sendKeys(checkindate);

		driver.findElement(By.id("datepick_out")).sendKeys(checkoutdate);

		WebElement noofadults = driver.findElement(By.id("adult_room"));

		Select select4 = new Select(noofadults);

		select4.selectByVisibleText(adultsperroom);

		WebElement noofchildren = driver.findElement(By.id("child_room"));
		
		Select select5 = new Select(noofchildren);

		select5.selectByVisibleText(childrenperroom);

		driver.findElement(By.id("Submit")).click();

	}

	@When("User should select the hotel")
	public void user_should_select_the_hotel() {

		driver.findElement(By.id("radiobutton_0")).click();

		driver.findElement(By.id("continue")).click();

	}

	@When("User should Book a hotel {string}, {string},{string}, {string},{string}, {string}, {string} and {string}")
	public void user_should_book_a_hotel_and(String FirstName, String LastName, String Address, String CardNo,
			String CardType, String CardExMonth, String CardExYear, String CVVno) {

		driver.findElement(By.id("first_name")).sendKeys(FirstName);
		driver.findElement(By.id("last_name")).sendKeys(LastName);
		driver.findElement(By.id("address")).sendKeys(Address);
		driver.findElement(By.id("cc_num")).sendKeys(CardNo);
		
		WebElement cctype = driver.findElement(By.id("cc_type"));

		Select select6 = new Select(cctype);

		select6.selectByVisibleText(CardType);

		WebElement ccexmonth = driver.findElement(By.id("cc_exp_month"));

		Select select7 = new Select(ccexmonth);

		select7.selectByVisibleText(CardExMonth);

		WebElement ccexyear = driver.findElement(By.id("cc_exp_year"));

		Select select8 = new Select(ccexyear);

		select8.selectByVisibleText(CardExYear);

		driver.findElement(By.id("cc_cvv")).sendKeys(CVVno);
	}

	@When("User should click book button")
	public void user_should_click_book_button() {

		driver.findElement(By.id("book_now")).click();

	}

	@Then("User should verify the orderID")
	public void user_should_verify_the_order_id() throws InterruptedException {

		Thread.sleep(7000);

		WebElement orderid = driver.findElement(By.id("order_no"));

		String attribute = orderid.getAttribute("value");

		System.out.println(attribute);

	}	
	
		
}
