Feature: To validate Search functionality of Waterstones.com page


@smoke
Scenario: Verify user is able to pass the values to the Search textbox and click search button
Given User should launch the chrome and load the url and maximize
And User should pass the value to the search text box
    |You can win|
And User should click search button
Then User should be navigated to the search url



