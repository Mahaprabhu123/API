package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotelPage extends BaseClass {
	
	public SelectHotelPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")

	private WebElement btnRadio;

	@FindBy(id = "continue")

	private WebElement btnContinue;

	@FindBy(xpath = "//td[contains(text(),'Select Hotel ')]")

	private WebElement txtSelectHotel;

	public WebElement getBtnRadio() {
		return btnRadio;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getTxtSelectHotel() {
		return txtSelectHotel;
	}

	public void selectHotelCommonStep() {

		elementClick(btnContinue);
	}

	// 1. By Select hotel name

	public void selectHotel() {

		elementClick(btnRadio);
		selectHotelCommonStep();

	}

	// 2. Without Select hotel name

	public void clickContinue() {

		elementClick(btnContinue);
	}



}
