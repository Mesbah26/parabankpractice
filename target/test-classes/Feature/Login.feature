@smoke  @regression @functional 
Feature: Para Bank Registration and login function 

@positive @PAR-5
Scenario: User  Can successfully Registration 
When User can click on Register Link 
And User Enter first Name "MESBAH"
And User Enter last Name "CHOWDHURY"
And User Enter Address "ILFORD"
And User Enter City "London"
And User Enter state "Essex"
And User Enter Zip Code "IG12ZN"
And User Enter Phone Number "07424247888"
And User Enter SSN "123-45-6789"
And User Enter Username "MESBAH_CHY"
And User Enter Password "Dhaka123@"
And User Enter confirm Password "Dhaka123@"
And Click Register button 
Then User should see "Your account was created successfully and You are now logged in"

@positive @PAR-6
Scenario: User can login with valid credentials 
When Enter valid username "MESBAH_CHY"
And Enter Password "Dhaka123@"
And Click login button 
Then User can see the Account Dashboard

@Negative @PAR-7
Scenario: Login should fail with invalid credentials
When Enter invalid username "pitter"
And Enter Valid password "Dhaka123@"
And Click login button 
Then An error message should display "The username and password could not be verified."

@Negative @PAR-8
Scenario: Login should fail with invalid credentials
When Enter valid username "MESBAH_CHY"
And Enter invalid Password "london12345"
And Click login button 
Then An error message should Display "The username and password could not be verified."