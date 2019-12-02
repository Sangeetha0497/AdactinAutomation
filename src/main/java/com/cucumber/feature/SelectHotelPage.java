package com.cucumber.feature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {
	public static WebDriver driver;
	public SelectHotelPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[2]/td/table/tbody/tr[2]/td/input")
	private WebElement hotelDetails;
	public WebElement getHotelDetails() {
		return hotelDetails;
	}
	
	}
	
	

