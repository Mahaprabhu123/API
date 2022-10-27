package org.excel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactTask {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
	}
	@AfterClass
	public  static void afterClass() {
		driver.quit();
	}
	@Before
	public void beforeMethod() {
		long time = System.currentTimeMillis();
		System.out.println(time);
	}
	@Test
	public void login() {
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("Greens123");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("green234");
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
		
	}
	@After
	public void afterMethod() {
		long time = System.currentTimeMillis();
		System.out.println(time);
	}
	
	}
	

