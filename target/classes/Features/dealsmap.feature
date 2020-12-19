Feature: Deal data creation 

Scenario: Free CRM Create a new dela scenario 

	Given user is already on Login Page 
	When title of login page is Free CRM 
	Then user enters username and password 
		|username | password |
		| telmanhasanov@yahoo.com | Bileceri86 |
	Then user clicks on login button 
	Then user is on home page 
	Then user moves to new deal page 
	Then user enters deal details 
		| title      | amount | probability | commision | 
		| test deal1 | 1500 | 50 | 10 |
		| test deal2 | 2500 | 60 | 20 |
		| test deal3 | 3500 | 70 | 30 |
	Then close the browser