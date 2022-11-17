Feature: Deal Creatation

Scenario: Free CRM Create a new contact scenario

Given user is already onn Login Page
When title of login page iss Free CRM
Then user enters username and password
| desaibhavin | 911993Sai |
Then user click on login button
Then user is on new home page
Then user moves to new deal page
Then user enters deal details 
| test deal | 1000 | 50 | 10 |
Then Closed the browser
