package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookingConfirmationPage extends BaseClass{
	
	public BookingConfirmationPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")

	private WebElement txtOrderNo;

	@FindBy(xpath = "//td[text()='Booking Confirmation']")

	private WebElement txtBookingConfirmation;

	public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}

	public WebElement getTxtBookingConfirmation() {
		return txtBookingConfirmation;
	}

	public String getOrderId() {

		String orderId = elementGetAttributeValue(txtOrderNo);
		return orderId;
	}

}


