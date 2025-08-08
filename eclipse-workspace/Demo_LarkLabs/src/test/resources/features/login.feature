Feature: Login functionality

Scenario: Verify whether the user is able to perform login test cases
Given the user is on the login page
When enter "<username>" in the username field
And enter "<password>" in the password field
And click the submit button
Then should see "<expectedResult>"


Examples:
  | username   | password    | expectedResult                |
  | student    | Password123 | Logged In Successfully        |
  | IncorrectUser| Password123 | Your username is invalid!   |
  | student    | Password12345 | Your password is invalid!   |
  | student    |              | Password should not be blank!   |
  |            | Password123  | UserName should not be blank!   |
  |            |              | Password and UserName should not be blank!   |
  





