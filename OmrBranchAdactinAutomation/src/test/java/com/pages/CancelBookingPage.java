package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class CancelBookingPage extends BaseClass{

	
public CancelBookingPage() {
		
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="//a[text()='Booked Itinerary']")

	private WebElement bookItinerary;
	
	@FindBy(id="order_id_text")

	private WebElement insertValue;
	
	@FindBy(id="search_hotel_id")

	private WebElement go;
	
	@FindBy(xpath="//input[contains(@id,'btn_id_')]")

	private WebElement cancelOrderId;
	


	public WebElement getBookItinerary() {
		return bookItinerary;
	}

	public WebElement getInsertValue() {
		return insertValue;
	}

	public WebElement getGo() {
		return go;
	}

	public WebElement getCancelOrderId() {
		return cancelOrderId;
	}
	
	public void cancelOrderId(String insertValue) {
		
		elementSendkeys(bookItinerary,"Testing");
		elementSendkeys(getInsertValue(), insertValue);
		elementClick(go);
		elementClick(cancelOrderId);
		accept();
		

	}
	
	
	
}
