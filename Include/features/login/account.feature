#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Account
Feature: Login feature
  

  @login_invalid_account
  Scenario: I want to login with invalid account
  	Given I open app
    When I want to type invalid email and password
    And I click login
    Then I see wrong email and password notif
  
  @login_error_email
  Scenario: I want to login invalid email
  	Given I open app
    When  I want to type wrong email
    And I click login
    Then I see wrong email notif
    
	@register_account
  Scenario: I want to register account
  	Given I open app
  	When I click create account
    And I want to fill form
    And I click register
    Then I see success register notif
    #When I click login after register
    #And I want to type invalid email and password
    #And I click login
    #Then I see home header
    
  @register_without_name
  Scenario: I want to register account without name
  	Given I open app
  	When I click create account
    And I want to not fill name form
    And I click register
    Then I see error name notif
    
  @register_invalid_email
  Scenario: I want to register account invalid email
  	Given I open app
  	When I click create account
    And I want to fill invalid email form
    And I click register
    Then I see invalid email notif
    
  @register_invalid_confirm_pass
  Scenario: I want to register account invalid confirm pass
  	Given I open app
  	When I click create account
    And I want to fill wrong confirmation password form
    And I click register
    Then I see wrong confirmation password notif
    
    
    