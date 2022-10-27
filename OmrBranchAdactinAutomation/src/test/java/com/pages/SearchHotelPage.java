package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username_show")

	private WebElement txtWelcomeMsg;

	@FindBy(id = "location")

	private WebElement dDnLocation;

	@FindBy(id = "hotels")

	private WebElement dDnHotels;

	@FindBy(id = "room_type")

	private WebElement dDnRoomType;

	@FindBy(id = "room_nos")

	private WebElement dDnNoofRoom;

	@FindBy(id = "datepick_in")

	private WebElement txtCheckinDate;

	@FindBy(id = "datepick_out")

	private WebElement txtCheckOutDate;

	@FindBy(id = "adult_room")

	private WebElement dDnAdultsPerRoom;

	@FindBy(id = "child_room")

	private WebElement dDnChildPerRoom;

	@FindBy(id = "Submit")

	private WebElement btnSearch;

	public WebElement getTxtWelcomeMsg() {
		return txtWelcomeMsg;
	}

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnNoofRoom() {
		return dDnNoofRoom;
	}

	public WebElement getTxtCheckinDate() {
		return txtCheckinDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getdDnAdultsPerRoom() {
		return dDnAdultsPerRoom;
	}

	public WebElement getdDnChildPerRoom() {
		return dDnChildPerRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public void searchHotelButton() {

		elementClick(btnSearch);
	}

	public void searchHotelsCommonStep(String location, String noOfRooms, String checkInDate, String checkOutDate,
			String adultsPerRoom) {

		elementSendkeys(dDnLocation, location);

		elementSendkeys(dDnNoofRoom, noOfRooms);

		elementSendkeys(txtCheckinDate, checkInDate);

		elementSendkeys(txtCheckOutDate, checkOutDate);

		elementSendkeys(dDnAdultsPerRoom, adultsPerRoom);

	}

	// 2. Verifying only Mandatory fields

	public void searchHotel(String location, String noOfRooms, String checkInDate, String checkOutDate,
			String adultsPerRoom) {

		searchHotelsCommonStep(location, noOfRooms, checkInDate, checkOutDate, adultsPerRoom);

		searchHotelButton();

	}

	// 1. By Selecting All fields

	// 3. Date Checking

	public void searchHotel(String location, String hotels, String roomType, String noOfRooms, String childrenPerRoom,
			String checkInDate, String checkOutDate, String adultsPerRoom) {

		searchHotelsCommonStep(location, noOfRooms, checkInDate, checkOutDate, adultsPerRoom);

		elementSendkeys(dDnHotels, hotels);

		elementSendkeys(dDnRoomType, roomType);

		elementSendkeys(dDnChildPerRoom, childrenPerRoom);

		searchHotelButton();

	}

	// 4. Without Enter any fields click Search

	public void searchHotel() {

		searchHotelButton();
	}
}


