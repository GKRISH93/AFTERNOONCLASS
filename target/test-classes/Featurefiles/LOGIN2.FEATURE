@newaccount

Feature: To check Login Functions

Background:
Given To open chromeDriver

Scenario:  To pass valid username and valid password
When To pass valid username and password
           #1D Map
|username|blue    |
|email   |blue@123|
|password|123     |
|Numbers |123456  |

Then To click LoginButton

Scenario:  To pass invalid username and invalid password
When To pass invalid username and valid password
           #2D Map
|user  |pass      |numbers|           
|red   |red@123   |123|
|blue  |blue@456  |456|
|orange|orange@789|789|

Then To click LoginButton
