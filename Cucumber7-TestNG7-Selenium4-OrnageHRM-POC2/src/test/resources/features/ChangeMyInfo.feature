@test1
Feature: Login to HRM Application and click on my info
  I want to use this template for HRM Login page and Click on my infoz

  @MyInfo
  Scenario: Click on my info
    Given User login to HRM application with UserName and Password
      | Admin | admin123 |
		When Click on submit button 
    And Click on MyInfo
    And Logout from HRM application
   
