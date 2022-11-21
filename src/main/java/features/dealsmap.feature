Feature: Deal data creation 

Scenario: Free CRM Create a new deal scenario 

	Given user iss already on Login Page 
	When title off login page is Free CRM 
	Then user enterss username and password 
		| username | password|
		| desaibhavin | 911993Sai |
		
	Then user clickss on login button 
	Then user is onn home page 
	Then user movess to new deal page 
	Then user enters deals details 
		|title       | amount | probability | commission |
		| test deal1 | 1000 | 50 | 10 |
		| test deal2 | 2000 | 60 | 20 |
		| test deal3 | 3000 | 70 | 30 |
		
	Then Closse the browser