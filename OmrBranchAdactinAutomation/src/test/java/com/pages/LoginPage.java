package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass {
	BaseClass baseClass= new BaseClass();
	
	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")

	private WebElement txtUserName;

	@FindBy(id = "password")

	private WebElement txtpassword;

	@FindBy(id = "login")

	private WebElement btnlogin;

	@FindBy(className ="auth_error")
	private WebElement textErrorLogin;
	
	public BaseClass getBaseClass() {
		return baseClass;
	}

	public WebElement getTextErrorLogin() {
		return textErrorLogin;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public void loginCommonStep(String username, String password) {

		elementSendkeys(getTxtUserName(), username);

		elementSendkeys(getTxtpassword(), password);
		
	}

	// 1. Verifying Login with Valid Credentials

	// 3. Verifying Login with InValid Credentials

	public void login(String username, String password) {

		loginCommonStep(username, password);

	elementClick(getBtnlogin());
	}

	// 2. Verifying Login with Enter Key

	public void loginWithEnterKey(String username, String password) throws AWTException {

		loginCommonStep(username, password);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}	


