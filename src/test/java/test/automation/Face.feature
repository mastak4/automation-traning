# new feature
# Tags: optional
    
Feature: Go to Facebook

Scenario: login with valid accaount

Given User on "Login" page
When User submit login form with valid data


| Fied | Value |

And User submit "Login" button

Then user "Наталья" on home page