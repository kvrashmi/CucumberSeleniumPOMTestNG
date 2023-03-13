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
@tag
Feature: Login to Techfios application

  Background:
	Given User is on the techfios landing page 
  
  @ValidCredentails
  Scenario: Enter valid username and password 
    Given User enters username as "demo@techfios.com"
    And User enters password as "abc123"
    When User clicks on "login" button
    Then Dashboard page should be displayed
    

  @InvalidCredentials
  Scenario Outline: Enter invalid username and password
    Given User enters username as "<username>"
    And User enters password as "<password>"
    When User clicks on "login" button
    Then User should be able to see an error message

    Examples: 
      | username  | password | 
      | demo@techfios.com | abc | 
      | demo1@techfios.com | abc123 |
