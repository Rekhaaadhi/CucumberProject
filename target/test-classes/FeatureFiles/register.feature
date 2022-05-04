Feature: To validate Register functionality of Waterstones.com page
Background:
Given User should launch the chrome and load the url and maximize
When User should click on the Signin-Register link

Scenario: Verify user able to click on the Signin/Register link and navigate to Signin/Register form
Then User should be able to see the CREATE NEW ACCOUNT link


Scenario: Verify user is able navigate to Sigin page
And User should click on the CREATE NEW ACCOUNT link
Then User should be navigated to the Signin Page

@smoke
Scenario: Verify user is able to navigate to Registration page 
And User should click on the CREATE NEW ACCOUNT link
And User should click on the Register button in siginpage
Then User should be navigated to the Registraion page

Scenario: Verify user is able to select only one value from the Title dropdown
And User should click on the CREATE NEW ACCOUNT link
And User should click on the Register button in siginpage
Then User can select only one value from the Title dropdown

@smoke
Scenario Outline: Verify user is able to pass any value in the Firstname textbox
And User should click on the CREATE NEW ACCOUNT link
And User should click on the Register button in siginpage
Then User should be able enter values "<fname>" to the firstname text box without any error

Examples:
				|fname|
				|  |
				|@#$|
				|123|
				|abc|
				|a|
				|1|

Scenario Outline: Verify user is able to pass invalid lastname 
And User should click on the CREATE NEW ACCOUNT link
And User should click on the Register button in siginpage
Then User should pass the invalid lastname "<laname>" and gets error

Examples:
			|laname|
			|#@| 
			|1@|
			|a|
			
@sanity
Scenario: Verify user is able to pass valid lastname
And User should click on the CREATE NEW ACCOUNT link
And User should click on the Register button in siginpage
Then User should pass the valid lastname and should not get any error 
     |ab|abc|ab1|

@sanity
Scenario: Verify the user able to pass valid email addresses
And User should click on the CREATE NEW ACCOUNT link
And User should click on the Register button in siginpage
Then User should pass the valid email ids
    |abc123@gmail.com | abc_abcqwe@yu.in |a@you.i|erty.ertg@ty.df|
    

@smoke
Scenario: Verify the user able to pass invalid email addresses
And User should click on the CREATE NEW ACCOUNT link
And User should click on the Register button in siginpage
Then User should pass the invalid email ids and gets error message
    |@drft@gmail.com|ert   123  @ty.yh|123.234@co|@@@@.@@co|@yahoo.in|uhj#$87@a.co|
    

  
Scenario: Verify user is able to enter exactly 10 characters(valid) to the password textbox
And User should click on the CREATE NEW ACCOUNT link
And User should click on the Register button in siginpage
Then User should be able to enter exactly 10 characters without any error
      |abcdefghij|1234567890|abcd1234e5|abcd@12345|!@#$%^&*()|
    
Scenario: Verify user is able to enter exactly 11 characters(valid) to the password textbox
And User should click on the CREATE NEW ACCOUNT link
And User should click on the Register button in siginpage
Then User should be able to enter exactly 11 characters without any error
      |abcdefghijk|12345678901|abcd1234e56|abcd@123456|!@#$%^&*()@|



Scenario: Verify user is able to enter exactly 9 charecters which is invalid to the password textbox
And User should click on the CREATE NEW ACCOUNT link
And User should click on the Register button in siginpage
Then User should pass 9 charecters and gets error
     |abcdefghi|123456789|abcd1234e|abcd@1234|!@#$%^&*(|
 
      
Scenario: Verify confirmpassword accepst only same values as in password textbox for the valid values
And User should click on the CREATE NEW ACCOUNT link
And User should click on the Register button in siginpage
Then User should pass the same value both in password and confirmpassword field wihtout any error
     |pass|abcdefghijk|
     |confirmPass|abcdefghijk|
 



Scenario: Verify confirmpassword does not accepts different values in password and confirmpassword textboxes
And User should click on the CREATE NEW ACCOUNT link
And User should click on the Register button in siginpage
Then User should pass the diff value both in password and confirmpassword field and gets error
     |pass|abcdefghijk|
     |confirmPass|1234516789|

           

    


