@login_feature
Feature: Login
@login_valid_credential @sanity @Weekly 
Scenario: Login with valid credential
Given user visit to login page
When user enter user id
And user enter passowrd
And user click on Sing button
Then user redirect to dashboard
And user can see logout link


@login_with_different_user @performance @quarterly
Scenario Outline: Login with valid credential
Given open the browser
When user enter <user_id>
And user enter <passsword>
And user click on Signin button
And user click on sing in button

Examples:
|user_id||password|
|john||john123|
|alex||alex123|
|Tom||Tom123|
