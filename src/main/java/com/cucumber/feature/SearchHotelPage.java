package com.cucumber.feature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {
	public static WebDriver driver;
	public SearchHotelPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);

			}
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getSearch() {
		return search;
	}

	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomType;
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement numberOfRooms;
	
	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}

	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement checkInDate;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement checkOutDate;
	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement search;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement numOfAdults;
	
	public WebElement getNumOfAdults() {
		return numOfAdults;
	}

	public WebElement getNumOfChildren() {
		return numOfChildren;
	}

	@FindBy(xpath="//select[@name='child_room']")
	private WebElement numOfChildren;

	
	

	
	

	
}
