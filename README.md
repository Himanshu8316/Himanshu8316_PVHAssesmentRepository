# Web Automation Test Suit for https://nl.tommy.com/ 
This Automation test suit has been implemented for web automation using slenium webdriver with Java.
It covers the below E2E scenarios  :
  * Scenario 1: User could see specific errors during registration process.
  * Scenario 2: User Creates Account with valid data.
  * Scenario 3: Registered user can add a new address.

## Pre-requisites :
* Java JDK installed and added to environment variables
* Maven installed and added to environment variables
* Git installed
* Chrome Browser Installed

## Framework Implemented : 
* Cucumber BDD framework has been used to implement the test suit.
* Project contains one feature file(Create_New_Account.feature) which contains the scenarios with test data.
* Project has step defination file which implements the steps mentioned in the feature file.
* Page Ojects kept in separate class.
* Project has a Test Runned file for controlling the run of the test suit.
* Assertions have been used for validations.
* POM.xml contains all the dependencies related to jars and plugins required for implementation.

## Reporting :
* Cucumber html reports has been implemented available in target/cucumber-html-reports folder.
* Html reports provides clear and impressive visual of the latest runs report in terms steps and scenarios status.
* Screenshots have been captured and saved at folder \target\screenshots

## How to run the Test Suit :
 * Step 1 : Clone the repository on the local machine using command on command Prompt: git clone https://github.com/Himanshu8316/Himanshu8316_PVHAssesmentRepository.git
 * Step 2 : Import the project to the eclipse or the any other editor.
 * Step 3 : Update fresh test data (username and password) in feature file in Examples section.
 * Step 4 : Go to the cloned project location in command prompt and rum Maven command : mvn test verify
 * Step 5 : Go to the folder target/cucumber-html-reports/js and check the cucumber html reports.
 * Step 6 : To rerun the Test suit we need to update fresh test data in feature file since the existing usernames will fail the tests.

## Mobile Automation :
Mobile Automation could not be implemented due to limited time window.
