Feature: orangeHRM Application Testing
Background:

Scenario: orangeHRm Application LogIn Page Testing
Given user should open a browser on the system
When user enters orangeHRM Application urlAddress
Then user should be able to navigate to orangeHRM application Login Page 
Then user should close the orangeHRM application
@smoke
Scenario Outline: OrangeHRM Application Login functionality with Test Data
Given user should open a browser on the system
When user enters orangeHRM Application urlAddress
Then user should be able to navigate to orangeHRM application Login Page 
Then user should enter "<userName>","<PassWord>" and click on Login button 
Then user should be navigate to homePage
Then user should close the orangeHRM application

Examples:
|userName|PassWord|
|Obul123|Obul@123|
|obul123|obul@123|




