@Login
Feature: Login

In order to login in TestMe App
As a user
I need to register first

Business rules:
 - Ony registered users can do the login
 - user should provide all the necessary details on registration page
 
To Do:
 -  password should have more than 8 characters 
 

 
 Scenario Outline: user can do the successful login
 Given user is on the login page
 When  user provides the correct credentials "<login>" and "<password>"
 Then  user rendered to TestMeApp home page
 
 Examples:
 |login|password|
 |karthik456@gmail.com|karthik456|
 |yans52@gmail.com|robinson55|