Feature: login
user logs into the application using id and password.
Scenario: valid login
Given User is on the test me app home page
When the user gives valid login 
And valid password
Then user should be able to login


 
