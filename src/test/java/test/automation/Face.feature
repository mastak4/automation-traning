# new feature
# Tags: optional
    
Feature: Go to Facebook

Scenario: login with valid accaount

Given User on "Login" page
When User submit login form with valid data


| Fied | Value |
| email | natalyakulish@gmail.com |
| password |27101989Ok|

And User submit "Login" button

Then user "Наталья" on home page