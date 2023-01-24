Feature:Validate FacebookLoginHomePage
Scenario Outline:Validate With Valid Username and Password
Given user launch the valid facebook login url
When user enter valid userName "<userName>" and passWord "<passWord>"
And user click the facbook loginButton
Then validation userName and passWord and navigation to user homePage
Examples:
|userName|passWord|
|iloveyou|765fsd|
|imissYou|6d7892|
|tonystark|ggsg8922|
|captainAmercia|d87889s|

