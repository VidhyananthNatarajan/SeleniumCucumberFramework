Feature: Leaftaps Login Test

@smoke
Scenario Outline: TC001 Positive Login Flow
Given Enter the username as <username>
And Enter the Password as <password>
When Click on the Login
Then home page is displayed and Click on Logout

Examples:
|username|password|
|Demosalesmanager|crmsfa|
|DemoCSR|crmsfa|