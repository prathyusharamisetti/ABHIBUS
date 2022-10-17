Feature: Booking Bus Tickets in Abhibus website

Scenario: User should be able to open the website and login.
Given I visit the website
When I click on login/Register page from the home page
Then I should enter the Mobile number.
And I should click on login/signup with otp button.

Scenario: user should be able to search the bus and select the seat.
Given I should visit the website.
Then i should enter source and destination.
Then I should select the Date of Journey. 
And then click on Search button.
Then I should select the bus by clicking on drop down.
Then I should click on select Seat.
Then I should select the boarding point and dropping point.
And I should click on Showlayout.
Then I can select the seat.
Then I should click on Continue to payment.
Then I should enter the mobile number.
Then I should enter the email Id and mobile number.
And I should enter passenger details like name and age.
Then I should click on Paynow.