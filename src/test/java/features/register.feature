Feature: Register
#newtours.demoaut.com

Scenario Outline: Register
 Given User is in Homepage
 And User clicks register link
 And User inputs First name "<First name>"
 And User inputs Last name "<Last name>"
 And User inputs Phone "<Phone>"
 And User inputs Address1 "<Address1>"
 And User inputs Address2 "<Address2>"
 And User inputs City "<City>"
 And User inputs State "<State>"
 And User inputs Postal Code "<Postal Code>"
 And User selects Country "<Country>"
 And User inputs User "<User>"
 And User inputs Password "<Password>"
 And User inputs Confirms Password "<Confirms Password>"
 When User clicks Submit button
 Then <Result> shows up

 Examples:
  | First name | Last name | Phone      | Email         | Address1   | Address2 | City        | State  | Postal Code  | Country | User  | Password | Confirm Password | Result  |
  | Carlos     | Chavez    | 1541041234 | mail@mail.com | street l0l | a2       | Sumaru City | Kyushu | 1406         | Japan   | fede  | pass     | pass             | Success |
