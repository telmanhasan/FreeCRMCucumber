Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new contact scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user moves to contact page 
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then close the browser

Examples:
         
         | username | password | firstname | lastname | posotion | 
         | telmanhasanov@yahoo.com| Bileceri86 | Tome | Petere | Director |
         | telmanhasanov@yahoo.com| Bileceri86 | David | Aliyev | manager |
