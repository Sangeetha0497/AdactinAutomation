package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.cucumber.feature.BaseClassAllMethods;
import com.cucumber.feature.LoginPage;
import com.cucumber.feature.SearchHotelPage;
import com.cucumber.feature.SelectHotelPage;
import com.cucumber.helper.ConfigReader;
import com.cucumber.helper.PageObjectHelper;
import com.cucumber.testrunner.TestRunner;

import cucumber.api.java.en.Then;

public class Stepdefinition extends BaseClassAllMethods {

	public static WebDriver driver = TestRunner.driver;
	public static PageObjectHelper ph = new PageObjectHelper(driver);

	@Then("^User needs to Login to the application using username$")
	public void user_needs_to_Login_to_the_application_using_username() throws Throwable {
		ConfigReader cr=new ConfigReader();
		getUrl(cr.getURL());
		elementIsEnabled(ph.getLp().getUsername());
		inputValuestoElement(ph.getLp().getUsername(), "TestUsername1234");

	}

	@Then("^User needs to enter the password$")
	public void user_needs_to_enter_the_password() throws Throwable {
		elementIsEnabled(ph.getLp().getPassword());
		inputValuestoElement(ph.getLp().getPassword(), "TestUsername@1234");

	}

	@Then("^User needs to click on login button$")
	public void user_needs_to_click_on_login_button() throws Throwable {
		clickOntheElement(ph.getLp().getLoginBtn());
		System.out.println("Logged in successfully");
		// waitForElementVisiblity(lp.getLoginBtn());

	}

	@Then("^User needs to Select location as in test data$")
	public void user_needs_to_Select_location_as_in_test_data() throws Throwable {
		selectOptionInDD(ph.getSp().getLocation(), "visibletext", "Sydney");
		// Assert.assertEquals(sp.getLocation(), "visibletext", "Sydney");
		elementIsSelected(ph.getSp().getLocation());
		String firstOptionInDD = getFirstOptionInDD(ph.getSp().getLocation());
		System.out.println("Hotel Location" + firstOptionInDD);

	}

	@Then("^User needs to Select hotel as in test data$")
	public void user_needs_to_Select_hotel_as_in_test_data() throws Throwable {
		selectOptionInDD(ph.getSp().getHotels(), "value", "Hotel Creek");
		elementIsSelected(ph.getSp().getHotels());
		String firstOptionInDD = getFirstOptionInDD(ph.getSp().getHotels());
		System.out.println("Hotel name" + firstOptionInDD);

	}

	@Then("^User needs to Select room type as in test data$")
	public void user_needs_to_Select_room_type_as_in_test_data() throws Throwable {
		selectOptionInDD(ph.getSp().getRoomType(), "value", "Standard");
		elementIsSelected(ph.getSp().getRoomType());

	}

	@Then("^User needs to Select no-of-rooms as in test data$")
	public void user_needs_to_Select_no_of_rooms_as_in_test_data() throws Throwable {
		SearchHotelPage sp = new SearchHotelPage(driver);
		selectOptionInDD(sp.getNumberOfRooms(), "value", "1");
		elementIsSelected(sp.getNumberOfRooms());

	}

	@Then("^Users needs to Enter check-in-date later than the check- out-date field as in test data$")
	public void users_needs_to_Enter_check_in_date_later_than_the_check_out_date_field_as_in_test_data()
			throws Throwable {
		SearchHotelPage sp = new SearchHotelPage(driver);
		inputValuestoElement(sp.getCheckInDate(), "15/11/2019");
		inputValuestoElement(sp.getCheckOutDate(), "17/11/2019");

	}

	@Then("^Users needs to Verify that system gives an error saying check-in-date should not be later than check-out-date’\\.$")
	public void users_needs_to_Verify_that_system_gives_an_error_saying_check_in_date_should_not_be_later_than_check_out_date()
			throws Throwable {
		SearchHotelPage sp = new SearchHotelPage(driver);
		clickOntheElement(sp.getSearch());
		elementIsDisplayed(sp.getSearch());
		System.out.println("!!!check-in-date should not be later than check-out-date");

	}

	@Then("^User needs to enter check-in-date as today's-(\\d+)date and check-out-date as today's-(\\d+) date$")
	public void user_needs_to_enter_check_in_date_as_today_s_date_and_check_out_date_as_today_s_date(int arg1, int arg2)
			throws Throwable {
		SearchHotelPage sp = new SearchHotelPage(driver);
		inputValuestoElement(sp.getCheckInDate(), "25/11/2019");
		inputValuestoElement(sp.getCheckOutDate(), "23/11/2019");

	}

	@Then("^User needs to verify it throws error message after clicking on search$")
	public void user_needs_to_verify_it_throws_error_message_after_clicking_on_search() throws Throwable {
		throw new Exception("!!Enter Valid dates");
	}

	@Then("^User needs to enter check-in-date as today's date and check-out-date as today's\\+(\\d+)date$")
	public void user_needs_to_enter_check_in_date_as_today_s_date_and_check_out_date_as_today_s_date(int arg1)
			throws Throwable {
		inputValuestoElement(ph.getSp().getCheckInDate(), "20/11/2019");
		inputValuestoElement(ph.getSp().getCheckOutDate(), "21/11/2019");

	}

	@Then("^User needs to Select No-of-adults as in test data$")
	public void user_needs_to_Select_No_of_adults_as_in_test_data() throws Throwable {
		selectOptionInDD(ph.getSp().getNumOfAdults(), "value", "1");
		elementIsSelected(ph.getSp().getNumOfAdults());

	}

	@Then("^User needs to Select No-of-children as in test data$")
	public void user_needs_to_Select_No_of_children_as_in_test_data() throws Throwable {
		selectOptionInDD(ph.getSp().getNumOfChildren(), "visibletext", "- Select Children per Room -");
		elementIsSelected(ph.getSp().getNumOfChildren());
	}

	@Then("^User needs to click on Search button$")
	public void user_needs_to_click_on_Search_button() throws Throwable {
		clickOntheElement(ph.getSp().getSearch());

	}

	@Then("^Verify that hotel displayed is the same as selected in search Hotel form$")
	public void verify_that_hotel_displayed_is_the_same_as_selected_in_search_Hotel_form() throws Throwable {
		String str = getFirstOptionInDD(ph.getSh().getHotelDetails());
		if (str.equalsIgnoreCase("Hotel Creek")) {
			System.out.println(str);

		}

	}

	@Then("^Verify that check-in- date and check-out- dates are the same as selected in search hotel form\\.$")
	public void verify_that_check_in_date_and_check_out_dates_are_the_same_as_selected_in_search_hotel_form()
			throws Throwable {

	}

}
