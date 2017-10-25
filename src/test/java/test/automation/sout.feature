Feature: everything
Scenario: souts
Given User has some input: "1"
When User starts cucumber
And User has some input: "1"
Then User sees souts of input

Scenario: souts
Given User has some input: "2"
When User starts cucumber
And User has some input: "2"
Then User sees souts of input

Scenario: souts
Given User has some input: "3"
When User starts cucumber
And User has some input: "3"
Then User sees souts of input
