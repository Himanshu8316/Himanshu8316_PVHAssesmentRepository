Feature: Create New Account

@CreateNewAccountTest
Scenario Outline: User could see specific errors during registration process
Given User Navigate to home page
When User clicks on Create an Account link
Then User registers without enough information
Then Verify the errors <usernameerror> and <passworderror> and <agreetermserror>
And Close browser

Examples:
|usernameerror	    |passworderror	   |agreetermserror												|
|Vul het veld in	|Vul het veld in   |Bevestig dat je akkoord gaat met de algemene voorwaarden    | 

@CreateNewAccountTest
Scenario Outline: User Creates Account with valid data
Given User Navigate to home page
When User clicks on Create an Account link
Then User enters required data <username> and <password>
Then Verify the user account created successfully <username>
And Close browser

Examples:
|username				|password	|
|test102@gmail.com		|test100	|

@CreateNewAccountTest
Scenario Outline: Registered user can add a new address
Given User Navigate to home page
When User clicks on Signup
Then User enters login data <username> and <password>
Then User adds New Address
And Close browser

Examples:
|username				|password	|
|test102@gmail.com		|test100	|
