@test
Feature: Login to HRM Application
  I want to use this template for HRM Login page

  Scenario: LoginValidCredentials
    Given User login to HRM application with UserName and Password
      | Admin | admin123 |
    When Click on submit button
    Then validate the URL

  Scenario: LoginWithInvalidCredentials
    Given User login to HRM application with UserName and Password
      | admin | Admin123 |
    When Click on submit button
    Then validate the URL
