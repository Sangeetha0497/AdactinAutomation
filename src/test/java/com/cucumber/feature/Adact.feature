Feature: Adactin HotelApp login functionality of the application

  @TC_101
  Scenario: User needs to To verify valid login details
    Then User needs to Login to the application using username
    And User needs to enter the password
    And User needs to click on login button

  @TC_102
  Scenario: To verify whether the check-out date field accepts a later date than checkin date.
    Then User needs to Login to the application using username
    And User needs to enter the password
    And User needs to click on login button
    Then User needs to Select location as in test data
    And User needs to Select hotel as in test data
    And User needs to Select room type as in test data
    And User needs to Select no-of-rooms as in test data
    And Users needs to Enter check-in-date later than the check- out-date field as in test data
    Then Users needs to Verify that system gives an error saying check-in-date should not be later than check-out-date’.

  @TC_103
  Scenario: To check if error is reported if check-out date field is in the past
    Then User needs to Login to the application using username
    And User needs to enter the password
    And User needs to click on login button
    Then User needs to Select location as in test data
    And User needs to Select hotel as in test data
    And User needs to Select room type as in test data
    And User needs to Select no-of-rooms as in test data
    And User needs to enter check-in-date as today's-5date and check-out-date as today's-3 date
    Then User needs to verify it throws error message after clicking on search

  @TC_104
  Scenario: To verify whether locations in Select Hotel page are displayed according to the location selected in SearchHotel
    Then User needs to Login to the application using username
    And User needs to enter the password
    And User needs to click on login button
    Then User needs to Select location as in test data
    And User needs to Select hotel as in test data
    And User needs to Select room type as in test data
    And User needs to Select no-of-rooms as in test data
    And User needs to enter check-in-date as today's date and check-out-date as today's+1date
    And User needs to Select No-of-adults as in test data
    And User needs to Select No-of-children as in test data
    Then User needs to click on Search button
    Then Verify that hotel displayed is the same as selected in search Hotel form

  @TC_105
  Scenario: To verify whether Check-in date and Check Out date are being displayed in Select Hotel page according to the dates selected in search Hotel.
    Then User needs to Login to the application using username
    And User needs to enter the password
    And User needs to click on login button
    Then User needs to Select location as in test data
    And User needs to Select hotel as in test data
    And User needs to Select room type as in test data
    And User needs to Select no-of-rooms as in test data
    And User needs to enter check-in-date as today's date and check-out-date as today's+1date
    And User needs to Select No-of-adults as in test data
    And User needs to Select No-of-children as in test data
    Then User needs to click on Search button
    Then Verify that check-in- date and check-out- dates are the same as selected in search hotel form.
