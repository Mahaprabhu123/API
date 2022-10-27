package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookHotelPage extends BaseClass {
	
	public BookHotelPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")

	private WebElement txtFirstName;

	@FindBy(id = "last_name")

	private WebElement txtLastName;

	@FindBy(id = "address")

	private WebElement txtAddress;

	@FindBy(id = "cc_num")

	private WebElement txtCCNo;

	@FindBy(id = "cc_type")

	private WebElement txtCCType;

	@FindBy(id = "cc_exp_month")

	private WebElement txtExMonth;

	@FindBy(id = "cc_exp_year")

	private WebElement txtExYear;

	@FindBy(id = "cc_cvv")

	private WebElement txtCVV;

	@FindBy(id = "book_now")

	private WebElement btnBookNow;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCCNo() {
		return txtCCNo;
	}

	public WebElement getTxtCCType() {
		return txtCCType;
	}

	public WebElement getTxtExMonth() {
		return txtExMonth;
	}

	public WebElement getTxtExYear() {
		return txtExYear;
	}

	public WebElement getTxtCVV() {
		return txtCVV;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

	public void bookHotelCommonStep() {

		elementClick(btnBookNow);
	}

	// 1. By Select all fields

	public void bookHotel(String firstName, String lastName, String billingAddress, String cardNo, String cardType,
			String expMonth, String expYear, String cvv) {

		elementSendkeys(txtFirstName, firstName);

		elementSendkeys(txtLastName, lastName);

		elementSendkeys(txtAddress, billingAddress);

		elementSendkeys(txtCCNo, cardNo);

		elementSendkeys(txtCCType, cardType);

		elementSendkeys(txtExMonth, expMonth);

		elementSendkeys(txtExYear, expYear);

		elementSendkeys(txtCVV, cvv);

		bookHotelCommonStep();

	}

	// 2. Without enter any fields

	public void bookHotel() {

		bookHotelCommonStep();
	}


}
