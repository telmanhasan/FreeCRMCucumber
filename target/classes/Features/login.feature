Feature: Free CRM Login Feature

#without Examples Keyword
#Scenario: Free CRM Login Test Scenario
#
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "telmanhasanov@yahoo.com" and "Bileceri86"
#Then user clicks on login button
#Then user is on home page

#with Examples Keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then close the browser


Examples:
          | username | password |
          | telmanhasanov@yahoo.com | Bileceri86 |
          | ceyran | cuyur |
          

