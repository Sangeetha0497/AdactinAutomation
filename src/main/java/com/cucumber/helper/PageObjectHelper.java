package com.cucumber.helper;

import org.openqa.selenium.WebDriver;

import com.cucumber.feature.LoginPage;
import com.cucumber.feature.SearchHotelPage;
import com.cucumber.feature.SelectHotelPage;

public class PageObjectHelper {

	public WebDriver driver;

	public PageObjectHelper(WebDriver sdriver) {
		this.driver = sdriver;
	}

	private LoginPage lp;
	private SearchHotelPage sp;
	private SelectHotelPage sh;

	public LoginPage getLp() {
		if (lp == null) {
			lp = new LoginPage(driver);
		}
		return lp;
	}

	public SearchHotelPage getSp() {
		if (sp == null) {
			sp = new SearchHotelPage(driver);
		}
		return sp;
	}

	public SelectHotelPage getSh() {
		if (sh == null) {
			sh = new SelectHotelPage(driver);
		}
		return sh;
	}

}
